//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.28 a las 04:33:25 PM ART 
//


package com.ingegc.restws.webservice.xml.consultareordersvw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reordersVW" type="{http://ingegc.com/restws/webservice/xml/consultareordersvw}reorderVW" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reordersVW"
})
@XmlRootElement(name = "consultaReordersVWResponse")
public class ConsultaReordersVWResponse {

    @XmlElement(required = true)
    protected List<ReorderVW> reordersVW;

    /**
     * Gets the value of the reordersVW property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reordersVW property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReordersVW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReorderVW }
     * 
     * 
     */
    public List<ReorderVW> getReordersVW() {
        if (reordersVW == null) {
            reordersVW = new ArrayList<ReorderVW>();
        }
        return this.reordersVW;
    }

}
