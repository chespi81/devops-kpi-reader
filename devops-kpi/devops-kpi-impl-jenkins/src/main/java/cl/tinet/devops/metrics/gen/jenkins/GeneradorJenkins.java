package cl.tinet.devops.metrics.gen.jenkins;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.regex.Pattern;

import cl.tinet.devops.metrics.gen.GeneradorAbstracto;
import cl.tinet.devops.metrics.gen.GeneradorException;
import cl.tinet.devops.metrics.gen.ParametroRequeridoException;
import cl.tinet.devops.metrics.model.GeneradorKPI;
import cl.tinet.devops.metrics.model.Parametro;
import cl.tinet.devops.metrics.util.DevOpsUtil;

import com.offbytwo.jenkins.JenkinsServer;

public abstract class GeneradorJenkins extends GeneradorAbstracto {

	public static final String LLAVE_SERVIDOR_JENKINS = "SERVIDOR_JENKINS";

	public static final String LLAVE_INDICADOR_AUTENTICACION = "INDICADOR_AUTENTICACION";

	public static final String LLAVE_USUARIO_JENKINS = "USUARIO_JENKINS";

	public static final String LLAVE_PASSWORD_JENKINS = "PASSWORD_JENKINS";

	public static final String LLAVE_REGEXP_PROYECTO = "REGEXP_PROYECTO";

	public static final String LLAVE_REGEXP_RAMA = "REGEXP_RAMA";

	public static final String LLAVE_GRUPO_GLOBAL = "GRUPO_GLOBAL";

	public static final String VALOR_GRUPO_GLOBAL_PREDETERMINADO = "GLOBALES";

	private String servidor;

	private boolean autenticado = true;

	private String username;

	private String password;

	private String ramaRegExp;

	private String proyectoRegExp;

	private String grupoGlobal = VALOR_GRUPO_GLOBAL_PREDETERMINADO;

	public String getGrupoGlobal() {
		return grupoGlobal;
	}

	public void inicializar(GeneradorKPI config) throws GeneradorException {
		Map<String, Parametro> parametros = DevOpsUtil.getParametros(config
				.getParametros());
		setNombre(config.getNombre());
		servidor = DevOpsUtil.getString(LLAVE_SERVIDOR_JENKINS, parametros);
		if (servidor == null) {
			throw new ParametroRequeridoException(LLAVE_SERVIDOR_JENKINS);
		}
		Boolean valor = DevOpsUtil.getBoolean(LLAVE_INDICADOR_AUTENTICACION,
				parametros);
		if (valor != null) {
			autenticado = valor.booleanValue();
		}
		if (autenticado) {
			username = DevOpsUtil.getString(LLAVE_USUARIO_JENKINS, parametros);
			password = DevOpsUtil.getString(LLAVE_PASSWORD_JENKINS, parametros);
			if (username == null) {
				throw new ParametroRequeridoException(LLAVE_USUARIO_JENKINS);
			}
			if (password == null) {
				throw new ParametroRequeridoException(LLAVE_PASSWORD_JENKINS);
			}
		}
		proyectoRegExp = DevOpsUtil
				.getString(LLAVE_REGEXP_PROYECTO, parametros);
		ramaRegExp = DevOpsUtil.getString(LLAVE_REGEXP_RAMA, parametros);
	}

	public JenkinsServer getJenkinsServer() throws URISyntaxException {
		JenkinsServer server = null;
		URI uri = new URI(servidor);
		if (autenticado) {
			server = new JenkinsServer(uri, username, password);
		} else {
			server = new JenkinsServer(uri);
		}
		return server;
	}

	public boolean contabilizarProyecto(String proyecto) {
		boolean result = true;
		if (proyectoRegExp != null) {
			result = Pattern.matches(proyectoRegExp, proyecto);
		}
		return result;
	}

	public boolean contabilizarRama(String rama) {
		boolean result = true;
		if (ramaRegExp != null) {
			result = Pattern.matches(ramaRegExp, rama);
		}
		return result;
	}
}
