
package cl.tinet.devops.metrics.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneradoresKPI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneradoresKPI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generador-reporte" type="{http://www.tinet.cl/devops-kpi/}GeneradorKPI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneradoresKPI", propOrder = {
    "generadorReporte"
})
public class GeneradoresKPI {

    @XmlElement(name = "generador-reporte")
    protected List<GeneradorKPI> generadorReporte;

    /**
     * Gets the value of the generadorReporte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generadorReporte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneradorReporte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneradorKPI }
     * 
     * 
     */
    public List<GeneradorKPI> getGeneradorReporte() {
        if (generadorReporte == null) {
            generadorReporte = new ArrayList<GeneradorKPI>();
        }
        return this.generadorReporte;
    }

}
