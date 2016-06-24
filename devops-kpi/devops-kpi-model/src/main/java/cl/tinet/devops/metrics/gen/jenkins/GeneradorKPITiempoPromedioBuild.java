package cl.tinet.devops.metrics.gen.jenkins;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import cl.tinet.devops.metrics.gen.GeneradorException;
import cl.tinet.devops.metrics.model.GeneradorKPI;
import cl.tinet.devops.metrics.model.MedicionKPI;
import cl.tinet.devops.metrics.model.Parametro;
import cl.tinet.devops.metrics.model.Parametros;
import cl.tinet.devops.metrics.model.TipoKPI;
import cl.tinet.devops.metrics.model.UmbralKPI;

import com.google.common.base.Optional;
import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Build;
import com.offbytwo.jenkins.model.BuildResult;
import com.offbytwo.jenkins.model.BuildWithDetails;
import com.offbytwo.jenkins.model.FolderJob;
import com.offbytwo.jenkins.model.Job;
import com.offbytwo.jenkins.model.JobWithDetails;

public class GeneradorKPITiempoPromedioBuild extends GeneradorJenkins {

	public List<MedicionKPI> calcular(TipoKPI kpi) throws GeneradorException {
		List<MedicionKPI> mediciones = new ArrayList<MedicionKPI>();
		try {
			JenkinsServer server = getJenkinsServer();
			Acumulador global = new Acumulador("Global");
			Map<String, Job> proyectos = server.getJobs();
			for (Entry<String, Job> entry : proyectos.entrySet()) {
				Acumulador subtotal = calcular(kpi, null, entry.getValue(),
						server);
				global.agregar(subtotal);
				mediciones.add(construirMedicion(kpi, subtotal));
			}
			mediciones.add(construirMedicion(kpi, global));
		} catch (URISyntaxException use) {
			throw new GeneradorException(
					"Error en la URL del servidor Jenkins.", use);
		} catch (IOException ioe) {
			throw new GeneradorException(
					"Error en comunicacion con el servidor Jenkins.", ioe);
		} catch (DatatypeConfigurationException dtce) {
			throw new GeneradorException(
					"Error interno generando KPIs Jenkins.", dtce);
		}
		return mediciones;
	}

	private MedicionKPI construirMedicion(TipoKPI kpi, Acumulador acumulador)
			throws DatatypeConfigurationException {
		XMLGregorianCalendar calendar = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(new GregorianCalendar());
		int promedio = (int) acumulador.getPromedio();
		int segundos = promedio / 1000;
		int minutos = segundos / 60;
		segundos = segundos % 60;
		String descripcion = MessageFormat.format(kpi.getDescripcion(),
				acumulador.getNombre(), minutos + " minuto(s) " + segundos
						+ " segundo(s)", kpi.getMinimo(), kpi.getMaximo());
		System.out.println(descripcion);
		MedicionKPI medicion = new MedicionKPI();
		medicion.setNombre(kpi.getNombre());
		medicion.setDescripcion(descripcion);
		medicion.setFecha(calendar);
		medicion.setValor(promedio);
		return medicion;
	}

	private Acumulador calcular(TipoKPI kpi, FolderJob parent, Job job,
			JenkinsServer server) throws IOException,
			DatatypeConfigurationException {
		Acumulador total = new Acumulador(job.getName());
		Optional<FolderJob> wJob = server.getFolderJob(job);
		if (wJob.isPresent()) {
			FolderJob folder = wJob.get();
			Map<String, Job> proyectos = folder.getJobs();
			for (Entry<String, Job> entry : proyectos.entrySet()) {
				total.agregar(calcular(kpi, folder, entry.getValue(), server));
			}
		} else {
			JobWithDetails jd = null;
			if (parent != null) {
				jd = server.getJob(parent, job.getName());
			} else {
				jd = server.getJob(job.getName());
			}
			List<Build> builds = jd.getBuilds();
			for (Build build : builds) {
				BuildWithDetails bd = build.details();
				// Sólo se contabiliza el tiempo de los builds completados.
				if (BuildResult.SUCCESS.equals(bd.getResult())
						|| BuildResult.UNSTABLE.equals(bd.getResult())) {
					total.agregar(bd.getDuration());
				}
			}
		}
		return total;
	}

	public static void main(String[] args) throws GeneradorException {
		TipoKPI kpi = new TipoKPI();
		kpi.setNombre("PRUEBA");
		kpi.setDescripcion("{0}. Tiempo Promedio. Promedio {1}, Máximo {3}.");
		kpi.setGlobal(true);
		kpi.setProyecto(true);
		kpi.setDesarrollador(false);
		UmbralKPI umbral = new UmbralKPI();
		umbral.setDescripcion("Maximo");
		umbral.setValor(600000);
		kpi.setMaximo(umbral);
		GeneradorKPITiempoPromedioBuild generador = new GeneradorKPITiempoPromedioBuild();
		GeneradorKPI config = new GeneradorKPI();
		config.setNombre("JENKINS");
		config.setImplementacion(GeneradorKPITiempoPromedioBuild.class
				.getName());
		Parametros parametros = new Parametros();
		Parametro p = new Parametro();
		p.setNombre(GeneradorJenkins.LLAVE_SERVIDOR_JENKINS);
		p.setValor("http://10.7.3.5:8080");
		// p.setValor("http://jenkins.tinet.cl");
		parametros.getParametro().add(p);

		p = new Parametro();
		p.setNombre(GeneradorJenkins.LLAVE_INDICADOR_AUTENTICACION);
		p.setValor("true");
		parametros.getParametro().add(p);

		p = new Parametro();
		p.setNombre(GeneradorJenkins.LLAVE_USUARIO_JENKINS);
		p.setValor("rsanmartin");
		parametros.getParametro().add(p);

		p = new Parametro();
		p.setNombre(GeneradorJenkins.LLAVE_PASSWORD_JENKINS);
		p.setValor("Lenovo8159");
		parametros.getParametro().add(p);

		config.setParametros(parametros);
		generador.inicializar(config);

		List<MedicionKPI> mediciones = generador.calcular(kpi);
		for (MedicionKPI medicion : mediciones) {
			System.out.println(medicion.getDescripcion());
		}
	}
}
