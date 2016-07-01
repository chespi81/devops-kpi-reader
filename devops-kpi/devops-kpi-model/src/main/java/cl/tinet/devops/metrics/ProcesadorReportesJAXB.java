package cl.tinet.devops.metrics;

import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import cl.tinet.devops.metrics.gen.AcumuladorException;
import cl.tinet.devops.metrics.gen.GeneradorException;
import cl.tinet.devops.metrics.model.ConfiguracionGeneral;
import cl.tinet.devops.metrics.model.Reportes;

public class ProcesadorReportesJAXB extends ProcesadorReportes {

	public ProcesadorReportesJAXB() {
	}

	public void configurar(InputStream cfg) throws ConfiguracionException {
		if (cfg == null) {
			throw new IllegalArgumentException(
					"Archivo de configuracion no debe ser null.");
		}
		try {
			JAXBContext jbc = JAXBContext
					.newInstance(ConfiguracionGeneral.class);

			Unmarshaller unmarshaller = jbc.createUnmarshaller();
			ConfiguracionGeneral general = (ConfiguracionGeneral) unmarshaller
					.unmarshal(cfg);
			configurar(general);
		} catch (GeneradorException | AcumuladorException | JAXBException e) {
			throw new ConfiguracionException(
					"Error durante la configuración de reportes.", e);
		}
	}

	public void generar(OutputStream output) throws GeneradorException {
		JAXBContext jbc;
		try {
			jbc = JAXBContext.newInstance(Reportes.class);
			Marshaller marshaller = jbc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			Reportes reportes = new Reportes();
			reportes.getReporte().addAll(generar());
			marshaller.marshal(reportes, output);
		} catch (JAXBException e) {
			throw new GeneradorException("Error generando el reporte.", e);
		}
	}
}
