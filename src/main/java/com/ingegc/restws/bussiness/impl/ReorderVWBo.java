/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.TranslatableBussinessObject;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultareordersvw.ReorderVW;
import java.util.Date;

/**
 *
 * @author a637201
 */
public class ReorderVWBo extends TranslatableBussinessObject<ReorderVW> {
        
    protected String codPluma;
    protected String pieza;
    protected Integer cantidad;
    protected Date fechaImp;

    public String getCodPluma() {
        return codPluma;
    }

    public void setCodPluma(String codPluma) {
        this.codPluma = codPluma;
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

    public Date getFechaImp() {
        return fechaImp;
    }

    public void setFechaImp(Date fechaImp) {
        this.fechaImp = fechaImp;
    }
    
    @Override
    public ReorderVW translate() {
        ReorderVW reorderVW = translate(new ReorderVW());
        reorderVW.setFechaImportacion(DatesTool.getXMLGregorianCalendarDate(fechaImp));
        return reorderVW;
    }
}
