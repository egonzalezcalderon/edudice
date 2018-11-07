/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSInputBo;
import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.daos.impl.ConsultaCantidadReordersProvDaoImpl;
import com.ingegc.restws.dtos.impl.CantidadReorderProvDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.cantidadreordersprov.CantidadReordersProvRequest;
import com.ingegc.restws.webservice.xml.cantidadreordersprov.CantidadReordersProvResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class CantidadReordersProvService extends MonitoredService<
        CantidadReordersProvRequest,
        CantidadReordersProvResponse,
        ProveedorBo,
        LawWSListBo<Integer, LawWSInputBo<Integer>>> {

    @Autowired
    ConsultaCantidadReordersProvDaoImpl consultaCantidadReordersDao;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<CantidadReorderProvDto> cantidadReorders = consultaCantidadReordersDao.getCantidadReordersProv(request.getId(), request.getFecha());
        LawWSListBo<Integer, LawWSInputBo<Integer>> lawwsList = new LawWSListBo<Integer, LawWSInputBo<Integer>>();
        
        for (CantidadReorderProvDto cantidadReorder : cantidadReorders) {
            lawwsList.getElements().add(cantidadReorder.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(CantidadReordersProvRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdproveedor());
        proveedor.setFecha(DatesTool.getDate(extRequest.getFecha()));
        return proveedor;
    }

    @Override
    public CantidadReordersProvResponse translateResponse(LawWSListBo<Integer, LawWSInputBo<Integer>> intResponse) {
        CantidadReordersProvResponse cantidadReordersResponse = new CantidadReordersProvResponse();
        
        List<Integer> cantidadReorders = intResponse.translate();
        
        for (Integer cantidadReorder : cantidadReorders) {
            cantidadReordersResponse.getCantidadPie().add(cantidadReorder);
        }
        
        return cantidadReordersResponse;
    }
    
}
