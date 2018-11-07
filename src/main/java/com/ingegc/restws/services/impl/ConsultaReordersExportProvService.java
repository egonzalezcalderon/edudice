/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.ReorderExportProvBo;
import com.ingegc.restws.bussiness.impl.ReorderProvBo;
import com.ingegc.restws.daos.impl.ConsultaReordersExportProvDaoImpl;
import com.ingegc.restws.dtos.impl.ReorderExportProvDto;
import com.ingegc.restws.dtos.impl.ReorderProvDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultareordersexportprov.ConsultaReordersExportProvRequest;
import com.ingegc.restws.webservice.xml.consultareordersexportprov.ConsultaReordersExportProvResponse;
import com.ingegc.restws.webservice.xml.consultareordersexportprov.ReorderExportProv;
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
public class ConsultaReordersExportProvService extends MonitoredService<
        ConsultaReordersExportProvRequest,
        ConsultaReordersExportProvResponse,
        ProveedorBo,
        LawWSListBo<ReorderExportProv, ReorderExportProvBo>> {

    @Autowired
    ConsultaReordersExportProvDaoImpl consultaExportReordersDao;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<ReorderExportProvDto> reorders = consultaExportReordersDao.getExportProvReorders(request.getId(), request.getFecha());
        LawWSListBo<ReorderExportProv, ReorderExportProvBo> lawwsList = new LawWSListBo<ReorderExportProv, ReorderExportProvBo>();
        
        for (ReorderExportProvDto reorder : reorders) {
            lawwsList.getElements().add(reorder.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(ConsultaReordersExportProvRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        proveedor.setFecha(DatesTool.getDate(extRequest.getFecha()));
        return proveedor;
    }

    @Override
    public ConsultaReordersExportProvResponse translateResponse(LawWSListBo<ReorderExportProv, ReorderExportProvBo> intResponse) {
        ConsultaReordersExportProvResponse consultaReorders = new ConsultaReordersExportProvResponse();
        
        List<ReorderExportProv> reorders = intResponse.translate();
        
        for (ReorderExportProv reorder : reorders) {
            consultaReorders.getReordersExportProv().add(reorder);
        }
        
        return consultaReorders;
    }
    
}
