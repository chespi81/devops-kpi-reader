package cl.tinet.devops.metrics.gen.bitbucket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;
import cl.tinet.devops.metrics.gen.AcumuladorException;
import cl.tinet.devops.metrics.gen.GeneradorAbstracto;
import cl.tinet.devops.metrics.gen.GeneradorException;
import cl.tinet.devops.metrics.gen.bitbucket.api.PullrequestsApi;
import cl.tinet.devops.metrics.gen.bitbucket.api.RepositoriesApi;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiClient;
import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedPullrequest;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedRepositories;
import cl.tinet.devops.metrics.gen.bitbucket.model.Pullrequest;
import cl.tinet.devops.metrics.gen.bitbucket.model.Repository;
import cl.tinet.devops.metrics.model.GeneradorKPI;
import cl.tinet.devops.metrics.model.Parametro;
import cl.tinet.devops.metrics.model.TipoKPI;
import cl.tinet.devops.metrics.util.DevOpsUtil;

public class GeneradorBitbucketPullRequestKPI extends GeneradorAbstracto {

	public static final String LLAVE_BASE_URL_API_BITBUCKET = "BASE_URL_API_BITBUCKET";

	public static final String LLAVE_INDICADOR_AUTENTICACION = "INDICADOR_AUTENTICACION";

	public static final String LLAVE_USUARIO_BITBUCKET = "USUARIO_BITBUCKET";

	public static final String LLAVE_PASSWORD_BITBUCKET = "PASSWORD_BITBUCKET";

	public static final String LLAVE_EQUIPO_BITBUCKET = "EQUIPO_BITBUCKET";

	public static final String LLAVE_GRUPO_GLOBAL = "GRUPO_GLOBAL_BITBUCKET";

	public static final String LLAVE_AGRUPAR_POR_REPOSITORIO = "AGRUPAR_POR_REPOSITORIO";

	private static final String GRUPO_GLOBAL_PREDETERMINADO = "GLOBAL";

	private static Logger logger = Logger
			.getLogger(GeneradorBitbucketPullRequestKPI.class.getName());

	private String baseURL;

	private boolean autenticado;

	private String username;

	private String password;

	private String team;

	private String grupoGlobal;

	private boolean agruparPorRepositorio;

	@Override
	public void inicializar(GeneradorKPI config) throws GeneradorException {
		// TODO corregir inicializacion de parametros generales y validacion.
		setNombre(config.getId());
		Map<String, Parametro> parametros = DevOpsUtil.getParametros(config
				.getParametros());
		// TODO Incorporar validaciones.
		baseURL = DevOpsUtil
				.getString(LLAVE_BASE_URL_API_BITBUCKET, parametros);
		autenticado = DevOpsUtil.getBoolean(LLAVE_INDICADOR_AUTENTICACION,
				parametros);
		username = DevOpsUtil.getString(LLAVE_USUARIO_BITBUCKET, parametros);
		password = DevOpsUtil.getString(LLAVE_PASSWORD_BITBUCKET, parametros);
		team = DevOpsUtil.getString(LLAVE_EQUIPO_BITBUCKET, parametros);
		String nombre = DevOpsUtil.getString(LLAVE_GRUPO_GLOBAL, parametros);
		grupoGlobal = GRUPO_GLOBAL_PREDETERMINADO;
		if (nombre != null) {
			grupoGlobal = nombre;
		}
		Boolean agrupar = DevOpsUtil.getBoolean(LLAVE_AGRUPAR_POR_REPOSITORIO,
				parametros);
		if (agrupar != null) {
			agruparPorRepositorio = agrupar;
		}
	}

	private ApiClient getApiClient() {
		ApiClient client = new ApiClient().setBasePath(baseURL);
		if (autenticado) {
			client.setUsername(username);
			client.setPassword(password);
		}
		return client;
	}

	@Override
	public Map<String, Collection<AcumuladorAbstracto>> calcular(
			TipoKPI... kpis) throws GeneradorException {
		Map<String, Collection<AcumuladorAbstracto>> resultado = new HashMap<String, Collection<AcumuladorAbstracto>>();
		try {
			Map<String, AcumuladorAbstracto> cache = new HashMap<String, AcumuladorAbstracto>();
			ApiClient client = getApiClient();
			RepositoriesApi repoAPI = new RepositoriesApi(client);
			int pagina = 0;
			PaginatedRepositories repos = null;
			do {
				repos = repoAPI.repositoriesUsernameGet(team, null, ++pagina);
				Collection<Repository> values = repos.getValues();
				for (Repository repo : values) {
					String llave = repo.getProject().getName();
					if (isAgruparPorRepositorio()) {
						llave = repo.getName();
					}
					if (!resultado.containsKey(llave)) {
						resultado.put(llave,
								new ArrayList<AcumuladorAbstracto>());
					}
					Map<String, AcumuladorAbstracto> acums = procesarRepositorio(
							kpis, repo, client);
					for (AcumuladorAbstracto item : acums.values()) {
						for (TipoKPI kpi : kpis) {
							obtenerAcumulador(kpi, cache, true).acumular(item);
						}
					}
					acumularMediciones(llave, resultado, acums);
				}
			} while (repos.getNext() != null);
			resultado.put(getGrupoGlobal(), cache.values());
		} catch (ApiException ae) {
			throw new GeneradorException("Error generando KPIs de Bitbucket.",
					ae);
		} catch (AcumuladorException ae) {
			throw new GeneradorException(
					"Error acumuladndo KPIs de Bitbucket.", ae);
		}
		logger.log(Level.INFO, "Resultado obtenido: {}.", resultado);
		return resultado;
	}

	private void acumularMediciones(String llave,
			Map<String, Collection<AcumuladorAbstracto>> resultado,
			Map<String, AcumuladorAbstracto> mediciones) {
		Collection<AcumuladorAbstracto> acumuladores = resultado.get(llave);
		if (acumuladores != null) {
			for (AcumuladorAbstracto medicion : acumuladores) {
				String kpi = medicion.getKpi();
				if (mediciones.containsKey(kpi)) {
					mediciones.get(kpi).acumular(medicion);
				} else {
					mediciones.put(kpi, medicion);
				}
			}
		}
		resultado.put(llave, mediciones.values());
	}

	private Map<String, AcumuladorAbstracto> procesarRepositorio(
			TipoKPI[] kpis, Repository repo, ApiClient client)
			throws AcumuladorException, ApiException {
		Map<String, AcumuladorAbstracto> cache = new HashMap<String, AcumuladorAbstracto>();
		PullrequestsApi pra = new PullrequestsApi(client);
		int page = 0;
		PaginatedPullrequest ppr = null;
		String nombre = repo.getName().toLowerCase();
		logger.log(Level.INFO, "Procesando repositorio: {0}.",
				repo.getFullName());
		do {
			ppr = pra.repositoriesUsernameRepoSlugPullrequestsGet(team, nombre,
					"*", ++page);
			Collection<Pullrequest> prs = ppr.getValues();
			logger.log(Level.FINE, "Cantidad de pullrequest: {0}.", prs.size());
			for (Pullrequest pr : prs) {
				for (TipoKPI kpi : kpis) {
					obtenerAcumulador(kpi, cache).acumular(pr);
				}
			}
		} while (ppr.getNext() != null);
		logger.log(Level.FINE, "Fin de procesamiento repositorio: {0}.",
				repo.getFullName());
		return cache;
	}

	public boolean isAgruparPorRepositorio() {
		return agruparPorRepositorio;
	}

	public String getGrupoGlobal() {
		return grupoGlobal;
	}
}
