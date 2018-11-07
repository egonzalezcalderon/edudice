/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.RemitoBo;
import com.ingegc.restws.bussiness.impl.RemitoPendienteValidacionBo;
import com.ingegc.restws.bussiness.impl.RemitoValidadoBo;
import com.ingegc.restws.daos.impl.ConsultaRemitosDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaRemitosPendientesValidacionDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaRemitosValidadosDaoImpl;
import com.ingegc.restws.dtos.impl.RemitoDto;
import com.ingegc.restws.dtos.impl.RemitoPendienteValidacionDto;
import com.ingegc.restws.dtos.impl.RemitoValidadoDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultaremitos.ConsultaRemitosRequest;
import com.ingegc.restws.webservice.xml.consultaremitos.ConsultaRemitosResponse;
import com.ingegc.restws.webservice.xml.consultaremitos.Remito;
import com.ingegc.restws.webservice.xml.pendientesdevalidacion.PendientesDeValidacionRequest;
import com.ingegc.restws.webservice.xml.pendientesdevalidacion.PendientesDeValidacionResponse;
import com.ingegc.restws.webservice.xml.pendientesdevalidacion.RemitoPendienteDeValidacion;
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
public class ConsultaRemitosPendientesValidacionService extends MonitoredService<
        PendientesDeValidacionRequest,
        PendientesDeValidacionResponse,
        ProveedorBo,
        LawWSListBo<RemitoPendienteDeValidacion, RemitoPendienteValidacionBo>> {

    @Autowired
    ConsultaRemitosPendientesValidacionDaoImpl consultaRemitosPendientesValidacionDaoImpl;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<RemitoPendienteValidacionDto> remitos = consultaRemitosPendientesValidacionDaoImpl.getRemitosPendientesValidacion(request.getId());
        LawWSListBo<RemitoPendienteDeValidacion, RemitoPendienteValidacionBo> lawwsList = new LawWSListBo<RemitoPendienteDeValidacion, RemitoPendienteValidacionBo>();
        
        for (RemitoPendienteValidacionDto remito : remitos) {
            lawwsList.getElements().add(remito.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(PendientesDeValidacionRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        return proveedor;
    }

    @Override
    public PendientesDeValidacionResponse translateResponse(LawWSListBo<RemitoPendienteDeValidacion, RemitoPendienteValidacionBo> intResponse) {
        PendientesDeValidacionResponse consultaRemitos = new PendientesDeValidacionResponse();
        
        List<RemitoPendienteDeValidacion> remitos = intResponse.translate();
        
        for (RemitoPendienteDeValidacion remito : remitos) {
            consultaRemitos.getRemitosPendientesDeValidacion().add(remito);
        }
        
        return consultaRemitos;
    }
    
}
