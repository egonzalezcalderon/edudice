//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.28 a las 04:33:25 PM ART 
//


package com.ingegc.restws.webservice.xml.altaremitosdefinitivos;

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
 *         &lt;element name="remitosDefinitivos" type="{http://ingegc.com/restws/webservice/xml/altaremitosdefinitivos}remitoDefinitivo"/>
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
    "remitosDefinitivos"
})
@XmlRootElement(name = "altaRemitosDefinitivosRequest")
public class AltaRemitosDefinitivosRequest {

    @XmlElement(required = true)
    protected RemitoDefinitivo remitosDefinitivos;

    /**
     * Obtiene el valor de la propiedad remitosDefinitivos.
     * 
     * @return
     *     possible object is
     *     {@link RemitoDefinitivo }
     *     
     */
    public RemitoDefinitivo getRemitosDefinitivos() {
        return remitosDefinitivos;
    }

    /**
     * Define el valor de la propiedad remitosDefinitivos.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitoDefinitivo }
     *     
     */
    public void setRemitosDefinitivos(RemitoDefinitivo value) {
        this.remitosDefinitivos = value;
    }

}
