//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.28 a las 04:33:25 PM ART 
//


package com.ingegc.restws.webservice.xml.remitosdetalle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para detalleRemito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleRemito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="punto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="knr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tmaimc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="basico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sufijo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="proveedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaFis" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="remito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teileartgruppe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notaPedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code7227" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleRemito", propOrder = {
    "planta",
    "fecha",
    "punto",
    "knr",
    "tmaimc",
    "color",
    "prefijo",
    "basico",
    "sufijo",
    "cantidad",
    "proveedor",
    "fechaFis",
    "remito",
    "teileartgruppe",
    "notaPedido",
    "code7227"
})
public class DetalleRemito {

    @XmlElement(required = true)
    protected String planta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    @XmlElement(required = true)
    protected String punto;
    @XmlElement(required = true)
    protected String knr;
    @XmlElement(required = true)
    protected String tmaimc;
    @XmlElement(required = true)
    protected String color;
    @XmlElement(required = true)
    protected String prefijo;
    @XmlElement(required = true)
    protected String basico;
    @XmlElement(required = true)
    protected String sufijo;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer cantidad;
    @XmlElement(required = true)
    protected String proveedor;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaFis;
    @XmlElement(required = true)
    protected String remito;
    @XmlElement(required = true)
    protected String teileartgruppe;
    @XmlElement(required = true)
    protected String notaPedido;
    @XmlElement(required = true)
    protected String code7227;

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
     * Obtiene el valor de la propiedad punto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunto() {
        return punto;
    }

    /**
     * Define el valor de la propiedad punto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunto(String value) {
        this.punto = value;
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
     * Obtiene el valor de la propiedad tmaimc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmaimc() {
        return tmaimc;
    }

    /**
     * Define el valor de la propiedad tmaimc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmaimc(String value) {
        this.tmaimc = value;
    }

    /**
     * Obtiene el valor de la propiedad color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Define el valor de la propiedad color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijo() {
        return prefijo;
    }

    /**
     * Define el valor de la propiedad prefijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijo(String value) {
        this.prefijo = value;
    }

    /**
     * Obtiene el valor de la propiedad basico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasico() {
        return basico;
    }

    /**
     * Define el valor de la propiedad basico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasico(String value) {
        this.basico = value;
    }

    /**
     * Obtiene el valor de la propiedad sufijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSufijo() {
        return sufijo;
    }

    /**
     * Define el valor de la propiedad sufijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSufijo(String value) {
        this.sufijo = value;
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
     * Obtiene el valor de la propiedad fechaFis.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFis() {
        return fechaFis;
    }

    /**
     * Define el valor de la propiedad fechaFis.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFis(XMLGregorianCalendar value) {
        this.fechaFis = value;
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
     * Obtiene el valor de la propiedad notaPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaPedido() {
        return notaPedido;
    }

    /**
     * Define el valor de la propiedad notaPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaPedido(String value) {
        this.notaPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad code7227.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode7227() {
        return code7227;
    }

    /**
     * Define el valor de la propiedad code7227.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode7227(String value) {
        this.code7227 = value;
    }

}
