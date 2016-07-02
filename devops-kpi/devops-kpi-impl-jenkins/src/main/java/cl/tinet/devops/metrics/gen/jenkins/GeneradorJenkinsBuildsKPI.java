package cl.tinet.devops.metrics.gen.jenkins;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;
import cl.tinet.devops.metrics.gen.AcumuladorException;
import cl.tinet.devops.metrics.gen.GeneradorException;
import cl.tinet.devops.metrics.model.TipoKPI;

import com.google.common.base.Optional;
import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Build;
import com.offbytwo.jenkins.model.FolderJob;
import com.offbytwo.jenkins.model.Job;
import com.offbytwo.jenkins.model.JobWithDetails;

public class GeneradorJenkinsBuildsKPI extends GeneradorJenkins {

	private static Logger logger = Logger
			.getLogger(GeneradorJenkinsBuildsKPI.class.getName());

	public Map<String, Collection<AcumuladorAbstracto>> calcular(
			TipoKPI... kpis) throws GeneradorException {
		logger.fine("Iniciando cálculo de acumuladores.");
		Map<String, Collection<AcumuladorAbstracto>> acumuladores = new HashMap<String, Collection<AcumuladorAbstracto>>();
		try {
			JenkinsServer server = getJenkinsServer();
			Map<String, Job> proyectos = server.getJobs();
			logger.log(Level.INFO, "Cantidad de proyectos a obtenidos: {0}.",
					proyectos.size());
			Map<String, AcumuladorAbstracto> global = new HashMap<String, AcumuladorAbstracto>();
			for (Entry<String, Job> entry : proyectos.entrySet()) {
				String proyecto = entry.getKey();
				if (contabilizarProyecto(proyecto)) {
					logger.log(Level.INFO, "Analizando proyecto {0}.", proyecto);
					Map<String, AcumuladorAbstracto> datos = procesarProyecto(
							kpis, null, entry.getValue(), server);
					acumuladores.put(proyecto, datos.values());
					logger.fine("Generando KPIs globales.");
					for (TipoKPI kpi : kpis) {
						obtenerAcumulador(kpi, global, true).acumular(
								datos.get(kpi.getId()));
					}
				} else {
					logger.log(Level.INFO, "No se analiza proyecto {0}.",
							proyecto);
				}
			}
			logger.log(Level.FINE, "KPIs globales generador: {0}.",
					global.size());
			acumuladores.put(getGrupoGlobal(), global.values());
		} catch (URISyntaxException use) {
			logger.log(Level.SEVERE, "Error en la URL del servidor Jenkins.",
					use);
			throw new GeneradorException(
					"Error en la URL del servidor Jenkins.", use);
		} catch (IOException ioe) {
			logger.log(Level.SEVERE,
					"Error en comunicacion con el servidor Jenkins.", ioe);
			throw new GeneradorException(
					"Error en comunicacion con el servidor Jenkins.", ioe);
		} catch (AcumuladorException ae) {
			logger.log(Level.SEVERE, "Error generando KPIs.", ae);
			throw new GeneradorException("Error generando KPIs.", ae);
		}
		logger.log(Level.FINE,
				"Cálculo de acumuladores finalizado. Cantidad: {0}",
				acumuladores.size());
		return acumuladores;
	}

	private Map<String, AcumuladorAbstracto> procesarProyecto(TipoKPI[] kpis,
			FolderJob parent, Job proyecto, JenkinsServer server)
			throws IOException, AcumuladorException {
		Map<String, AcumuladorAbstracto> cache = new HashMap<String, AcumuladorAbstracto>();
		Optional<FolderJob> opt = server.getFolderJob(proyecto);
		if (opt.isPresent()) {
			Map<String, Job> jobs = opt.get().getJobs();
			for (Entry<String, Job> entry : jobs.entrySet()) {
				if (contabilizarRama(entry.getKey())) {
					Map<String, AcumuladorAbstracto> map = procesarProyecto(
							kpis, opt.get(), entry.getValue(), server);
					for (TipoKPI kpi : kpis) {
						AcumuladorAbstracto item = map.get(kpi.getId());
						obtenerAcumulador(kpi, cache).acumular(item);
					}
				}
			}
		} else {
			JobWithDetails jd = null;
			if (parent != null) {
				jd = server.getJob(parent, proyecto.getName());
			} else {
				jd = server.getJob(proyecto.getName());
			}
			List<Build> builds = jd.getBuilds();
			for (Build build : builds) {
				for (TipoKPI kpi : kpis) {
					obtenerAcumulador(kpi, cache).acumular(build.details());
				}
			}
		}
		return cache;
	}
}
