package cl.tinet.devops.metrics;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.datatype.DatatypeConfigurationException;

import cl.tinet.devops.metrics.gen.AcumuladorAbstracto;
import cl.tinet.devops.metrics.gen.AcumuladorException;
import cl.tinet.devops.metrics.gen.Generador;
import cl.tinet.devops.metrics.gen.GeneradorException;
import cl.tinet.devops.metrics.model.AcumuladorKPI;
import cl.tinet.devops.metrics.model.AcumuladoresKPI;
import cl.tinet.devops.metrics.model.ConfiguracionGeneral;
import cl.tinet.devops.metrics.model.ConfiguracionReporte;
import cl.tinet.devops.metrics.model.Configuraciones;
import cl.tinet.devops.metrics.model.GeneradorKPI;
import cl.tinet.devops.metrics.model.GeneradoresKPI;
import cl.tinet.devops.metrics.model.MedicionKPI;
import cl.tinet.devops.metrics.model.ReporteGenerado;
import cl.tinet.devops.metrics.model.TipoKPI;
import cl.tinet.devops.metrics.model.TiposKPI;
import cl.tinet.devops.metrics.model.UmbralKPI;
import cl.tinet.devops.metrics.util.DevOpsUtil;

public class ProcesadorReportes {

	private boolean configurado;

	private Map<String, Generador> generadores;

	private Collection<ConfiguracionReporte> configReportes;

	public ProcesadorReportes() {
		configurado = false;
		generadores = new HashMap<String, Generador>();
	}

	public synchronized void configurar(ConfiguracionGeneral general)
			throws ConfiguracionException, GeneradorException,
			AcumuladorException {
		if (general == null) {
			throw new ConfiguracionException(
					"Debe especficar una configuración no nula.");
		}
		if (configurado) {
			throw new IllegalStateException("El procesador ya fue configurado.");
		}
		configurarAcumuladores(general.getAcumuladores());
		configurarGeneradores(general.getGeneradores());
		validarReportes(general.getReportes());
		configurado = true;
	}

	private void validarReportes(Configuraciones reportes)
			throws ConfiguracionException, AcumuladorException {
		if (reportes == null) {
			throw new ConfiguracionException(
					"Debe especificar al menos un reporte.");
		}
		Collection<ConfiguracionReporte> configs = reportes.getReporte();
		if ((configs == null) || (configs.size() == 0)) {
			throw new ConfiguracionException(
					"Debe especificar al menos un reporte.");
		}
		for (ConfiguracionReporte config : configs) {
			if (config == null) {
				throw new IllegalArgumentException(
						"La configuracion del reporte no debe ser nula.");
			}
			if ((config.getTitulo() == null) || (config.getNombre() == null)) {
				throw new ConfiguracionException(
						"El reporte debe tener un título y un nombre.");
			}
			validarKPIs(config.getKpis());
		}
		configReportes = configs;
	}

	private void validarKPIs(TiposKPI config) throws ConfiguracionException,
			AcumuladorException {
		if (config == null) {
			throw new ConfiguracionException(
					"Debe especificar al menos un KPI.");
		}
		Collection<TipoKPI> kpis = config.getKpi();
		if ((kpis == null) || (kpis.size() == 0)) {
			throw new ConfiguracionException(
					"Debe especificar al menos un KPI.");
		}
		for (TipoKPI kpi : kpis) {
			if (kpi == null) {
				throw new IllegalArgumentException(
						"El KPI especificado no debe ser null.");
			}
			validarKPI(kpi);
		}
	}

	private void validarKPI(TipoKPI kpi) throws ConfiguracionException,
			AcumuladorException {
		if (kpi.getNombre() == null) {
			throw new ConfiguracionException(
					"Debe especificar el nombre del KPI.");
		}
		if (kpi.getDescripcion() == null) {
			throw new ConfiguracionException(
					"La descripcion es necesaria para interpretar el KPI.");
		}
		if ((kpi.getGenerador() == null) || (kpi.getAcumulador() == null)) {
			throw new ConfiguracionException(
					"El reporte debe especificar el generador y el acumulador.");
		}
		if (!generadores.containsKey(kpi.getGenerador())) {
			throw new ConfiguracionException(
					"El generador especificado no fue definido.");
		}
		AcumuladorAbstracto.obtenerAcumulador(kpi.getAcumulador(),
				kpi.getNombre());
	}

	private void configurarGeneradores(GeneradoresKPI config)
			throws ConfiguracionException, GeneradorException {
		if (config == null) {
			throw new ConfiguracionException(
					"Debe especificar al menos un generador.");
		}
		Collection<GeneradorKPI> defs = config.getGeneradorReporte();
		if ((defs == null) || (defs.size() == 0)) {
			throw new ConfiguracionException(
					"Debe especificar al menos un generador.");
		}
		try {
			for (GeneradorKPI def : defs) {
				String implClass = def.getImplementacion();
				if ((implClass == null) || (implClass.trim().equals(""))) {
					throw new ConfiguracionException(
							"Debe especificar la implementacion de generador.");
				}
				Class<?> clazz;
				clazz = Thread.currentThread().getContextClassLoader()
						.loadClass(implClass);
				Generador generador = clazz.asSubclass(Generador.class)
						.newInstance();
				generador.inicializar(def);
				generadores.put(def.getNombre(), generador);
			}
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			throw new ConfiguracionException(
					"Error instanciando generador de reporte.", e);
		}
	}

