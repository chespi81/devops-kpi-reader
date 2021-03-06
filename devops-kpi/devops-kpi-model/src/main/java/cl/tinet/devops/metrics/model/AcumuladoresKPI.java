
package cl.tinet.devops.metrics.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcumuladoresKPI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcumuladoresKPI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acumulador" type="{http://www.tinet.cl/devops-kpi/}AcumuladorKPI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcumuladoresKPI", propOrder = {
    "acumulador"
})
public class AcumuladoresKPI {

    protected List<AcumuladorKPI> acumulador;

    /**
     * Gets the value of the acumulador property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acumulador property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcumulador().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcumuladorKPI }
     * 
     * 
     */
    public List<AcumuladorKPI> getAcumulador() {
        if (acumulador == null) {
            acumulador = new ArrayList<AcumuladorKPI>();
        }
        return this.acumulador;
    }

}
