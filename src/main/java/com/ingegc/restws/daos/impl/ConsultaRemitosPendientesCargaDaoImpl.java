/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.daos.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.ingegc.restws.daos.core.LawWSDao;
import com.ingegc.restws.dtos.impl.RemitoPendienteCargaDto;
import java.util.Date;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author a637201
 */
@Repository
public class ConsultaRemitosPendientesCargaDaoImpl extends LawWSDao {
    
    public List<RemitoPendienteCargaDto> getRemitosPendientesCarga(String idProveedor) {
        StoredProcedureQuery spQuery = createStoreProcedureQuery("consultaRemitosPendientesCarga");
        spQuery.setParameter("p_idproveedor", idProveedor);
        return spQuery.getResultList();
    }
}