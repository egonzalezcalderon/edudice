/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.CantRemitosBo;
import com.ingegc.restws.bussiness.impl.LawWSInputBo;
import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.daos.impl.ConsultaCantidadRemitosDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaCantidadReordersVWDaoImpl;
import com.ingegc.restws.dtos.impl.CantidadRemitosDto;
import com.ingegc.restws.dtos.impl.CantidadReorderVWDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.cantidadremitos.CantidadRemitosRequest;
import com.ingegc.restws.webservice.xml.cantidadremitos.CantidadRemitosResponse;
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
public class CantidadRemitosService extends MonitoredService<
        CantidadRemitosRequest,
        CantidadRemitosResponse,
        ProveedorBo,
        LawWSListBo<CantidadRemitosResponse, CantRemitosBo>> {

    @Autowired
    ConsultaCantidadRemitosDaoImpl consultaCantidadRemitosDaoImpl;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<CantidadRemitosDto> cantidadRemitos = consultaCantidadRemitosDaoImpl.getCantidadRemitos(request.getId(), request.getFecha());
        LawWSListBo<CantidadRemitosResponse, CantRemitosBo> lawwsList = new LawWSListBo<CantidadRemitosResponse, CantRemitosBo>();
        
        for (CantidadRemitosDto cantRemitos : cantidadRemitos) {
            lawwsList.getElements().add(cantRemitos.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(CantidadRemitosRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        proveedor.setFecha(DatesTool.getDate(extRequest.getFecha()));
        return proveedor;
    }

    @Override
    public CantidadRemitosResponse translateResponse(LawWSListBo<CantidadRemitosResponse, CantRemitosBo> intResponse) {
        CantidadRemitosResponse cantidadRemitosResponse = new CantidadRemitosResponse();
        
        List<CantidadRemitosResponse> cantidadRemitos = intResponse.translate();
        
        for (CantidadRemitosResponse cantRemitos : cantidadRemitos) {
            cantidadRemitosResponse.setCantidadPiezas(cantRemitos.getCantidadPiezas());
            cantidadRemitosResponse.setCantidadRemitos(cantRemitos.getCantidadRemitos());
        }
        
        return cantidadRemitosResponse;
    }
    
}
