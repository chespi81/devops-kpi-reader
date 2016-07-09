package cl.tinet.devops.metrics.util;

import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import cl.tinet.devops.metrics.model.Parametro;
import cl.tinet.devops.metrics.model.Parametros;

public class DevOpsUtil {

	private DevOpsUtil() {
	}
	
	public static String getString(String nombre,
			Map<String, Parametro> parametros) {
		String resultado = null;
		if (nombre == null) {
			throw new IllegalArgumentException(
					"El nombre del parametro no debe ser null.");
		}
		if ((parametros != null) && (parametros.containsKey(nombre))) {
			resultado = parametros.get(nombre).getValor();
		}
		return resultado;
	}

	public static String getString(String nombre, Parametros parametros) {
		return getString(nombre, getParametros(parametros));
	}

	public static Boolean getBoolean(String nombre,
			Map<String, Parametro> parametros) {
		Boolean resultado = null;
		String valor = getString(nombre, parametros);
		if (valor != null) {
			resultado = Boolean.valueOf(valor);
		}
		return resultado;
	}

	public static Boolean getBoolean(String nombre, Parametros parametros) {
		return getBoolean(nombre, getParametros(parametros));
	}

	public static Map<String, Parametro> getParametros(Parametros parametros) {
		Map<String, Parametro> mapParams = new HashMap<String, Parametro>();
		if (parametros != null) {
			List<Parametro> params = parametros.getParametro();
			if (params != null) {
				for (Parametro parametro : params) {
					mapParams.put(parametro.getNombre(), parametro);
				}
			}
		}
		return Collections.unmodifiableMap(mapParams);
	}

	public static XMLGregorianCalendar getFechaReporte()
			throws DatatypeConfigurationException {
		return getFechaReporte(new Date());
	}

	public static XMLGregorianCalendar getFechaReporte(Date date)
			throws DatatypeConfigurationException {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
	}
}
