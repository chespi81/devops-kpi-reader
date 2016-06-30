package cl.tinet.devops.metrics.gen;

import java.util.Collection;
import java.util.Map;

import cl.tinet.devops.metrics.model.GeneradorKPI;
import cl.tinet.devops.metrics.model.TipoKPI;

public interface Generador {

	String getNombre();

	void inicializar(GeneradorKPI config) throws GeneradorException;

	Map<String, Collection<AcumuladorAbstracto>> calcular(TipoKPI... kpis)
			throws GeneradorException;
}
