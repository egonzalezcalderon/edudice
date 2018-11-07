/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.TranslatableBussinessObject;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.pendientesdecarga.RemitoPendienteDeCarga;
import java.util.Date;

/**
 *
 * @author a637201
 */
public class RemitoPendienteCargaBo extends TranslatableBussinessObject<RemitoPendienteDeCarga> {
    
    protected String proveedor;
    protected Date fecha;
    protected String remito;
    protected String pieza;
    protected Integer cantidad;
    protected String teileart;
    protected String teileartgruppe;
    protected String modelo;

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

    public String getRemito() {
        return remito;
    }

    public void setRemito(String remito) {
        this.remito = remito;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
    public RemitoPendienteDeCarga translate() {
        RemitoPendienteDeCarga remito = translate(new RemitoPendienteDeCarga());
        remito.setFecha(DatesTool.getXMLGregorianCalendarDate(fecha));
        return remito;
    }
}
