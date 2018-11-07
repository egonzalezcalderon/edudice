/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.TranslatableBussinessObject;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.remitosvalidados.RemitoValidado;
import java.util.Date;

/**
 *
 * @author a637201
 */
public class RemitoValidadoBo extends TranslatableBussinessObject<RemitoValidado> {
        
    protected String pieza;
    protected String proveedor;
    protected Date fecha;
    protected Integer cantidad;
    protected String remito;
    protected String remDefPtoVenta;
    protected String remDefNumero;
    protected Date remDefFecha;
    protected Date remDefFechaValidacion;
    protected String teileart;
    protected String teileartgruppe;
    protected String modelo;

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getRemito() {
        return remito;
    }

    public void setRemito(String remito) {
        this.remito = remito;
    }

    public String getRemDefPtoVenta() {
        return remDefPtoVenta;
    }

    public void setRemDefPtoVenta(String remDefPtoVenta) {
        this.remDefPtoVenta = remDefPtoVenta;
    }

    public String getRemDefNumero() {
        return remDefNumero;
    }

    public void setRemDefNumero(String remDefNumero) {
        this.remDefNumero = remDefNumero;
    }

    public Date getRemDefFecha() {
        return remDefFecha;
    }

    public void setRemDefFecha(Date remDefFecha) {
        this.remDefFecha = remDefFecha;
    }

    public Date getRemDefFechaValidacion() {
        return remDefFechaValidacion;
    }

    public void setRemDefFechaValidacion(Date remDefFechaValidacion) {
        this.remDefFechaValidacion = remDefFechaValidacion;
    }

    public String getTeileart() {
        return teileart;
    }

    public void setTeileart(String teileart) {
        this.teileart = teileart;
    }

    public String getTeileartgruppe() {
        return teileartgruppe;
    }

    public void setTeileartgruppe(String teileartgruppe) {
        this.teileartgruppe = teileartgruppe;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public RemitoValidado translate() {
        RemitoValidado remito = translate(new RemitoValidado());
        remito.setFecha(DatesTool.getXMLGregorianCalendarDate(fecha));
        remito.setRemDefFecha(DatesTool.getXMLGregorianCalendarDate(remDefFecha));
        remito.setRemDefFechaValidacion(DatesTool.getXMLGregorianCalendarDate(remDefFechaValidacion));
        return remito;
    }
}
