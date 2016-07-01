package cl.tinet.devops.metrics.gen.jenkins;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

	public Map<String, Collection<AcumuladorAbstracto>> calcular(
			TipoKPI... kpis) throws GeneradorException {
		Map<String, Collection<AcumuladorAbstracto>> acumuladores = new HashMap<String, Collection<AcumuladorAbstracto>>();
		try {
			JenkinsServer server = getJenkinsServer();
			Map<String, Job> proyectos = server.getJobs();
			Map<String, AcumuladorAbstracto> global = new HashMap<String, AcumuladorAbstracto>();
			for (Entry<String, Job> entry : proyectos.entrySet()) {
				if (contabilizarProyecto(entry.getKey())) {
					Map<String, AcumuladorAbstracto> datos = procesarProyecto(
							kpis, null, entry.getValue(), server);
					acumuladores.put(entry.getKey(), datos.values());
					for (TipoKPI kpi : kpis) {
						obtenerAcumulador(kpi, global, true).acumular(
								datos.get(kpi.getNombre()));
					}
				}
			}
			acumuladores.put("GLOBALES", global.values());
		} catch (URISyntaxException use) {
			throw new GeneradorException(
					"Error en la URL del servidor Jenkins.", use);
		} catch (IOException ioe) {
			throw new GeneradorException(
					"Error en comunicacion con el servidor Jenkins.", ioe);
		} catch (AcumuladorException ae) {
			throw new GeneradorException("Error generando KPIs.", ae);
		}
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
						AcumuladorAbstracto item = map.get(kpi.getNombre());
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
