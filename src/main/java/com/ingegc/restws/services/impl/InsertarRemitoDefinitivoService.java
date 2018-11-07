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
import com.ingegc.restws.daos.impl.ConsultaCantidadReordersProvDaoImpl;
import com.ingegc.restws.daos.impl.InsertarRemitoDefinitivioDaoImpl;
import com.ingegc.restws.dtos.impl.CantidadReorderProvDto;
import com.ingegc.restws.dtos.impl.InsertRemitoDefinitivoDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
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
public class InsertarRemitoDefinitivoService extends MonitoredService<
        AltaRemitosDefinitivosRequest,
        AltaRemitosDefinitivosResponse,
        RemitoDefinitivoInputBo,
        LawWSListBo<Integer, LawWSInputBo<Integer>>> {

    @Autowired
    InsertarRemitoDefinitivioDaoImpl insertarRemitoDefinitivioDaoImpl;
    
    @Override
    protected LawWSListBo monitoredServe(RemitoDefinitivoInputBo request) {
        List<InsertRemitoDefinitivoDto> altaRemitosDefinitivosResponses = insertarRemitoDefinitivioDaoImpl.insertRemitoDefinitivo(request.translate());
        LawWSListBo<Integer, LawWSInputBo<Integer>> lawwsList = new LawWSListBo<Integer, LawWSInputBo<Integer>>();
        
        for (InsertRemitoDefinitivoDto altaRemitosDefinitivosResponse : altaRemitosDefinitivosResponses) {
            lawwsList.getElements().add(altaRemitosDefinitivosResponse.translate());
        }
        
        return lawwsList;
    }

    @Override
    public RemitoDefinitivoInputBo translateRequest(AltaRemitosDefinitivosRequest extRequest) {
        RemitoDefinitivoInputBo remitoDef = new RemitoDefinitivoInputBo();
        remitoDef.setProveedor(extRequest.getRemitosDefinitivos().getProveedor());
        remitoDef.setPieza(extRequest.getRemitosDefinitivos().getPieza());
        remitoDef.setRemitoProvFecha(DatesTool.getDate(extRequest.getRemitosDefinitivos().getRemitoProvFecha()));
        remitoDef.setRemitoProvNumero(extRequest.getRemitosDefinitivos().getRemitoProvNumero());
        remitoDef.setPtoVenta(extRequest.getRemitosDefinitivos().getPtoVenta());
        remitoDef.setNumero(extRequest.getRemitosDefinitivos().getNumero());
        remitoDef.setRemitoDefFecha(DatesTool.getDate(extRequest.getRemitosDefinitivos().getRemDefFecha()));
        remitoDef.setIdUsuario(extRequest.getRemitosDefinitivos().getIdUsuario());
        return remitoDef;
    }

    @Override
    public AltaRemitosDefinitivosResponse translateResponse(LawWSListBo<Integer, LawWSInputBo<Integer>> intResponse) {
        AltaRemitosDefinitivosResponse altaRemitosDefinitivosResponse = new AltaRemitosDefinitivosResponse();
        
        List<Integer> altaRemitoResponses = intResponse.translate();
        
        for (Integer altaRemitoResponse : altaRemitoResponses) {
            altaRemitosDefinitivosResponse.setOperationResult(altaRemitoResponse.toString());
        }
        
        return altaRemitosDefinitivosResponse;
    }
    
}
