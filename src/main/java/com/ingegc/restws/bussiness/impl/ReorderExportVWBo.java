/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.TranslatableBussinessObject;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultareordersexportvw.ReorderExportVW;
import com.ingegc.restws.webservice.xml.consultareordersvw.ReorderVW;
import java.util.Date;

/**
 *
 * @author a637201
 */
public class ReorderExportVWBo extends TranslatableBussinessObject<ReorderExportVW> {
        
    protected String codPluma;
    protected String pieza;
    protected Integer cantidad;
    protected Date fechaImp;
    protected String centroCosto;
    protected String fechaHoraReorder;
    protected String anio;
    protected String modelo;
    protected String teileartgruppe;
    protected String teileart; 
    protected String knr;
    protected String planta;

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

    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getFechaHoraReorder() {
        return fechaHoraReorder;
    }

    public void setFechaHoraReorder(String fechaHoraReorder) {
        this.fechaHoraReorder = fechaHoraReorder;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
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

    public String getTeileart() {
        return teileart;
    }

    public void setTeileart(String teileart) {
        this.teileart = teileart;
    }
    
    public String getKnr() {
        return knr;
    }

    public void setKnr(String knr) {
        this.knr = knr;
    }
       
    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }    
    
    @Override
    public ReorderExportVW translate() {
        ReorderExportVW reorderVW = translate(new ReorderExportVW());
        reorderVW.setFechaImportacion(DatesTool.getXMLGregorianCalendarDate(fechaImp));
        return reorderVW;
    }
}