	private void configurarAcumuladores(AcumuladoresKPI config)
			throws ConfiguracionException {
		if (config != null) {
			Collection<AcumuladorKPI> acums = config.getAcumulador();
			if (acums == null) {
				throw new ConfiguracionException(
						"Debe especificar al menos un acumulador.");
			}
			try {
				for (AcumuladorKPI acum : acums) {
					String impl = acum.getImplementacion();
					if ((impl == null) || (impl.trim().equals(""))) {
						throw new ConfiguracionException(
								"Debe especificar la implementacion de acumulador.");
					}
					Class<?> clazz = Thread.currentThread()
							.getContextClassLoader().loadClass(impl);
					AcumuladorAbstracto.registrarAcumulador(acum.getNombre(),
							clazz.asSubclass(AcumuladorAbstracto.class));
				}
			} catch (ClassNotFoundException | ClassCastException ce) {
				throw new ConfiguracionException(
						"Error configurando acumulador.", ce);
			}
		}
	}

	public Collection<ReporteGenerado> generar() throws GeneradorException {
		if (!configurado) {
			throw new IllegalStateException(
					"El procesador no está inicializado.");
		}
		Collection<ReporteGenerado> reportes = new ArrayList<ReporteGenerado>();
		for (ConfiguracionReporte config : configReportes) {
			reportes.add(generarReporte(config, obtenerDatosReporte(config)));
		}
		return reportes;
	}

	private ReporteGenerado generarReporte(ConfiguracionReporte config,
			Map<String, Collection<AcumuladorAbstracto>> datos)
			throws GeneradorException {
		try {
			Map<String, TipoKPI> kpis = new HashMap<String, TipoKPI>();
			for (TipoKPI kpi : config.getKpis().getKpi()) {
				kpis.put(kpi.getNombre(), kpi);
			}
			ReporteGenerado reporte = new ReporteGenerado();
			reporte.setNombre(config.getNombre());
			reporte.setDescripcion(config.getDescripcion());
			reporte.setFecha(DevOpsUtil.getFechaReporte());
			reporte.setTitulo(config.getTitulo());
			Collection<MedicionKPI> mediciones = reporte.getMedicion();
			for (Entry<String, Collection<AcumuladorAbstracto>> entry : datos
					.entrySet()) {
				String llave = entry.getKey();
				for (AcumuladorAbstracto acumulador : entry.getValue()) {
					if (acumulador.isConDatos()) {
						TipoKPI kpi = kpis.get(acumulador.getKpi());
						MedicionKPI medicion = construirMedicion(kpi,
								acumulador);
						medicion.setGrupo(llave);
						mediciones.add(medicion);
					}
				}
			}
			return reporte;
		} catch (DatatypeConfigurationException e) {
			throw new GeneradorException("Error generando el reporte.", e);
		}
	}

	private MedicionKPI construirMedicion(TipoKPI kpi,
			AcumuladorAbstracto acumulador)
			throws DatatypeConfigurationException {
		MedicionKPI medicion = new MedicionKPI();
		medicion.setKpi(kpi.getAcumulador());
		medicion.setNombre(kpi.getNombre());
		medicion.setFecha(DevOpsUtil.getFechaReporte(acumulador.getFecha()));
		medicion.setValor(acumulador.calcular().doubleValue());
		String inter = MessageFormat.format(kpi.getDescripcion(),
				kpi.getNombre(), acumulador.calcular(),
				obtenerUmbral(kpi.getMinimo()), obtenerUmbral(kpi.getMaximo()),
				acumulador.getFecha());
		medicion.setInterpretacion(inter);
		medicion.setConsolidado(acumulador.isGlobal());
		return medicion;
	}

	private Double obtenerUmbral(UmbralKPI umbral) {
		Double valor = null;
		if (umbral != null) {
			valor = umbral.getValor();
		}
		return valor;
	}

	private Map<String, Collection<AcumuladorAbstracto>> obtenerDatosReporte(
			ConfiguracionReporte config) throws GeneradorException {
		Map<String, Collection<AcumuladorAbstracto>> reporte = new HashMap<String, Collection<AcumuladorAbstracto>>();
		Map<String, Collection<TipoKPI>> kpis = new HashMap<String, Collection<TipoKPI>>();
		Collection<String> gens = new ArrayList<String>();
		for (TipoKPI kpi : config.getKpis().getKpi()) {
			String llave = kpi.getGenerador();
			if (!kpis.containsKey(llave)) {
				gens.add(llave);
				kpis.put(llave, new ArrayList<TipoKPI>());
			}
			kpis.get(llave).add(kpi);
		}
		for (String gen : gens) {
			Collection<TipoKPI> tk = kpis.get(gen);
			Generador generador = generadores.get(gen);
			Map<String, Collection<AcumuladorAbstracto>> datos = generador
					.calcular(tk.toArray(new TipoKPI[0]));
			for (Entry<String, Collection<AcumuladorAbstracto>> entry : datos
					.entrySet()) {
				String llave = entry.getKey();
				if (reporte.containsKey(llave)) {
					reporte.get(llave).addAll(entry.getValue());
				} else {
					reporte.put(llave, entry.getValue());
				}
			}
		}
		return reporte;
	}
}
