//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.28 a las 04:33:25 PM ART 
//


package com.ingegc.restws.webservice.xml.consultareordersexportvw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para reorderExportVW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reorderExportVW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codPluma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pieza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaImportacion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="centroCosto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaHoraReorder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teileartgruppe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teileart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="knr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="planta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reorderExportVW", propOrder = {
    "codPluma",
    "pieza",
    "cantidad",
    "fechaImportacion",
    "centroCosto",
    "fechaHoraReorder",
    "anio",
    "modelo",
    "teileartgruppe",
    "teileart",
    "knr",
    "planta"
})
public class ReorderExportVW {

    @XmlElement(required = true)
    protected String codPluma;
    @XmlElement(required = true)
    protected String pieza;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer cantidad;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaImportacion;
    @XmlElement(required = true)
    protected String centroCosto;
    @XmlElement(required = true)
    protected String fechaHoraReorder;
    @XmlElement(required = true)
    protected String anio;
    @XmlElement(required = true)
    protected String modelo;
    @XmlElement(required = true)
    protected String teileartgruppe;
    @XmlElement(required = true)
    protected String teileart;
    @XmlElement(required = true)
    protected String knr;
    @XmlElement(required = true)
    protected String planta;

    /**
     * Obtiene el valor de la propiedad codPluma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPluma() {
        return codPluma;
    }

    /**
     * Define el valor de la propiedad codPluma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPluma(String value) {
        this.codPluma = value;
    }

    /**
     * Obtiene el valor de la propiedad pieza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieza() {
        return pieza;
    }

    /**
     * Define el valor de la propiedad pieza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieza(String value) {
        this.pieza = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidad(Integer value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaImportacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaImportacion() {
        return fechaImportacion;
    }

    /**
     * Define el valor de la propiedad fechaImportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaImportacion(XMLGregorianCalendar value) {
        this.fechaImportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad centroCosto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroCosto() {
        return centroCosto;
    }

    /**
     * Define el valor de la propiedad centroCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroCosto(String value) {
        this.centroCosto = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraReorder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHoraReorder() {
        return fechaHoraReorder;
    }

    /**
     * Define el valor de la propiedad fechaHoraReorder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHoraReorder(String value) {
        this.fechaHoraReorder = value;
    }

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnio() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnio(String value) {
        this.anio = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad teileartgruppe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeileartgruppe() {
        return teileartgruppe;
    }

    /**
     * Define el valor de la propiedad teileartgruppe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeileartgruppe(String value) {
        this.teileartgruppe = value;
    }

    /**
     * Obtiene el valor de la propiedad teileart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeileart() {
        return teileart;
    }

    /**
     * Define el valor de la propiedad teileart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeileart(String value) {
        this.teileart = value;
    }

    /**
     * Obtiene el valor de la propiedad knr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnr() {
        return knr;
    }

    /**
     * Define el valor de la propiedad knr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnr(String value) {
        this.knr = value;
    }

    /**
     * Obtiene el valor de la propiedad planta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanta() {
        return planta;
    }

    /**
     * Define el valor de la propiedad planta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanta(String value) {
        this.planta = value;
    }

}
