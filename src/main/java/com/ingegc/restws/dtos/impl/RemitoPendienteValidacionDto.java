/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.dtos.impl;

import com.ingegc.restws.bussiness.impl.RemitoPendienteValidacionBo;
import com.ingegc.restws.dtos.core.TransformableDto;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

/**
 *
 * @author a637201
 */
@Entity
@NamedStoredProcedureQuery(
	name = "consultaRemitosPendientesValidacion", 
	procedureName = "SP_PROV_REMITOS_DEF_VALPEND", 
	resultClasses = {RemitoPendienteCargaDto.class}, 
	parameters = {     
            @StoredProcedureParameter(name="p_idproveedor", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_cursor", mode = ParameterMode.REF_CURSOR, type = void.class)
	}
)
public class RemitoPendienteValidacionDto extends TransformableDto<RemitoPendienteValidacionBo> implements Serializable {
    
    protected String pieza;
    protected String proveedor;
    protected Date fecha;
    protected Integer cantidad;
    protected String remito;
    protected String remDefPtoVenta;
    protected String remDefNumero;
    protected Date remDefFecha;
    protected String teileart;
    protected String teileartgruppe;
    protected String modelo;

    @Id
    @Column(name="pieza") 
    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }
    
    @Id
    @Column(name="proveedor") 
    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    @Id
    @Column(name="fecha") 
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Id
    @Column(name="cantidad") 
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    @Id
    @Column(name="remito") 
    public String getRemito() {
        return remito;
    }

    public void setRemito(String remito) {
        this.remito = remito;
    }
    
    @Id
    @Column(name="remdefptovta") 
    public String getRemDefPtoVenta() {
        return remDefPtoVenta;
    }

    public void setRemDefPtoVenta(String remDefPtoVenta) {
        this.remDefPtoVenta = remDefPtoVenta;
    }

    @Id
    @Column(name="remdefnumero") 
    public String getRemDefNumero() {
        return remDefNumero;
    }

    public void setRemDefNumero(String remDefNumero) {
        this.remDefNumero = remDefNumero;
    }
    
    @Id
    @Column(name="remdeffecha")
    public Date getRemDefFecha() {
        return remDefFecha;
    }

    public void setRemDefFecha(Date remDefFecha) {
        this.remDefFecha = remDefFecha;
    }
    
    @Id
    @Column(name="teileart") 
    public String getTeileart() {
        return teileart;
    }
    
    public void setTeileart(String teileart) {
        this.teileart = teileart;
    }
    
    @Id
    @Column(name="teileartgruppe") 
    public String getTeileartgruppe() {
        return teileartgruppe;
    }

    public void setTeileartgruppe(String teileartgruppe) {
        this.teileartgruppe = teileartgruppe;
    }
    
    @Id
    @Column(name="modelo")    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public RemitoPendienteValidacionBo translate() {
        RemitoPendienteValidacionBo reorder = translate(new RemitoPendienteValidacionBo());
        return reorder;
    }
    
}