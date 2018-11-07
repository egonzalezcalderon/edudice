/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.dtos.impl;

import com.ingegc.restws.bussiness.impl.LawWSInputBo;
import com.ingegc.restws.bussiness.impl.RemitoAgrupadoBo;
import com.ingegc.restws.bussiness.impl.RemitoBo;
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
	name = "updateRemitoDefinitivo", 
	procedureName = "SP_PROV_REMITOS_DEF_UPDATE", 
	resultClasses = {UpdateRemitoDefinitivoDto.class}, 
	parameters = {
            @StoredProcedureParameter(name="p_idusuario", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_perfil", type = String.class, mode = ParameterMode.IN),              
            @StoredProcedureParameter(name="p_idproveedor", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_pieza", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_remprov_fecha", type = Date.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_remprov_numero", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_id", type = Integer.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_pto_venta", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_numero", type = String.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_fecha_remito_def", type = Date.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_fecha_carga", type = Date.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_fecha_validacion", type = Date.class, mode = ParameterMode.IN),
            @StoredProcedureParameter(name="p_retval", type = Integer.class, mode = ParameterMode.OUT)
	}
)
public class UpdateRemitoDefinitivoDto extends TransformableDto<LawWSInputBo> implements Serializable {
     
    protected Integer result;
    
    @Id
    @Column(name="p_retval") 
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
    
    @Override
    public LawWSInputBo translate() {
        return new LawWSInputBo(result);
    }    
}