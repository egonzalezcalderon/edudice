/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.RemitoBo;
import com.ingegc.restws.daos.impl.ConsultaRemitosDaoImpl;
import com.ingegc.restws.dtos.impl.RemitoDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultaremitos.ConsultaRemitosRequest;
import com.ingegc.restws.webservice.xml.consultaremitos.ConsultaRemitosResponse;
import com.ingegc.restws.webservice.xml.consultaremitos.Remito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class ConsultaRemitosService extends MonitoredService<
        ConsultaRemitosRequest,
        ConsultaRemitosResponse,
        ProveedorBo,
        LawWSListBo<Remito ,RemitoBo>> {

    @Autowired
    ConsultaRemitosDaoImpl consultaRemitosDao;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<RemitoDto> remitos = consultaRemitosDao.getRemitos(request.getId(), request.getFecha());
        LawWSListBo<Remito, RemitoBo> lawwsList = new LawWSListBo<Remito, RemitoBo>();
        
        for (RemitoDto remito : remitos) {
            lawwsList.getElements().add(remito.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(ConsultaRemitosRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        proveedor.setFecha(DatesTool.getDate(extRequest.getFecha()));
        return proveedor;
    }

    @Override
    public ConsultaRemitosResponse translateResponse(LawWSListBo<Remito ,RemitoBo> intResponse) {
        ConsultaRemitosResponse consultaRemitos = new ConsultaRemitosResponse();
        
        List<Remito> remitos = intResponse.translate();
        
        for (Remito remito : remitos) {
            consultaRemitos.getRemitos().add(remito);
        }
        
        return consultaRemitos;
    }
    
}
