package cl.tinet.devops.metrics.gen;

import java.util.Map;

import cl.tinet.devops.metrics.model.TipoKPI;

public abstract class GeneradorAbstracto implements Generador {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public AcumuladorAbstracto obtenerAcumulador(TipoKPI kpi,
			Map<String, AcumuladorAbstracto> cache) throws AcumuladorException {
		return obtenerAcumulador(kpi, cache, false);
	}

	public AcumuladorAbstracto obtenerAcumulador(TipoKPI kpi,
			Map<String, AcumuladorAbstracto> cache, boolean global)
			throws AcumuladorException {
		String llave = kpi.getNombre();
		AcumuladorAbstracto acumulador = cache.get(llave);
		if (acumulador == null) {
			acumulador = AcumuladorAbstracto.obtenerAcumulador(
					kpi.getAcumulador(), kpi.getNombre(), global);
			cache.put(llave, acumulador);
		}
		return acumulador;
	}
}
