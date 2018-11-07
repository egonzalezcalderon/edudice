/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.dtos.impl;

import com.ingegc.restws.bussiness.impl.ReorderExportVWBo;
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
	name = "consultaReordersExportVW", 
	procedureName = "SP_PROV_REORDER_EXPORT_SELVW", 
	resultClasses = {ReorderExportVWDto.class}, 
	parameters = {     
            @StoredProcedureParameter(name="p_idproveedor", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_fecha", type = Date.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_cursor", mode = ParameterMode.REF_CURSOR, type = void.class)
	}
)
public class ReorderExportVWDto extends TransformableDto<ReorderExportVWBo> implements Serializable {
    
    protected String codPluma;
    protected String pieza;
    protected Integer cantidad;
    protected Date fechaImportacion;
    protected String centroCosto;
    protected String fechaHoraReorder;
    protected String anio;
    protected String modelo;
    protected String teileartgruppe;
    protected String teileart;    
    protected String knr;
    protected String planta;
    
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

    @Id
    @Column(name="centrocosto")    
    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    @Id
    @Column(name="fechareorder")      
    public String getFechaHoraReorder() {
        return fechaHoraReorder;
    }

    public void setFechaHoraReorder(String fechaHoraReorder) {
        this.fechaHoraReorder = fechaHoraReorder;
    }
    
    @Id
    @Column(name="anio")  
    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    @Id
    @Column(name="modelo")  
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
    @Column(name="teileart")  
    public String getTeileart() {
        return teileart;
    }

    public void setTeileart(String teileart) {
        this.teileart = teileart;
    }
    
    public void setFechaImportacion(Date fechaImportacion) {
        this.fechaImportacion = fechaImportacion;
    }
       
    @Id
    @Column(name="knr") 
    public String getKnr() {
        return knr;
    }

    public void setKnr(String knr) {
        this.knr = knr;
    }

    @Id
    @Column(name="planta")         
    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }    
    
    @Override
    public ReorderExportVWBo translate() {
        ReorderExportVWBo reorder = translate(new ReorderExportVWBo());
        
        try {
            reorder.setFechaImp(fechaImportacion);
        } catch (Exception ex) {
            reorder.setFechaImp(null);
        }
        
        return reorder;
    }


    
}