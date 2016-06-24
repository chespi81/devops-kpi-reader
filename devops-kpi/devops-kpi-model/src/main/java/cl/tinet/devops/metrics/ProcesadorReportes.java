package cl.tinet.devops.metrics;

import java.util.List;

import cl.tinet.devops.metrics.model.ConfiguracionGeneral;
import cl.tinet.devops.metrics.model.ReporteGenerado;

public class ProcesadorReportes {

	public List<ReporteGenerado> generarReportes(ConfiguracionGeneral config) {
		config.getGeneradores();
		return null;
	}
}
