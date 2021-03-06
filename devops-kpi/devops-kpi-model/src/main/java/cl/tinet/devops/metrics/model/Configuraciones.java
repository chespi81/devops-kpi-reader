
package cl.tinet.devops.metrics.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuraciones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Configuraciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reporte" type="{http://www.tinet.cl/devops-kpi/}ConfiguracionReporte" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuraciones", propOrder = {
    "reporte"
})
public class Configuraciones {

    protected List<ConfiguracionReporte> reporte;

    /**
     * Gets the value of the reporte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reporte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReporte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfiguracionReporte }
     * 
     * 
     */
    public List<ConfiguracionReporte> getReporte() {
        if (reporte == null) {
            reporte = new ArrayList<ConfiguracionReporte>();
        }
        return this.reporte;
    }

}
