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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para remitoDefinitivo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="remitoDefinitivo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proveedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pieza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remitoProvFecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="remitoProvNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ptoVenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remDefFecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remitoDefinitivo", propOrder = {
    "proveedor",
    "pieza",
    "remitoProvFecha",
    "remitoProvNumero",
    "ptoVenta",
    "numero",
    "remDefFecha",
    "idUsuario"
})
public class RemitoDefinitivo {

    @XmlElement(required = true)
    protected String proveedor;
    @XmlElement(required = true)
    protected String pieza;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar remitoProvFecha;
    @XmlElement(required = true)
    protected String remitoProvNumero;
    @XmlElement(required = true)
    protected String ptoVenta;
    @XmlElement(required = true)
    protected String numero;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar remDefFecha;
    @XmlElement(required = true)
    protected String idUsuario;

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
     * Obtiene el valor de la propiedad remitoProvFecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRemitoProvFecha() {
        return remitoProvFecha;
    }

    /**
     * Define el valor de la propiedad remitoProvFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRemitoProvFecha(XMLGregorianCalendar value) {
        this.remitoProvFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad remitoProvNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitoProvNumero() {
        return remitoProvNumero;
    }

    /**
     * Define el valor de la propiedad remitoProvNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitoProvNumero(String value) {
        this.remitoProvNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad ptoVenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtoVenta() {
        return ptoVenta;
    }

    /**
     * Define el valor de la propiedad ptoVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtoVenta(String value) {
        this.ptoVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
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
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
    }

}
