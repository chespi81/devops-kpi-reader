package cl.tinet.devops.metrics.gen.jenkins;

import com.offbytwo.jenkins.model.BuildResult;
import com.offbytwo.jenkins.model.BuildWithDetails;

public class AcumuladorBuildInestable extends AcumuladorBuildStatus {

	/**
	 * Versión de la clase para serialización.
	 */
	private static final long serialVersionUID = 1L;

	public AcumuladorBuildInestable(String nombre, String kpi, boolean global) {
		super(nombre, kpi, global);
	}

	@Override
	public boolean isRegistrable(BuildWithDetails det) {
		if (det == null) {
			return false;
		}
		return BuildResult.UNSTABLE.equals(det.getResult());
	}
}
