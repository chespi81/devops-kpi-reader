package cl.tinet.devops.metrics.gen.jenkins;

import java.util.List;

import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;

import com.offbytwo.jenkins.model.BuildResult;
import com.offbytwo.jenkins.model.BuildWithDetails;

public abstract class AcumuladorBuildStatusVsTotal extends AcumuladorAbstracto {

	/**
	 * Versión de la clsae para la serialización.
	 */
	private static final long serialVersionUID = 1L;

	private int considerados;

	private int totales;

	public AcumuladorBuildStatusVsTotal(String nombre, String kpi,
			boolean global) {
		super(nombre, kpi, global);
	}

	public abstract List<BuildResult> getResults();

	@Override
	public void acumular(Object item) {
		if (item instanceof BuildWithDetails) {
			BuildWithDetails det = (BuildWithDetails) item;
			if (getResults().contains(det.getResult())) {
				considerados++;
			}
			totales++;
		}
	}

	@Override
	public void acumular(AcumuladorAbstracto item) {
		if (item instanceof AcumuladorBuildStatusVsTotal) {
			AcumuladorBuildStatusVsTotal a = (AcumuladorBuildStatusVsTotal) item;
			considerados += a.considerados;
			totales += a.totales;
		}
	}

	@Override
	public Number calcular() {
		if (totales > 0) {
			return considerados / (double) totales;
		}
		return 0;
	}

	@Override
	public boolean isConDatos() {
		return totales > 0;
	}
}
