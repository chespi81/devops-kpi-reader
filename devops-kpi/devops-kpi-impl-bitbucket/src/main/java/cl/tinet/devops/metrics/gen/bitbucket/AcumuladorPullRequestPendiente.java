package cl.tinet.devops.metrics.gen.bitbucket;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import cl.tinet.devops.metrics.gen.bitbucket.model.Pullrequest;
import cl.tinet.devops.metrics.gen.bitbucket.model.Pullrequest.StateEnum;

public class AcumuladorPullRequestPendiente extends
		AcumuladorPullRequestAbstracto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger
			.getLogger(AcumuladorPullRequestPendiente.class.getName());

	public AcumuladorPullRequestPendiente(String nombre, String kpi,
			boolean global) {
		super(nombre, kpi, global);
	}

	@Override
	public boolean isContabilizable(Pullrequest request) {
		boolean resultado = false;
		if (StateEnum.OPEN.equals(request.getState())) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
			try {
				Date creacion = df.parse(request.getCreatedOn());
				Calendar ahora = Calendar.getInstance();
				Calendar limite = Calendar.getInstance();
				limite.setTime(creacion);
				limite.add(Calendar.HOUR_OF_DAY, 4);
				resultado = limite.before(ahora);
			} catch (ParseException pe) {
				logger.log(Level.SEVERE,
						"Problemas recuperando fecha de creacion.", pe);
			}
		}
		return resultado;
	}

}
