/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.TranslatableBussinessObject;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.remitosagrupado.RemitoAgrupado;
import java.util.Date;

/**
 *
 * @author a637201
 */
public class RemitoAgrupadoBo extends TranslatableBussinessObject<RemitoAgrupado>{
    
    protected String pieza;
    protected String proveedor;
    protected Date fecha;
    protected Integer cantidad;
    protected String remito;
    protected String remitoDefId;
    protected Integer componente;
    protected String modelo;
    protected String teileartgruppe;
    protected Date teileart;   

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

    public String getRemitoDefId() {
        return remitoDefId;
    }

    public void setRemitoDefId(String remitoDefId) {
        this.remitoDefId = remitoDefId;
    }

    public Integer getComponente() {
        return componente;
    }

    public void setComponente(Integer componente) {
        this.componente = componente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTeileartgruppe() {
        return teileartgruppe;
    }

    public void setTeileartgruppe(String teileartgruppe) {
        this.teileartgruppe = teileartgruppe;
    }

    public Date getTeileart() {
        return teileart;
    }

    public void setTeileart(Date teileart) {
        this.teileart = teileart;
    }

    @Override
    public RemitoAgrupado translate() {
        RemitoAgrupado remito = translate(new RemitoAgrupado()); 
        remito.setFecha(DatesTool.getXMLGregorianCalendarDate(fecha));
        return remito;        
    }
    
    
}
