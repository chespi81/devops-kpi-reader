package cl.tinet.devops.metrics.gen;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public abstract class AcumuladorAbstracto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;

	private boolean global;

	private static Map<String, Class<? extends AcumuladorAbstracto>> tipos;

	static {
		tipos = new HashMap<String, Class<? extends AcumuladorAbstracto>>();
	}

	public synchronized static void registrarAcumulador(String nombre,
			Class<? extends AcumuladorAbstracto> tipo) {
		if (nombre == null) {
			throw new IllegalArgumentException(
					"El nombre del acumulador no debe ser nulo");
		}
		if (tipo == null) {
			throw new IllegalArgumentException(
					"Debe especificar un acumulador no nulo.");
		}
		tipos.put(nombre, tipo);
	}

	public static AcumuladorAbstracto obtenerAcumulador(String nombre)
			throws AcumuladorException {
		return obtenerAcumulador(nombre, false);
	}

	public static AcumuladorAbstracto obtenerAcumulador(String nombre,
			boolean global) throws AcumuladorException {
		if (!tipos.containsKey(nombre)) {
			throw new AcumuladorException("Acumulador no registrado: " + nombre);
		}
		try {
			return tipos.get(nombre).getConstructor(String.class, Boolean.TYPE)
					.newInstance(nombre, global);
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException causa) {
			throw new AcumuladorException("Problema instanciando acumulador: "
					+ nombre, causa);
		}
	}

	public AcumuladorAbstracto(String nombre) {
		this(nombre, false);
	}

	public AcumuladorAbstracto(String nombre, boolean global) {
		this.nombre = nombre;
		this.global = global;
	}

	public abstract void acumular(Object item);

	public abstract void acumular(AcumuladorAbstracto item);

	public abstract Number calcular();

	public abstract boolean isConDatos();

	public String getNombre() {
		return nombre;
	}

	public boolean isGlobal() {
		return global;
	}

	@Override
	public String toString() {
		return "Acumulador:[acumulador='" + getNombre() + "', kpi='"
				+ calcular() + "'";
	}
}
