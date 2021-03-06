
package cl.tinet.devops.metrics.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.tinet.devops.metrics.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Reportes_QNAME = new QName("http://www.tinet.cl/devops-kpi/", "reportes");
    private final static QName _Configuracion_QNAME = new QName("http://www.tinet.cl/devops-kpi/", "configuracion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.tinet.devops.metrics.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfiguracionGeneral }
     * 
     */
    public ConfiguracionGeneral createConfiguracionGeneral() {
        return new ConfiguracionGeneral();
    }

    /**
     * Create an instance of {@link Reportes }
     * 
     */
    public Reportes createReportes() {
        return new Reportes();
    }

    /**
     * Create an instance of {@link ReporteGenerado }
     * 
     */
    public ReporteGenerado createReporteGenerado() {
        return new ReporteGenerado();
    }

    /**
     * Create an instance of {@link Parametro }
     * 
     */
    public Parametro createParametro() {
        return new Parametro();
    }

    /**
     * Create an instance of {@link Configuraciones }
     * 
     */
    public Configuraciones createConfiguraciones() {
        return new Configuraciones();
    }

    /**
     * Create an instance of {@link TipoKPI }
     * 
     */
    public TipoKPI createTipoKPI() {
        return new TipoKPI();
    }

    /**
     * Create an instance of {@link AcumuladorKPI }
     * 
     */
    public AcumuladorKPI createAcumuladorKPI() {
        return new AcumuladorKPI();
    }

    /**
     * Create an instance of {@link GeneradorKPI }
     * 
     */
    public GeneradorKPI createGeneradorKPI() {
        return new GeneradorKPI();
    }

    /**
     * Create an instance of {@link UmbralKPI }
     * 
     */
    public UmbralKPI createUmbralKPI() {
        return new UmbralKPI();
    }

    /**
     * Create an instance of {@link Parametros }
     * 
     */
    public Parametros createParametros() {
        return new Parametros();
    }

    /**
     * Create an instance of {@link AcumuladoresKPI }
     * 
     */
    public AcumuladoresKPI createAcumuladoresKPI() {
        return new AcumuladoresKPI();
    }

    /**
     * Create an instance of {@link ConfiguracionReporte }
     * 
     */
    public ConfiguracionReporte createConfiguracionReporte() {
        return new ConfiguracionReporte();
    }

    /**
     * Create an instance of {@link TiposKPI }
     * 
     */
    public TiposKPI createTiposKPI() {
        return new TiposKPI();
    }

    /**
     * Create an instance of {@link MedicionKPI }
     * 
     */
    public MedicionKPI createMedicionKPI() {
        return new MedicionKPI();
    }

    /**
     * Create an instance of {@link GeneradoresKPI }
     * 
     */
    public GeneradoresKPI createGeneradoresKPI() {
        return new GeneradoresKPI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reportes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tinet.cl/devops-kpi/", name = "reportes")
    public JAXBElement<Reportes> createReportes(Reportes value) {
        return new JAXBElement<Reportes>(_Reportes_QNAME, Reportes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfiguracionGeneral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tinet.cl/devops-kpi/", name = "configuracion")
    public JAXBElement<ConfiguracionGeneral> createConfiguracion(ConfiguracionGeneral value) {
        return new JAXBElement<ConfiguracionGeneral>(_Configuracion_QNAME, ConfiguracionGeneral.class, null, value);
    }

}
