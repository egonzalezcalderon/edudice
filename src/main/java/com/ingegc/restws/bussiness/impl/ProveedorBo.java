/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.BussinessObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author a637201
 */
public class ProveedorBo extends BussinessObject {
    
    protected String id;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    protected Date fecha;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    protected Date fechaDesde;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    protected Date fechaHasta;    
    
    public ProveedorBo() {
        this.id = "";
        this.fecha = new Date();
        this.fechaDesde = new Date();
        this.fechaHasta = new Date();
    }
        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }   

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    
}
