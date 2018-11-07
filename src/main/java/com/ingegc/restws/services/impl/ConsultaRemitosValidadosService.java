/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.RemitoBo;
import com.ingegc.restws.bussiness.impl.RemitoValidadoBo;
import com.ingegc.restws.daos.impl.ConsultaRemitosDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaRemitosValidadosDaoImpl;
import com.ingegc.restws.dtos.impl.RemitoDto;
import com.ingegc.restws.dtos.impl.RemitoValidadoDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultaremitos.ConsultaRemitosRequest;
import com.ingegc.restws.webservice.xml.consultaremitos.ConsultaRemitosResponse;
import com.ingegc.restws.webservice.xml.consultaremitos.Remito;
import com.ingegc.restws.webservice.xml.remitosvalidados.RemitoValidado;
import com.ingegc.restws.webservice.xml.remitosvalidados.RemitosValidadosRequest;
import com.ingegc.restws.webservice.xml.remitosvalidados.RemitosValidadosResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class ConsultaRemitosValidadosService extends MonitoredService<
        RemitosValidadosRequest,
        RemitosValidadosResponse,
        ProveedorBo,
        LawWSListBo<RemitoValidado, RemitoValidadoBo>> {

    @Autowired
    ConsultaRemitosValidadosDaoImpl consultaRemitosValidadosDaoImpl;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<RemitoValidadoDto> remitos = consultaRemitosValidadosDaoImpl.getRemitosValidados(request.getId(), 
                request.getFechaDesde(),
                request.getFechaHasta());
        LawWSListBo<RemitoValidado, RemitoValidadoBo> lawwsList = new LawWSListBo<RemitoValidado, RemitoValidadoBo>();
        
        for (RemitoValidadoDto remito : remitos) {
            lawwsList.getElements().add(remito.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(RemitosValidadosRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        proveedor.setFechaDesde(DatesTool.getDate(extRequest.getFechaDesde()));
        proveedor.setFechaHasta(DatesTool.getDate(extRequest.getFechaHasta()));
        return proveedor;
    }

    @Override
    public RemitosValidadosResponse translateResponse(LawWSListBo<RemitoValidado, RemitoValidadoBo> intResponse) {
        RemitosValidadosResponse consultaRemitos = new RemitosValidadosResponse();
        
        List<RemitoValidado> remitos = intResponse.translate();
        
        for (RemitoValidado remito : remitos) {
            consultaRemitos.getRemitosValidados().add(remito);
        }
        
        return consultaRemitos;
    }
    
}
