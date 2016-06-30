package cl.tinet.devops.metrics.gen;

public class AcumuladorException extends Exception {

	/**
	 * Versión de la clase para serialización.
	 */
	private static final long serialVersionUID = 1L;

	public AcumuladorException(String message, Throwable cause) {
		super(message, cause);
	}

	public AcumuladorException(String message) {
		super(message);
	}
}
