/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.daos.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.ingegc.restws.daos.core.LawWSDao;
import com.ingegc.restws.dtos.impl.RemitoPendienteValidacionDto;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author a637201
 */
@Repository
public class ConsultaRemitosPendientesValidacionDaoImpl extends LawWSDao {
    
    public List<RemitoPendienteValidacionDto> getRemitosPendientesValidacion(String idProveedor) {
        StoredProcedureQuery spQuery = createStoreProcedureQuery("consultaRemitosPendientesValidacion");
        spQuery.setParameter("p_idproveedor", idProveedor);
        return spQuery.getResultList();
    }
}