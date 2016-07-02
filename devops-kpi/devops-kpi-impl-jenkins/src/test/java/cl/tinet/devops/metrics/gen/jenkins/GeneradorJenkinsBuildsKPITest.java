package cl.tinet.devops.metrics.gen.jenkins;

import java.util.Collection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.TestCase;
import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;
import cl.tinet.devops.metrics.gen.GeneradorException;
import cl.tinet.devops.metrics.model.GeneradorKPI;
import cl.tinet.devops.metrics.model.Parametro;
import cl.tinet.devops.metrics.model.Parametros;
import cl.tinet.devops.metrics.model.TipoKPI;

public class GeneradorJenkinsBuildsKPITest extends TestCase {

	private static Logger logger = Logger
			.getLogger(GeneradorJenkinsBuildsKPI.class.getName());

	private GeneradorJenkinsBuildsKPI jenkins;

	private GeneradorKPI config;

	private TipoKPI[] kpis;

	protected void setUp() throws Exception {
		super.setUp();
		jenkins = new GeneradorJenkinsBuildsKPI();
		config = new GeneradorKPI();
		config.setId("ci.jenkins.io");
		config.setDescripcion("Servidor Jenkins público.");
		config.setParametros(crearParametros());
		jenkins.inicializar(config);
		kpis = definirKPIs();
	}

	private TipoKPI[] definirKPIs() {
		AcumuladorAbstracto.registrarAcumulador("promedio",
				AcumuladorTiempoBuildPromedio.class);
		AcumuladorAbstracto.registrarAcumulador("tasa-exito",
				AcumuladorBuildExitosoVsTotal.class);
		AcumuladorAbstracto.registrarAcumulador("tasa-completado",
				AcumuladorBuildCompletadoVsTotal.class);

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
		return new TipoKPI[] { kpi1, kpi2, kpi3 };
	}

	private Parametros crearParametros() {
		Parametros parametros = new Parametros();
		Collection<Parametro> params = parametros.getParametro();
		params.add(crearParametro(GeneradorJenkins.LLAVE_SERVIDOR_JENKINS,
				"http://ci.jenkins.io/"));
		params.add(crearParametro(
				GeneradorJenkins.LLAVE_INDICADOR_AUTENTICACION, "false"));
		return parametros;
	}

	private Parametro crearParametro(String llave, String valor) {
		Parametro p = new Parametro();
		p.setNombre(llave);
		p.setValor(valor);
		return p;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCalcular() {
		try {
			logger.info("Generando calculo de KPIs.");
			Map<String, Collection<AcumuladorAbstracto>> acums = jenkins
					.calcular(kpis);
			logger.info("Validando los resultados.");
			assertNotNull("Los acumuladores no deben ser nulos.", acums);
			assertTrue("Debe retornar algun acumulador.", acums.size() > 0);
			logger.info("Validacion completada exitosamente.");
		} catch (GeneradorException e) {
			logger.log(Level.SEVERE, "Error calculando KPIs.", e);
			fail("Error durante cálculo de KPIs.");
		}
	}
}
