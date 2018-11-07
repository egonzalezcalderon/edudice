/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.RemitoBo;
import com.ingegc.restws.bussiness.impl.RemitoPendienteCargaBo;
import com.ingegc.restws.bussiness.impl.RemitoValidadoBo;
import com.ingegc.restws.daos.impl.ConsultaRemitosDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaRemitosPendientesCargaDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaRemitosValidadosDaoImpl;
import com.ingegc.restws.dtos.impl.RemitoDto;
import com.ingegc.restws.dtos.impl.RemitoPendienteCargaDto;
import com.ingegc.restws.dtos.impl.RemitoValidadoDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultaremitos.ConsultaRemitosRequest;
import com.ingegc.restws.webservice.xml.consultaremitos.ConsultaRemitosResponse;
import com.ingegc.restws.webservice.xml.consultaremitos.Remito;
import com.ingegc.restws.webservice.xml.pendientesdecarga.PendientesDeCargaRequest;
import com.ingegc.restws.webservice.xml.pendientesdecarga.PendientesDeCargaResponse;
import com.ingegc.restws.webservice.xml.pendientesdecarga.RemitoPendienteDeCarga;
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
public class ConsultaRemitosPendientesCargaService extends MonitoredService<
        PendientesDeCargaRequest,
        PendientesDeCargaResponse,
        ProveedorBo,
        LawWSListBo<RemitoPendienteDeCarga, RemitoPendienteCargaBo>> {

    @Autowired
    ConsultaRemitosPendientesCargaDaoImpl consultaRemitosPendientesCargaDaoImpl;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<RemitoPendienteCargaDto> remitos = consultaRemitosPendientesCargaDaoImpl.getRemitosPendientesCarga(request.getId());
        LawWSListBo<RemitoPendienteDeCarga, RemitoPendienteCargaBo> lawwsList = new LawWSListBo<RemitoPendienteDeCarga, RemitoPendienteCargaBo>();
        
        for (RemitoPendienteCargaDto remito : remitos) {
            lawwsList.getElements().add(remito.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(PendientesDeCargaRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        return proveedor;
    }

    @Override
    public PendientesDeCargaResponse translateResponse(LawWSListBo<RemitoPendienteDeCarga, RemitoPendienteCargaBo> intResponse) {
        PendientesDeCargaResponse consultaRemitos = new PendientesDeCargaResponse();
        
        List<RemitoPendienteDeCarga> remitos = intResponse.translate();
        
        for (RemitoPendienteDeCarga remito : remitos) {
            consultaRemitos.getRemitosPendientesDeCarga().add(remito);
        }
        
        return consultaRemitos;
    }
    
}
