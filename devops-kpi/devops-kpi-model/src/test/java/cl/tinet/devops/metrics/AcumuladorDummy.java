package cl.tinet.devops.metrics;

import java.util.logging.Level;
import java.util.logging.Logger;

import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;

public class AcumuladorDummy extends AcumuladorAbstracto {

	private static Logger logger = Logger.getLogger(AcumuladorDummy.class
			.getName());

	public AcumuladorDummy(String nombre, String kpi, boolean global) {
		super(nombre, kpi, global);
	}

	@Override
	public void acumular(Object item) {
		logger.log(Level.INFO, "Acumular: {0}", item);
	}

	@Override
	public void acumular(AcumuladorAbstracto item) {
		logger.log(Level.INFO, "Acumular: {0}", item);
	}

	@Override
	public Number calcular() {
		return 1;
	}

	@Override
	public boolean isConDatos() {
		return true;
	}
}
