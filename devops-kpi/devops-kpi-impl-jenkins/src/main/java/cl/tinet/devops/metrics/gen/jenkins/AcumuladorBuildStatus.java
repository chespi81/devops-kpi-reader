package cl.tinet.devops.metrics.gen.jenkins;

import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;

import com.offbytwo.jenkins.model.BuildWithDetails;

public abstract class AcumuladorBuildStatus extends AcumuladorAbstracto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int contador;

	private int acumulador;

	public AcumuladorBuildStatus(String nombre, boolean global) {
		super(nombre, global);
	}

	public abstract boolean isRegistrable(BuildWithDetails det);

	@Override
	public void acumular(Object item) {
		if (item instanceof BuildWithDetails) {
			BuildWithDetails det = (BuildWithDetails) item;
			contador++;
			if (isRegistrable(det)) {
				acumulador++;
			}
		}
	}

	@Override
	public void acumular(AcumuladorAbstracto item) {
		if (item instanceof AcumuladorBuildStatus) {
			AcumuladorBuildStatus a = (AcumuladorBuildStatus) item;
			contador += a.contador;
			acumulador += a.acumulador;
		}
	}

	@Override
	public Number calcular() {
		return acumulador;
	}

	@Override
	public boolean isConDatos() {
		return (contador > 0);
	}
}
