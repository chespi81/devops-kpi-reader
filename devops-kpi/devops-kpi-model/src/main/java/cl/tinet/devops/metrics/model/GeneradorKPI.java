
package cl.tinet.devops.metrics.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneradorKPI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneradorKPI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="implementacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parametros" type="{http://www.tinet.cl/devops-kpi/}Parametros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneradorKPI", propOrder = {
    "nombre",
    "implementacion",
    "parametros"
})
public class GeneradorKPI {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String implementacion;
    protected Parametros parametros;

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the implementacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementacion() {
        return implementacion;
    }

    /**
     * Sets the value of the implementacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementacion(String value) {
        this.implementacion = value;
    }

    /**
     * Gets the value of the parametros property.
     * 
     * @return
     *     possible object is
     *     {@link Parametros }
     *     
     */
    public Parametros getParametros() {
        return parametros;
    }

    /**
     * Sets the value of the parametros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametros }
     *     
     */
    public void setParametros(Parametros value) {
        this.parametros = value;
    }

}
