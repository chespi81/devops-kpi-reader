package cl.tinet.devops.metrics.gen;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class AcumuladorAbstracto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;

	private String kpi;

	private Date fecha;

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

	public static AcumuladorAbstracto obtenerAcumulador(String nombre,
			String kpi) throws AcumuladorException {
		return obtenerAcumulador(nombre, kpi, false);
	}

	public static AcumuladorAbstracto obtenerAcumulador(String nombre,
			String kpi, boolean global) throws AcumuladorException {
		if (!tipos.containsKey(nombre)) {
			throw new AcumuladorException("Acumulador no registrado: " + nombre);
		}
		try {
			return tipos.get(nombre)
					.getConstructor(String.class, String.class, Boolean.TYPE)
					.newInstance(nombre, kpi, global);
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException causa) {
			throw new AcumuladorException("Problema instanciando acumulador: "
					+ nombre, causa);
		}
	}

	public AcumuladorAbstracto(String nombre, String kpi, boolean global) {
		this.nombre = nombre;
		this.kpi = kpi;
		this.fecha = new Date();
		this.global = global;
	}

	public abstract void acumular(Object item);

	public abstract void acumular(AcumuladorAbstracto item);

	public abstract Number calcular();

	public abstract boolean isConDatos();

	public String getNombre() {
		return nombre;
	}

	public String getKpi() {
		return kpi;
	}

	public Date getFecha() {
		return fecha;
	}

	public boolean isGlobal() {
		return global;
	}

	@Override
	public String toString() {
		return "Acumulador:[acumulador='" + getNombre() + "', kpi='" + getKpi()
				+ "', valor='" + calcular() + "']";
	}
}
