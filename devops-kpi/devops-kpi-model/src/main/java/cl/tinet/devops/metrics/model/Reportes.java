
package cl.tinet.devops.metrics.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reportes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reportes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reporte" type="{http://www.tinet.cl/devops-kpi/}ReporteGenerado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "reportes")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reportes", propOrder = {
    "reporte"
})
public class Reportes {

    protected List<ReporteGenerado> reporte;

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
     * {@link ReporteGenerado }
     * 
     * 
     */
    public List<ReporteGenerado> getReporte() {
        if (reporte == null) {
            reporte = new ArrayList<ReporteGenerado>();
        }
        return this.reporte;
    }

}
