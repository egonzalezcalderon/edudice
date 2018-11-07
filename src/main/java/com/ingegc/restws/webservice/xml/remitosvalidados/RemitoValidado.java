//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.28 a las 04:33:25 PM ART 
//


package com.ingegc.restws.webservice.xml.remitosvalidados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para remitoValidado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="remitoValidado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pieza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="proveedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="remito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remDefPtoVenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remDefNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remDefFecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="remDefFechaValidacion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="teileart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teileartgruppe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remitoValidado", propOrder = {
    "pieza",
    "proveedor",
    "fecha",
    "cantidad",
    "remito",
    "remDefPtoVenta",
    "remDefNumero",
    "remDefFecha",
    "remDefFechaValidacion",
    "teileart",
    "teileartgruppe",
    "modelo"
})
public class RemitoValidado {

    @XmlElement(required = true)
    protected String pieza;
    @XmlElement(required = true)
    protected String proveedor;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer cantidad;
    @XmlElement(required = true)
    protected String remito;
    @XmlElement(required = true)
    protected String remDefPtoVenta;
    @XmlElement(required = true)
    protected String remDefNumero;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar remDefFecha;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar remDefFechaValidacion;
    @XmlElement(required = true)
    protected String teileart;
    @XmlElement(required = true)
    protected String teileartgruppe;
    @XmlElement(required = true)
    protected String modelo;

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
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveedor(String value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
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
     * Define el valor de la propiedad fecha.
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
     * Obtiene el valor de la propiedad remito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemito() {
        return remito;
    }

    /**
     * Define el valor de la propiedad remito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemito(String value) {
        this.remito = value;
    }

    /**
     * Obtiene el valor de la propiedad remDefPtoVenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemDefPtoVenta() {
        return remDefPtoVenta;
    }

    /**
     * Define el valor de la propiedad remDefPtoVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemDefPtoVenta(String value) {
        this.remDefPtoVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad remDefNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemDefNumero() {
        return remDefNumero;
    }

    /**
     * Define el valor de la propiedad remDefNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemDefNumero(String value) {
        this.remDefNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad remDefFecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRemDefFecha() {
        return remDefFecha;
    }

    /**
     * Define el valor de la propiedad remDefFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRemDefFecha(XMLGregorianCalendar value) {
        this.remDefFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad remDefFechaValidacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRemDefFechaValidacion() {
        return remDefFechaValidacion;
    }

    /**
     * Define el valor de la propiedad remDefFechaValidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRemDefFechaValidacion(XMLGregorianCalendar value) {
        this.remDefFechaValidacion = value;
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

}
