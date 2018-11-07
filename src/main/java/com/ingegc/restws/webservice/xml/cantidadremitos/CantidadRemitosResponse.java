//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.28 a las 04:33:25 PM ART 
//


package com.ingegc.restws.webservice.xml.cantidadremitos;

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
 *         &lt;element name="cantidadPiezas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidadRemitos" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "cantidadPiezas",
    "cantidadRemitos"
})
@XmlRootElement(name = "cantidadRemitosResponse")
public class CantidadRemitosResponse {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer cantidadPiezas;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer cantidadRemitos;

    /**
     * Obtiene el valor de la propiedad cantidadPiezas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadPiezas() {
        return cantidadPiezas;
    }

    /**
     * Define el valor de la propiedad cantidadPiezas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadPiezas(Integer value) {
        this.cantidadPiezas = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadRemitos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadRemitos() {
        return cantidadRemitos;
    }

    /**
     * Define el valor de la propiedad cantidadRemitos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadRemitos(Integer value) {
        this.cantidadRemitos = value;
    }

}
