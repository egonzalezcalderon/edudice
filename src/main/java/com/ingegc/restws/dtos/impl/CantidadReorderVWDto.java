/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.dtos.impl;

import com.ingegc.restws.bussiness.impl.LawWSDateBo;
import com.ingegc.restws.bussiness.impl.LawWSInputBo;
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
	name = "consultaCantidadReordersVW", 
	procedureName = "SP_PROV_REORDER_CANTVW", 
	resultClasses = {CantidadReorderVWDto.class}, 
	parameters = {     
            @StoredProcedureParameter(name="p_idproveedor", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_fecha", type = Date.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_cursor", mode = ParameterMode.REF_CURSOR, type = void.class)
	}
)
public class CantidadReorderVWDto extends TransformableDto<LawWSInputBo> implements Serializable {
    
    protected Integer cantidadPie;
       
    @Id
    @Column(name="cantidadpie")
    public Integer getCantidadPie() {
        return cantidadPie;
    }

    public void setCantidadPie(Integer cantidadPie) {
        this.cantidadPie = cantidadPie;
    }
    
    @Override
    public LawWSInputBo translate() {
        return new LawWSInputBo(cantidadPie);
    }   

}