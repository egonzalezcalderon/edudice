/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.ReorderExportVWBo;
import com.ingegc.restws.bussiness.impl.ReorderVWBo;
import com.ingegc.restws.daos.impl.ConsultaReordersExportVWDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaReordersVWDaoImpl;
import com.ingegc.restws.dtos.impl.ReorderExportVWDto;
import com.ingegc.restws.dtos.impl.ReorderVWDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultareordersexportvw.ConsultaReordersExportVWRequest;
import com.ingegc.restws.webservice.xml.consultareordersexportvw.ConsultaReordersExportVWResponse;
import com.ingegc.restws.webservice.xml.consultareordersexportvw.ReorderExportVW;
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
public class ConsultaReordersExportVWService extends MonitoredService<
        ConsultaReordersExportVWRequest,
        ConsultaReordersExportVWResponse,
        ProveedorBo,
        LawWSListBo<ReorderExportVW, ReorderExportVWBo>> {

    @Autowired
    ConsultaReordersExportVWDaoImpl consultaExportReordersDao;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<ReorderExportVWDto> reorders = consultaExportReordersDao.getExportVWReorders(request.getId(), request.getFecha());
        LawWSListBo<ReorderExportVW, ReorderExportVWBo> lawwsList = new LawWSListBo<ReorderExportVW, ReorderExportVWBo>();
        
        for (ReorderExportVWDto reorder : reorders) {
            lawwsList.getElements().add(reorder.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(ConsultaReordersExportVWRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        proveedor.setFecha(DatesTool.getDate(extRequest.getFecha()));
        return proveedor;
    }

    @Override
    public ConsultaReordersExportVWResponse translateResponse(LawWSListBo<ReorderExportVW, ReorderExportVWBo> intResponse) {
        ConsultaReordersExportVWResponse consultaReorders = new ConsultaReordersExportVWResponse();
        
        List<ReorderExportVW> reorders = intResponse.translate();
        
        for (ReorderExportVW reorder : reorders) {
            consultaReorders.getReordersExportVW().add(reorder);
        }
        
        return consultaReorders;
    }
    
}
