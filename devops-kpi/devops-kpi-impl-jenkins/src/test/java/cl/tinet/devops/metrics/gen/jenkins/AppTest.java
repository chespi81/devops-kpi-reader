package cl.tinet.devops.metrics.gen.jenkins;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;
import cl.tinet.devops.metrics.gen.GeneradorException;
import cl.tinet.devops.metrics.model.GeneradorKPI;
import cl.tinet.devops.metrics.model.Parametro;
import cl.tinet.devops.metrics.model.Parametros;
import cl.tinet.devops.metrics.model.TipoKPI;
import cl.tinet.devops.metrics.model.UmbralKPI;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	public static void main(String[] args) throws GeneradorException {
		TipoKPI kpi1 = new TipoKPI();
		kpi1.setNombre("PRUEBA1");
		kpi1.setDescripcion("{0}. Tiempo Promedio. Promedio {1}, Máximo {3}.");
		kpi1.setGlobal(true);
		kpi1.setProyecto(true);
		kpi1.setAcumulador("promedio");
		kpi1.setDesarrollador(false);

		TipoKPI kpi2 = new TipoKPI();
		kpi2.setNombre("PRUEBA2");
		kpi2.setDescripcion("{0}. Tiempo Promedio. Promedio {1}, Máximo {3}.");
		kpi2.setGlobal(true);
		kpi2.setProyecto(true);
		kpi2.setDesarrollador(false);
		kpi2.setAcumulador("tasa-exito");

		TipoKPI kpi3 = new TipoKPI();
		kpi3.setNombre("PRUEBA3");
		kpi3.setDescripcion("{0}. Tiempo Promedio. Promedio {1}, Máximo {3}.");
		kpi3.setGlobal(true);
		kpi3.setProyecto(true);
		kpi3.setDesarrollador(false);
		kpi3.setAcumulador("tasa-completado");

		AcumuladorAbstracto.registrarAcumulador("promedio",
				AcumuladorTiempoBuildPromedio.class);
		AcumuladorAbstracto.registrarAcumulador("tasa-exito",
				AcumuladorBuildExitosoVsTotal.class);
		AcumuladorAbstracto.registrarAcumulador("tasa-completado",
				AcumuladorBuildCompletadoVsTotal.class);

		UmbralKPI umbral = new UmbralKPI();
		umbral.setDescripcion("Maximo");
		umbral.setValor(600000);
		kpi1.setMaximo(umbral);
		System.out.println("#######################");
		GeneradorJenkinsBuildsKPI generador = new GeneradorJenkinsBuildsKPI();
		GeneradorKPI config = new GeneradorKPI();
		config.setNombre("JENKINS");
		config.setImplementacion(GeneradorJenkinsBuildsKPI.class.getName());
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

		// p = new Parametro();
		// p.setNombre(GeneradorJenkins.LLAVE_REGEXP_PROYECTO);
		// p.setValor("WOM-Portabilidad-Ejecutiva.*");
		// parametros.getParametro().add(p);

		p = new Parametro();
		p.setNombre(GeneradorJenkins.LLAVE_REGEXP_RAMA);
		p.setValor("(develop)|(master)");
		parametros.getParametro().add(p);

		config.setParametros(parametros);
		generador.inicializar(config);

		Map<String, Collection<AcumuladorAbstracto>> map = generador.calcular(
				kpi1, kpi2, kpi3);
		TipoKPI[] kpis = { kpi1, kpi2, kpi3 };
		for (Entry<String, Collection<AcumuladorAbstracto>> entry : map
				.entrySet()) {
			System.out.print(entry.getKey());
			for (TipoKPI kpi : kpis) {
				for (AcumuladorAbstracto a : entry.getValue()) {
					if (kpi.getAcumulador().equals(a.getNombre())) {
						System.out.print("|" + a.calcular());
					}
				}
			}
			System.out.println();
		}
	}
}
