package cl.tinet.devops.metrics.gen.jenkins;

import java.util.ArrayList;
import java.util.List;

import com.offbytwo.jenkins.model.BuildResult;

public class AcumuladorBuildExitosoVsTotal extends AcumuladorBuildStatusVsTotal {

	/**
	 * Versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = 1L;

	public AcumuladorBuildExitosoVsTotal(String nombre, String kpi,
			boolean global) {
		super(nombre, kpi, global);
	}

	@Override
	public List<BuildResult> getResults() {
		List<BuildResult> results = new ArrayList<BuildResult>();
		results.add(BuildResult.SUCCESS);
		return results;
	}
}
