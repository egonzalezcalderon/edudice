//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.28 a las 04:33:25 PM ART 
//


package com.ingegc.restws.webservice.xml.actualizacionremitosdefinitivos;

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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="proveedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pieza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remitoProvFecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="remitoProvNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ptoVenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remitoDefFecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaCarga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaValidacion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perfil" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "id",
    "proveedor",
    "pieza",
    "remitoProvFecha",
    "remitoProvNumero",
    "ptoVenta",
    "numero",
    "remitoDefFecha",
    "fechaCarga",
    "fechaValidacion",
    "idUsuario",
    "perfil"
})
public class RemitoDefinitivo {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
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
    protected XMLGregorianCalendar remitoDefFecha;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaCarga;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaValidacion;
    @XmlElement(required = true)
    protected String idUsuario;
    @XmlElement(required = true)
    protected String perfil;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
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
     * Obtiene el valor de la propiedad remitoDefFecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRemitoDefFecha() {
        return remitoDefFecha;
    }

    /**
     * Define el valor de la propiedad remitoDefFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRemitoDefFecha(XMLGregorianCalendar value) {
        this.remitoDefFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCarga.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCarga() {
        return fechaCarga;
    }

    /**
     * Define el valor de la propiedad fechaCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCarga(XMLGregorianCalendar value) {
        this.fechaCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaValidacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaValidacion() {
        return fechaValidacion;
    }

    /**
     * Define el valor de la propiedad fechaValidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaValidacion(XMLGregorianCalendar value) {
        this.fechaValidacion = value;
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

    /**
     * Obtiene el valor de la propiedad perfil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * Define el valor de la propiedad perfil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfil(String value) {
        this.perfil = value;
    }

}
