package cl.tinet.devops.metrics.gen;

import java.util.List;

import cl.tinet.devops.metrics.model.GeneradorKPI;
import cl.tinet.devops.metrics.model.MedicionKPI;
import cl.tinet.devops.metrics.model.TipoKPI;

public interface Generador {

	String getNombre();

	void inicializar(GeneradorKPI config) throws GeneradorException;

	List<MedicionKPI> calcular(TipoKPI kpi) throws GeneradorException;
}
