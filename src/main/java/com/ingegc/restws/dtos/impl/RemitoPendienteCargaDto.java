/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.dtos.impl;

import com.ingegc.restws.bussiness.impl.RemitoBo;
import com.ingegc.restws.bussiness.impl.RemitoPendienteCargaBo;
import com.ingegc.restws.bussiness.impl.ReorderVWBo;
import com.ingegc.restws.dtos.core.TransformableDto;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
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
	name = "consultaRemitosPendientesCarga", 
	procedureName = "SP_PROV_REMITOS_DEF_PEND", 
	resultClasses = {RemitoPendienteCargaDto.class}, 
	parameters = {     
            @StoredProcedureParameter(name="p_idproveedor", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_cursor", mode = ParameterMode.REF_CURSOR, type = void.class)
	}
)
public class RemitoPendienteCargaDto extends TransformableDto<RemitoPendienteCargaBo> implements Serializable {
    
    protected String proveedor;
    protected Date fecha;
    protected String remito;
    protected String pieza;
    protected Integer cantidad;
    protected String teileart;
    protected String teileartgruppe;
    protected String modelo;

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
    @Column(name="remito") 
    public String getRemito() {
        return remito;
    }

    public void setRemito(String remito) {
        this.remito = remito;
    }
    
    @Id
    @Column(name="pieza") 
    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
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
    public RemitoPendienteCargaBo translate() {
        RemitoPendienteCargaBo reorder = translate(new RemitoPendienteCargaBo());
        return reorder;
    }


    
}