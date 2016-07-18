package cl.tinet.devops.metrics.gen.bitbucket;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;
import cl.tinet.devops.metrics.gen.bitbucket.model.Pullrequest;
import cl.tinet.devops.metrics.gen.bitbucket.model.Pullrequest.StateEnum;

public class AcumuladorPullrequesRechazado extends AcumuladorAbstracto {

	/**
	 * Versión de la clase para la serialización.
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, Integer> contadores;

	public AcumuladorPullrequesRechazado(String nombre, String kpi,
			boolean global) {
		super(nombre, kpi, global);
		this.contadores = new HashMap<String, Integer>();
	}

	@Override
	public void acumular(Object item) {
		if (item instanceof Pullrequest) {
			Pullrequest pr = (Pullrequest) item;
			if (StateEnum.DECLINED.equals(pr.getState())) {
				String llave = pr.getSource().getBranch().getName();
				int cnt = 0;
				if (contadores.containsKey(llave)) {
					cnt = contadores.get(llave);
				}
				contadores.put(llave, ++cnt);
			}
		}
	}

	@Override
	public void acumular(AcumuladorAbstracto item) {
		if (item instanceof AcumuladorPullrequesRechazado) {
			AcumuladorPullrequesRechazado apr = (AcumuladorPullrequesRechazado) item;
			for (Entry<String, Integer> entry : apr.contadores.entrySet()) {
				int cnt = entry.getValue();
				if (contadores.containsKey(entry.getKey())
						&& (contadores.get(entry.getKey()) > cnt)) {
					cnt = contadores.get(entry.getKey());
				}
				contadores.put(entry.getKey(), cnt);
			}
		}
	}

	@Override
	public Number calcular() {
		return Collections.max(contadores.values());
	}

	@Override
	public boolean isConDatos() {
		return !contadores.isEmpty();
	}
}
