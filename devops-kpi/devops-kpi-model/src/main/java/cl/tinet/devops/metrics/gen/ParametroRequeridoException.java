package cl.tinet.devops.metrics.gen;

public class ParametroRequeridoException extends GeneradorException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParametroRequeridoException(String llave) {
		super("Se debe especificar el parámetro " + llave);
	}
}
