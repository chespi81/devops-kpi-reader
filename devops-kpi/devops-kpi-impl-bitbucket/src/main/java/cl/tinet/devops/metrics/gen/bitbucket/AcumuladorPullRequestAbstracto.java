package cl.tinet.devops.metrics.gen.bitbucket;

import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;
import cl.tinet.devops.metrics.gen.bitbucket.model.Pullrequest;

public abstract class AcumuladorPullRequestAbstracto extends AcumuladorAbstracto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int cantidad;

	public AcumuladorPullRequestAbstracto(String nombre, String kpi, boolean global) {
		super(nombre, kpi, global);
	}

	@Override
	public void acumular(Object item) {
		if (item instanceof Pullrequest) {
			Pullrequest pr = (Pullrequest) item;
			if (isContabilizable(pr)) {
				cantidad++;
			}
		}
	}

	@Override
	public void acumular(AcumuladorAbstracto item) {
		if (item instanceof AcumuladorPullRequestAbstracto) {
			AcumuladorPullRequestAbstracto a = (AcumuladorPullRequestAbstracto) item;
			cantidad += a.cantidad;
		}
	}

	@Override
	public Number calcular() {
		return cantidad;
	}

	@Override
	public boolean isConDatos() {
		return true;
	}

	public abstract boolean isContabilizable(Pullrequest request);
}
