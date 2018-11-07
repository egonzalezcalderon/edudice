/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.dtos.impl;

import com.ingegc.restws.bussiness.impl.CantRemitosBo;
import com.ingegc.restws.bussiness.impl.LawWSInputBo;
import com.ingegc.restws.bussiness.impl.ReorderExportProvBo;
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
	name = "consultaCantidadRemitos", 
	procedureName = "SP_PROV_REMITOS_CANT", 
	resultClasses = {CantidadRemitosDto.class}, 
	parameters = {     
            @StoredProcedureParameter(name="p_idproveedor", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_fecha", type = Date.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_cursor", mode = ParameterMode.REF_CURSOR, type = void.class)
	}
)
public class CantidadRemitosDto extends TransformableDto<CantRemitosBo> implements Serializable {
    
    protected Integer cantidadPiezas;
    protected Integer cantidadRemitos;    

    @Id
    @Column(name="cantidadpie")    
    public Integer getCantidadPiezas() {
        return cantidadPiezas;
    }

    public void setCantidadPiezas(Integer cantidadPiezas) {
        this.cantidadPiezas = cantidadPiezas;
    }

    @Id
    @Column(name="cantidadremitos")
    public Integer getCantidadRemitos() {
        return cantidadRemitos;
    }

    public void setCantidadRemitos(Integer cantidadRemitos) {
        this.cantidadRemitos = cantidadRemitos;
    }
    
    @Override
    public CantRemitosBo translate() {
        return translate(new CantRemitosBo());
    }    

    

}