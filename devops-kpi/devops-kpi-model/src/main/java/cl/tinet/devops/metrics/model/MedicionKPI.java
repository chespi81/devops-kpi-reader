
package cl.tinet.devops.metrics.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MedicionKPI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicionKPI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="interpretacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id-kpi" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grupo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cumplido" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="global" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicionKPI", propOrder = {
    "descripcion",
    "fecha",
    "valor",
    "interpretacion"
})
public class MedicionKPI {

    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected double valor;
    protected String interpretacion;
    @XmlAttribute(name = "id-kpi")
    protected String idKpi;
    @XmlAttribute(name = "grupo")
    protected String grupo;
    @XmlAttribute(name = "cumplido")
    protected Boolean cumplido;
    @XmlAttribute(name = "global")
    protected Boolean global;

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
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
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
     * Gets the value of the idKpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdKpi() {
        return idKpi;
    }

    /**
     * Sets the value of the idKpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdKpi(String value) {
        this.idKpi = value;
    }

    /**
     * Gets the value of the grupo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Sets the value of the grupo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupo(String value) {
        this.grupo = value;
    }

    /**
     * Gets the value of the cumplido property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCumplido() {
        return cumplido;
    }

    /**
     * Sets the value of the cumplido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCumplido(Boolean value) {
        this.cumplido = value;
    }

    /**
     * Gets the value of the global property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobal(Boolean value) {
        this.global = value;
    }

}
