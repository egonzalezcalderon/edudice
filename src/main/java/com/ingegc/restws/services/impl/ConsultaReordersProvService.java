/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.ReorderProvBo;
import com.ingegc.restws.daos.impl.ConsultaReordersProvDaoImpl;
import com.ingegc.restws.dtos.impl.ReorderProvDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultareordersprov.ConsultaReordersProvRequest;
import com.ingegc.restws.webservice.xml.consultareordersprov.ConsultaReordersProvResponse;
import com.ingegc.restws.webservice.xml.consultareordersprov.ReorderProv;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class ConsultaReordersProvService extends MonitoredService<
        ConsultaReordersProvRequest,
        ConsultaReordersProvResponse,
        ProveedorBo,
        LawWSListBo<ReorderProv, ReorderProvBo>> {

    @Autowired
    ConsultaReordersProvDaoImpl consultaReordersDao;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<ReorderProvDto> reorders = consultaReordersDao.getProvReorders(request.getId(), request.getFecha());
        LawWSListBo<ReorderProv, ReorderProvBo> lawwsList = new LawWSListBo<ReorderProv, ReorderProvBo>();
        
        for (ReorderProvDto reorder : reorders) {
            lawwsList.getElements().add(reorder.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(ConsultaReordersProvRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        proveedor.setFecha(DatesTool.getDate(extRequest.getFecha()));
        return proveedor;
    }

    @Override
    public ConsultaReordersProvResponse translateResponse(LawWSListBo<ReorderProv, ReorderProvBo> intResponse) {
        ConsultaReordersProvResponse consultaReorders = new ConsultaReordersProvResponse();
        
        List<ReorderProv> reorders = intResponse.translate();
        
        for (ReorderProv reorder : reorders) {
            consultaReorders.getReordersProv().add(reorder);
        }
        
        return consultaReorders;
    }
    
}
