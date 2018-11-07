/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.dtos.impl;

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
	name = "consultaReordersVW", 
	procedureName = "SP_PROV_REORDER_SELVW", 
	resultClasses = {ReorderVWDto.class}, 
	parameters = {     
            @StoredProcedureParameter(name="p_idproveedor", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_fecha", type = Date.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_cursor", mode = ParameterMode.REF_CURSOR, type = void.class)
	}
)
public class ReorderVWDto extends TransformableDto<ReorderVWBo> implements Serializable {
    
    protected String codPluma;
    protected String pieza;
    protected Integer cantidad;
    protected Date fechaImportacion;

    @Id
    @Column(name="codpluma")
    public String getCodPluma() {
        return codPluma;
    }

    public void setCodPluma(String codPluma) {
        this.codPluma = codPluma;
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
    @Column(name="fechaimportacion")
    public Date getFechaImportacion() {
        return fechaImportacion;
    }

    public void setFechaImportacion(Date fechaImportacion) {
        this.fechaImportacion = fechaImportacion;
    }
       
    @Override
    public ReorderVWBo translate() {
        ReorderVWBo reorder = translate(new ReorderVWBo());
        
        try {
            reorder.setFechaImp(fechaImportacion);
        } catch (Exception ex) {
            reorder.setFechaImp(null);
        }
        
        return reorder;
    }


    
}