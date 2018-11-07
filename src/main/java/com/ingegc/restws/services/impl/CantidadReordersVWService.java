/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSInputBo;
import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.daos.impl.ConsultaCantidadReordersVWDaoImpl;
import com.ingegc.restws.dtos.impl.CantidadReorderVWDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.cantidadreordersvw.CantidadReordersVWRequest;
import com.ingegc.restws.webservice.xml.cantidadreordersvw.CantidadReordersVWResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class CantidadReordersVWService extends MonitoredService<
        CantidadReordersVWRequest,
        CantidadReordersVWResponse,
        ProveedorBo,
        LawWSListBo<Integer, LawWSInputBo<Integer>>> {

    @Autowired
    ConsultaCantidadReordersVWDaoImpl consultaCantidadReordersDao;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<CantidadReorderVWDto> cantidadReorders = consultaCantidadReordersDao.getCantidadReordersVW(request.getId(), request.getFecha());
        LawWSListBo<Integer, LawWSInputBo<Integer>> lawwsList = new LawWSListBo<Integer, LawWSInputBo<Integer>>();
        
        for (CantidadReorderVWDto cantidadReorder : cantidadReorders) {
            lawwsList.getElements().add(cantidadReorder.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(CantidadReordersVWRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdproveedor());
        proveedor.setFecha(DatesTool.getDate(extRequest.getFecha()));
        return proveedor;
    }

    @Override
    public CantidadReordersVWResponse translateResponse(LawWSListBo<Integer, LawWSInputBo<Integer>> intResponse) {
        CantidadReordersVWResponse cantidadReordersResponse = new CantidadReordersVWResponse();
        
        List<Integer> cantidadReorders = intResponse.translate();
        
        for (Integer cantidadReorder : cantidadReorders) {
            cantidadReordersResponse.getCantidadPie().add(cantidadReorder);
        }
        
        return cantidadReordersResponse;
    }
    
}
