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
		kpi1.setId("PRUEBA1");
		kpi1.setDescripcion("KPI de prueba 1");
		kpi1.setInterpretacion("{0}. Tiempo Promedio. Promedio {1}, Máximo {3}.");
		kpi1.setAcumulador("promedio");

		TipoKPI kpi2 = new TipoKPI();
		kpi2.setId("PRUEBA2");
		kpi2.setDescripcion("KPI de prueba 2");
		kpi2.setInterpretacion("{0}. Tiempo Promedio. Promedio {1}, Máximo {3}.");
		kpi2.setAcumulador("tasa-exito");

		TipoKPI kpi3 = new TipoKPI();
		kpi3.setId("PRUEBA3");
		kpi3.setDescripcion("KPI de prueba 3");
		kpi3.setInterpretacion("{0}. Tiempo Promedio. Promedio {1}, Máximo {3}.");
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
		GeneradorJenkinsBuildsKPI generador = new GeneradorJenkinsBuildsKPI();
		GeneradorKPI config = new GeneradorKPI();
		config.setId("JENKINS");
		config.setDescripcion("Generador Jenkins");
		config.setImplementacion(GeneradorJenkinsBuildsKPI.class.getName());
		Parametros parametros = new Parametros();
		Parametro p = new Parametro();
		p.setNombre(GeneradorJenkins.LLAVE_SERVIDOR_JENKINS);
		p.setValor("http://jenkins-dc.tinet.cl");
		parametros.getParametro().add(p);

		p = new Parametro();
		p.setNombre(GeneradorJenkins.LLAVE_INDICADOR_AUTENTICACION);
		p.setValor("false");
		parametros.getParametro().add(p);

		p = new Parametro();
		p.setNombre(GeneradorJenkins.LLAVE_REGEXP_PROYECTO);
		p.setValor("WOM-Portabilidad.*");
		parametros.getParametro().add(p);

		p = new Parametro();
		p.setNombre(GeneradorJenkins.LLAVE_REGEXP_RAMA);
		p.setValor("(develop)|(master)");
		parametros.getParametro().add(p);

		config.setParametros(parametros);
		generador.inicializar(config);

		Map<String, Collection<AcumuladorAbstracto>> map = generador.calcular(
				kpi1, kpi2, kpi3);

		System.out.println(map);

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
