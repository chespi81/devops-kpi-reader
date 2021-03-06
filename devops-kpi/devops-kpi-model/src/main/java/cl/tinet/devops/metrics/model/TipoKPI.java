
package cl.tinet.devops.metrics.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoKPI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoKPI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="generador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acumulador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minimo" type="{http://www.tinet.cl/devops-kpi/}UmbralKPI" minOccurs="0"/>
 *         &lt;element name="maximo" type="{http://www.tinet.cl/devops-kpi/}UmbralKPI" minOccurs="0"/>
 *         &lt;element name="interpretacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoKPI", propOrder = {
    "descripcion",
    "generador",
    "acumulador",
    "minimo",
    "maximo",
    "interpretacion"
})
public class TipoKPI {

    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected String generador;
    @XmlElement(required = true)
    protected String acumulador;
    protected UmbralKPI minimo;
    protected UmbralKPI maximo;
    @XmlElement(required = true)
    protected String interpretacion;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the generador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerador() {
        return generador;
    }

    /**
     * Sets the value of the generador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerador(String value) {
        this.generador = value;
    }

    /**
     * Gets the value of the acumulador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcumulador() {
        return acumulador;
    }

    /**
     * Sets the value of the acumulador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcumulador(String value) {
        this.acumulador = value;
    }

    /**
     * Gets the value of the minimo property.
     * 
     * @return
     *     possible object is
     *     {@link UmbralKPI }
     *     
     */
    public UmbralKPI getMinimo() {
        return minimo;
    }

    /**
     * Sets the value of the minimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UmbralKPI }
     *     
     */
    public void setMinimo(UmbralKPI value) {
        this.minimo = value;
    }

    /**
     * Gets the value of the maximo property.
     * 
     * @return
     *     possible object is
     *     {@link UmbralKPI }
     *     
     */
    public UmbralKPI getMaximo() {
        return maximo;
    }

    /**
     * Sets the value of the maximo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UmbralKPI }
     *     
     */
    public void setMaximo(UmbralKPI value) {
        this.maximo = value;
    }

    /**
     * Gets the value of the interpretacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretacion() {
        return interpretacion;
    }

    /**
     * Sets the value of the interpretacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretacion(String value) {
        this.interpretacion = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
