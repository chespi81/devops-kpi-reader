package cl.tinet.devops.metrics.gen;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AcumuladorDummy extends AcumuladorAbstracto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
