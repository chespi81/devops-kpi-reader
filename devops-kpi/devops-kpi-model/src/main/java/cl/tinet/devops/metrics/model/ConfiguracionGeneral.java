
package cl.tinet.devops.metrics.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfiguracionGeneral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfiguracionGeneral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generadores" type="{http://www.tinet.cl/devops-kpi/}GeneradoresKPI" minOccurs="0"/>
 *         &lt;element name="acumuladores" type="{http://www.tinet.cl/devops-kpi/}AcumuladoresKPI" minOccurs="0"/>
 *         &lt;element name="reportes" type="{http://www.tinet.cl/devops-kpi/}Configuraciones" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "configuracion")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfiguracionGeneral", propOrder = {
    "generadores",
    "acumuladores",
    "reportes"
})
public class ConfiguracionGeneral {

    protected GeneradoresKPI generadores;
    protected AcumuladoresKPI acumuladores;
    protected Configuraciones reportes;

    /**
     * Gets the value of the generadores property.
     * 
     * @return
     *     possible object is
     *     {@link GeneradoresKPI }
     *     
     */
    public GeneradoresKPI getGeneradores() {
        return generadores;
    }

    /**
     * Sets the value of the generadores property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneradoresKPI }
     *     
     */
    public void setGeneradores(GeneradoresKPI value) {
        this.generadores = value;
    }

    /**
     * Gets the value of the acumuladores property.
     * 
     * @return
     *     possible object is
     *     {@link AcumuladoresKPI }
     *     
     */
    public AcumuladoresKPI getAcumuladores() {
        return acumuladores;
    }

    /**
     * Sets the value of the acumuladores property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcumuladoresKPI }
     *     
     */
    public void setAcumuladores(AcumuladoresKPI value) {
        this.acumuladores = value;
    }

    /**
     * Gets the value of the reportes property.
     * 
     * @return
     *     possible object is
     *     {@link Configuraciones }
     *     
     */
    public Configuraciones getReportes() {
        return reportes;
    }

    /**
     * Sets the value of the reportes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuraciones }
     *     
     */
    public void setReportes(Configuraciones value) {
        this.reportes = value;
    }

}
