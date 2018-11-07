/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSInputBo;
import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.RemitoDefinitivoInputBo;
import com.ingegc.restws.daos.impl.ActualizarRemitoDefinitivioDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaCantidadReordersProvDaoImpl;
import com.ingegc.restws.daos.impl.InsertarRemitoDefinitivioDaoImpl;
import com.ingegc.restws.dtos.impl.CantidadReorderProvDto;
import com.ingegc.restws.dtos.impl.InsertRemitoDefinitivoDto;
import com.ingegc.restws.dtos.impl.UpdateRemitoDefinitivoDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.actualizacionremitosdefinitivos.ActualizacionRemitosDefinitivosRequest;
import com.ingegc.restws.webservice.xml.actualizacionremitosdefinitivos.ActualizacionRemitosDefinitivosResponse;
import com.ingegc.restws.webservice.xml.altaremitosdefinitivos.AltaRemitosDefinitivosRequest;
import com.ingegc.restws.webservice.xml.altaremitosdefinitivos.AltaRemitosDefinitivosResponse;
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
public class ActualizarRemitoDefinitivoService extends MonitoredService<
        ActualizacionRemitosDefinitivosRequest,
        ActualizacionRemitosDefinitivosResponse,
        RemitoDefinitivoInputBo,
        LawWSListBo<Integer, LawWSInputBo<Integer>>> {

    @Autowired
    ActualizarRemitoDefinitivioDaoImpl actualizarRemitoDefinitivioDaoImpl;
    
    @Override
    protected LawWSListBo monitoredServe(RemitoDefinitivoInputBo request) {
        List<UpdateRemitoDefinitivoDto> actualizacionRemitosDefinitivosResponses = actualizarRemitoDefinitivioDaoImpl.updateRemitoDefinitivo(request.translate());
        LawWSListBo<Integer, LawWSInputBo<Integer>> lawwsList = new LawWSListBo<Integer, LawWSInputBo<Integer>>();
        
        for (UpdateRemitoDefinitivoDto actualizacionRemitosDefinitivosResponse : actualizacionRemitosDefinitivosResponses) {
            lawwsList.getElements().add(actualizacionRemitosDefinitivosResponse.translate());
        }
        
        return lawwsList;
    }

    @Override
    public RemitoDefinitivoInputBo translateRequest(ActualizacionRemitosDefinitivosRequest extRequest) {
        RemitoDefinitivoInputBo remitoDef = new RemitoDefinitivoInputBo();
        remitoDef.setId(extRequest.getRemitosDefinitivos().getId());
        remitoDef.setProveedor(extRequest.getRemitosDefinitivos().getProveedor());
        remitoDef.setPieza(extRequest.getRemitosDefinitivos().getPieza());
        remitoDef.setRemitoProvFecha(DatesTool.getDate(extRequest.getRemitosDefinitivos().getRemitoProvFecha()));
        remitoDef.setRemitoProvNumero(extRequest.getRemitosDefinitivos().getRemitoProvNumero());
        remitoDef.setPtoVenta(extRequest.getRemitosDefinitivos().getPtoVenta());
        remitoDef.setNumero(extRequest.getRemitosDefinitivos().getNumero());
        remitoDef.setRemitoDefFecha(DatesTool.getDate(extRequest.getRemitosDefinitivos().getRemitoDefFecha()));
        remitoDef.setFechaCarga(DatesTool.getDate(extRequest.getRemitosDefinitivos().getFechaCarga()));
        remitoDef.setFechaValidacion(DatesTool.getDate(extRequest.getRemitosDefinitivos().getFechaValidacion()));
        remitoDef.setIdUsuario(extRequest.getRemitosDefinitivos().getIdUsuario());
        remitoDef.setPerfil(extRequest.getRemitosDefinitivos().getPerfil());
        return remitoDef;
    }
    
    @Override
    public ActualizacionRemitosDefinitivosResponse translateResponse(LawWSListBo<Integer, LawWSInputBo<Integer>> intResponse) {
        ActualizacionRemitosDefinitivosResponse actualizacionRemitosDefinitivosResponse = new ActualizacionRemitosDefinitivosResponse();
        
        List<Integer> actualizacionRemitoResponses = intResponse.translate();
        
        for (Integer actualizacionRemitoResponse : actualizacionRemitoResponses) {
            actualizacionRemitosDefinitivosResponse.setOperationResult(actualizacionRemitoResponse.toString());
        }
        
        return actualizacionRemitosDefinitivosResponse;
    }
    
}
