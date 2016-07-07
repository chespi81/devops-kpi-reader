package cl.tinet.devops.metrics.gen.jenkins;

import com.offbytwo.jenkins.model.BuildWithDetails;

public class AcumuladorTotalBuilds extends AcumuladorBuildStatus {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AcumuladorTotalBuilds(String nombre, String kpi, boolean global) {
		super(nombre, kpi, global);
	}

	@Override
	public boolean isRegistrable(BuildWithDetails det) {
		if (det != null) {
			return !det.isBuilding();
		}
		return false;
	}
}
