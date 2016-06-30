package cl.tinet.devops.metrics.gen.jenkins;

import com.offbytwo.jenkins.model.BuildResult;
import com.offbytwo.jenkins.model.BuildWithDetails;

public class AcumuladorBuildExitoso extends AcumuladorBuildStatus {

	/**
	 * Versión de la clase para serialización.
	 */
	private static final long serialVersionUID = 1L;

	public AcumuladorBuildExitoso(String nombre, boolean global) {
		super(nombre, global);
	}

	@Override
	public boolean isRegistrable(BuildWithDetails det) {
		if (det == null) {
			return false;
		}
		return BuildResult.SUCCESS.equals(det.getResult());
	}
}
