/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.daos.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.ingegc.restws.daos.core.LawWSDao;
import com.ingegc.restws.dtos.impl.RemitoDefinitivoInputDto;
import com.ingegc.restws.dtos.impl.ReorderVWDto;
import com.ingegc.restws.dtos.impl.UpdateRemitoDefinitivoDto;
import java.util.Date;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author a637201
 */
@Repository
public class ActualizarRemitoDefinitivioDaoImpl extends LawWSDao {
    
    public List<UpdateRemitoDefinitivoDto> updateRemitoDefinitivo(RemitoDefinitivoInputDto remitoDefinitivoInput) {
        StoredProcedureQuery spQuery = createStoreProcedureQuery("updateRemitoDefinitivo");
        spQuery.setParameter("p_idusuario", remitoDefinitivoInput.getIdUsuario());
        spQuery.setParameter("p_perfil", remitoDefinitivoInput.getPerfil());              
        spQuery.setParameter("p_idproveedor", remitoDefinitivoInput.getProveedor());
        spQuery.setParameter("p_pieza", remitoDefinitivoInput.getPieza());
        spQuery.setParameter("p_remprov_fecha", remitoDefinitivoInput.getRemitoProvFecha());
        spQuery.setParameter("p_remprov_numero", remitoDefinitivoInput.getRemitoProvNumero());
        spQuery.setParameter("p_id", remitoDefinitivoInput.getId());
        spQuery.setParameter("p_pto_venta", remitoDefinitivoInput.getPtoVenta());
        spQuery.setParameter("p_numero", remitoDefinitivoInput.getNumero());
        spQuery.setParameter("p_fecha_remito_def", remitoDefinitivoInput.getRemitoDefFecha());
        spQuery.setParameter("p_fecha_carga", remitoDefinitivoInput.getFechaCarga());
        spQuery.setParameter("p_fecha_validacion", remitoDefinitivoInput.getFechaValidacion());
        return spQuery.getResultList();
    }
}