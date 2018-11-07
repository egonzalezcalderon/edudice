/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.ReorderVWBo;
import com.ingegc.restws.daos.impl.ConsultaReordersVWDaoImpl;
import com.ingegc.restws.dtos.impl.ReorderVWDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultareordersvw.ConsultaReordersVWRequest;
import com.ingegc.restws.webservice.xml.consultareordersvw.ConsultaReordersVWResponse;
import com.ingegc.restws.webservice.xml.consultareordersvw.ReorderVW;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class ConsultaReordersVWService extends MonitoredService<
        ConsultaReordersVWRequest,
        ConsultaReordersVWResponse,
        ProveedorBo,
        LawWSListBo<ReorderVW, ReorderVWBo>> {

    @Autowired
    ConsultaReordersVWDaoImpl consultaReordersDao;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<ReorderVWDto> reorders = consultaReordersDao.getVWReorders(request.getId(), request.getFecha());
        LawWSListBo<ReorderVW, ReorderVWBo> lawwsList = new LawWSListBo<ReorderVW, ReorderVWBo>();
        
        for (ReorderVWDto reorder : reorders) {
            lawwsList.getElements().add(reorder.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(ConsultaReordersVWRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        proveedor.setFecha(DatesTool.getDate(extRequest.getFecha()));
        return proveedor;
    }

    @Override
    public ConsultaReordersVWResponse translateResponse(LawWSListBo<ReorderVW, ReorderVWBo> intResponse) {
        ConsultaReordersVWResponse consultaReorders = new ConsultaReordersVWResponse();
        
        List<ReorderVW> reorders = intResponse.translate();
        
        for (ReorderVW reorder : reorders) {
            consultaReorders.getReordersVW().add(reorder);
        }
        
        return consultaReorders;
    }
    
}
