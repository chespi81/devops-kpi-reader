package cl.tinet.devops.metrics.gen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import cl.tinet.devops.metrics.model.GeneradorKPI;
import cl.tinet.devops.metrics.model.Parametro;
import cl.tinet.devops.metrics.model.TipoKPI;

public class GeneradorDummy extends GeneradorAbstracto {

	private static Logger logger = Logger.getLogger(GeneradorDummy.class
			.getName());

	@Override
	public void inicializar(GeneradorKPI config) throws GeneradorException {
		logger.info("Configurando generador.");
		logger.log(Level.INFO, "Generador     : {0}", config.getNombre());
		logger.log(Level.INFO, "Implementacion: {0}",
				config.getImplementacion());
		for (Parametro parametro : config.getParametros().getParametro()) {
			logger.log(Level.INFO, "Parametro: {0}/{1}", new Object[] {
					parametro.getNombre(), parametro.getValor() });
		}
	}

	@Override
	public Map<String, Collection<AcumuladorAbstracto>> calcular(
			TipoKPI... kpis) throws GeneradorException {
		Map<String, Collection<AcumuladorAbstracto>> acumsMap = new HashMap<String, Collection<AcumuladorAbstracto>>();
		Collection<AcumuladorAbstracto> acums = new ArrayList<AcumuladorAbstracto>();
		for (TipoKPI kpi : kpis) {
			logger.log(Level.INFO, "KPI: {0}/{1}",
					new Object[] { kpi.getNombre(), kpi.getAcumulador() });
			for (int i = 0; i < 14; i++) {
				Map<String, AcumuladorAbstracto> cache = new HashMap<String, AcumuladorAbstracto>();
				try {
					AcumuladorAbstracto a = obtenerAcumulador(kpi, cache);
					a.acumular(1);
					acums.add(a);
				} catch (AcumuladorException e) {
					throw new GeneradorException("Error generando reporte.", e);
				}
				acumsMap.put("proyecto-" + i, acums);
			}
		}
		acumsMap.put("GLOBAL", acums);
		return acumsMap;
	}
}
