package cl.tinet.devops.metrics.gen.jenkins;

import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;

import com.offbytwo.jenkins.model.BuildResult;
import com.offbytwo.jenkins.model.BuildWithDetails;

public class AcumuladorTiempoBuildPromedio extends AcumuladorAbstracto {

	/**
	 * Versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = 1L;

	private long acumulado;

	private int cantidad;

	public AcumuladorTiempoBuildPromedio(String nombre, String kpi,
			boolean global) {
		super(nombre, kpi, global);
	}

	@Override
	public void acumular(Object item) {
		if (item instanceof BuildWithDetails) {
			BuildWithDetails det = (BuildWithDetails) item;
			if (BuildResult.SUCCESS.equals(det.getResult())
					|| BuildResult.UNSTABLE.equals(det.getResult())) {
				cantidad++;
				acumulado += det.getDuration();
			}
		}
	}

	@Override
	public void acumular(AcumuladorAbstracto item) {
		if (item instanceof AcumuladorTiempoBuildPromedio) {
			AcumuladorTiempoBuildPromedio a = (AcumuladorTiempoBuildPromedio) item;
			cantidad += a.cantidad;
			acumulado += a.acumulado;
		}
	}

	@Override
	public Number calcular() {
		if (cantidad > 0) {
			// Transforma el promedio desde milisegundos a segundos.
			return acumulado / (cantidad * 1000);
		}
		return 0;
	}

	@Override
	public boolean isConDatos() {
		return cantidad > 0;
	}
}
