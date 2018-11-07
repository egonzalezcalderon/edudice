/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.dtos.impl;

import com.ingegc.restws.bussiness.impl.RemitoDetalleBo;
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
	name = "consultaRemitosDetalle", 
	procedureName = "SP_PROV_REMITOS_DETALLE", 
	resultClasses = {RemitoDetalleDto.class}, 
	parameters = {     
            @StoredProcedureParameter(name="p_idproveedor", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_fecha", type = Date.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_cursor", mode = ParameterMode.REF_CURSOR, type = void.class)
	}
)
public class RemitoDetalleDto extends TransformableDto<RemitoDetalleBo> implements Serializable {
     
    protected String planta;
    protected Date fecha;
    protected String punto;
    protected String knr;
    protected String tmaimc;
    protected String color;
    protected String prefijo;
    protected String basico;
    protected String sufijo;
    protected Integer cantidad;
    protected String proveedor;
    protected Date fechaFis;
    protected String remito;
    protected String teileartgruppe;
    protected String notaPedido;
    protected String code7227;

    @Id
    @Column(name="planta")   
    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
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
    @Column(name="punto")
    public String getPunto() {
        return punto;
    }

    public void setPunto(String punto) {
        this.punto = punto;
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
    @Column(name="tmaimc")
    public String getTmaimc() {
        return tmaimc;
    }

    public void setTmaimc(String tmaimc) {
        this.tmaimc = tmaimc;
    }
    
    @Id
    @Column(name="color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Id
    @Column(name="prefijo")
    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
    
    @Id
    @Column(name="basico")
    public String getBasico() {
        return basico;
    }

    public void setBasico(String basico) {
        this.basico = basico;
    }
    
    @Id
    @Column(name="sufijcol")
    public String getSufijo() {
        return sufijo;
    }

    public void setSufijo(String sufijo) {
        this.sufijo = sufijo;
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
    @Column(name="proveedor")
    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    @Id
    @Column(name="fechafis")
    public Date getFechaFis() {
        return fechaFis;
    }

    public void setFechaFis(Date fechaFis) {
        this.fechaFis = fechaFis;
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
    @Column(name="teileartgruppe")
    public String getTeileartgruppe() {
        return teileartgruppe;
    }

    public void setTeileartgruppe(String teileartgruppe) {
        this.teileartgruppe = teileartgruppe;
    }
    
    @Id
    @Column(name="notapedido") 
    public String getNotaPedido() {
        return notaPedido;
    }

    public void setNotaPedido(String notaPedido) {
        this.notaPedido = notaPedido;
    }
    
    @Id
    @Column(name="code7227")  
    public String getCode7227() {
        return code7227;
    }

    public void setCode7227(String code7227) {
        this.code7227 = code7227;
    }
       
    @Override
    public RemitoDetalleBo translate() {
        RemitoDetalleBo reorder = translate(new RemitoDetalleBo());
        return reorder;
    }
    
}