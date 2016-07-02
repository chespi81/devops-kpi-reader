package cl.tinet.devops.metrics;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.TestCase;
import cl.tinet.devops.metrics.gen.GeneradorException;

public class ProcesadorReportesJAXBTest extends TestCase {

	private static Logger logger = Logger
			.getLogger(ProcesadorReportesJAXBTest.class.getName());

	private InputStream config;

	private ProcesadorReportesJAXB procesador;

	protected void setUp() throws Exception {
		super.setUp();
		config = ProcesadorReportesJAXBTest.class
				.getResourceAsStream("/devops-kpi-config.xml");
		procesador = new ProcesadorReportesJAXB();

	}

	protected void tearDown() throws Exception {
		super.tearDown();
		config.close();
	}

	public void testConfigurarInputStream() {
		try {
			procesador.configurar(config);
		} catch (ConfiguracionException ce) {
			logger.log(Level.SEVERE, "Error de configuración.", ce);
			fail(ce.getMessage());
		}
	}

	public void testGenerarOutputStream() {
		try {
			procesador.configurar(config);
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			procesador.generar(os);
			System.out.write(os.toByteArray());
			os.close();
		} catch (GeneradorException | IOException e) {
			logger.log(Level.SEVERE, "Error de configuración.", e);
			fail(e.getMessage());
		} catch (ConfiguracionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
