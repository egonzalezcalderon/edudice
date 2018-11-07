//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.28 a las 04:33:25 PM ART 
//


package com.ingegc.restws.webservice.xml.pendientesdecarga;

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
 *         &lt;element name="remitosPendientesDeCarga" type="{http://ingegc.com/restws/webservice/xml/pendientesdecarga}remitoPendienteDeCarga" maxOccurs="unbounded"/>
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
    "remitosPendientesDeCarga"
})
@XmlRootElement(name = "pendientesDeCargaResponse")
public class PendientesDeCargaResponse {

    @XmlElement(required = true)
    protected List<RemitoPendienteDeCarga> remitosPendientesDeCarga;

    /**
     * Gets the value of the remitosPendientesDeCarga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remitosPendientesDeCarga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemitosPendientesDeCarga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemitoPendienteDeCarga }
     * 
     * 
     */
    public List<RemitoPendienteDeCarga> getRemitosPendientesDeCarga() {
        if (remitosPendientesDeCarga == null) {
            remitosPendientesDeCarga = new ArrayList<RemitoPendienteDeCarga>();
        }
        return this.remitosPendientesDeCarga;
    }

}
