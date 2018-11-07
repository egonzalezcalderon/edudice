/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.TranslatableBussinessObject;
import com.ingegc.restws.dtos.impl.RemitoDefinitivoInputDto;
import java.util.Date;

/**
 *
 * @author a637201
 */
public class RemitoDefinitivoInputBo extends TranslatableBussinessObject<RemitoDefinitivoInputDto> {
 
    protected Integer id;
    protected String proveedor;
    protected String pieza;
    protected Date remitoProvFecha;
    protected String remitoProvNumero;
    protected String ptoVenta;
    protected String numero;
    protected Date remitoDefFecha;
    protected Date fechaCarga;
    protected Date fechaValidacion;
    protected String idUsuario; 
    protected String perfil;
    
    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public Date getRemitoProvFecha() {
        return remitoProvFecha;
    }

    public void setRemitoProvFecha(Date remitoProvFecha) {
        this.remitoProvFecha = remitoProvFecha;
    }

    public String getRemitoProvNumero() {
        return remitoProvNumero;
    }

    public void setRemitoProvNumero(String remitoProvNumero) {
        this.remitoProvNumero = remitoProvNumero;
    }

    public String getPtoVenta() {
        return ptoVenta;
    }

    public void setPtoVenta(String ptoVenta) {
        this.ptoVenta = ptoVenta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRemitoDefFecha() {
        return remitoDefFecha;
    }

    public void setRemitoDefFecha(Date remitoDefFecha) {
        this.remitoDefFecha = remitoDefFecha;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Date getFechaValidacion() {
        return fechaValidacion;
    }

    public void setFechaValidacion(Date fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    @Override
    public RemitoDefinitivoInputDto translate() {
        return translate(new RemitoDefinitivoInputDto());
    }
    
}
