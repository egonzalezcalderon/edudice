/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.RemitoDetalleBo;
import com.ingegc.restws.daos.impl.ConsultaRemitosDetalleDaoImpl;
import com.ingegc.restws.dtos.impl.RemitoDetalleDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.remitosdetalle.DetalleRemito;
import com.ingegc.restws.webservice.xml.remitosdetalle.RemitosDetalleRequest;
import com.ingegc.restws.webservice.xml.remitosdetalle.RemitosDetalleResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class ConsultaRemitosDetalleService extends MonitoredService<
        RemitosDetalleRequest,
        RemitosDetalleResponse,
        ProveedorBo,
        LawWSListBo<DetalleRemito ,RemitoDetalleBo>> {

    @Autowired
    ConsultaRemitosDetalleDaoImpl consultaRemitosDetalleDaoImpl;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<RemitoDetalleDto> remitos = consultaRemitosDetalleDaoImpl.getRemitosDetalle(request.getId(), request.getFecha());
        LawWSListBo<DetalleRemito, RemitoDetalleBo> lawwsList = new LawWSListBo<DetalleRemito, RemitoDetalleBo>();
        
        for (RemitoDetalleDto remito : remitos) {
            lawwsList.getElements().add(remito.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(RemitosDetalleRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        proveedor.setFecha(DatesTool.getDate(extRequest.getFecha()));
        return proveedor;
    }

    @Override
    public RemitosDetalleResponse translateResponse(LawWSListBo<DetalleRemito ,RemitoDetalleBo> intResponse) {
        RemitosDetalleResponse consultaRemitos = new RemitosDetalleResponse();
        
        List<DetalleRemito> remitos = intResponse.translate();
        
        for (DetalleRemito remito : remitos) {
            consultaRemitos.getRemitosDetalle().add(remito);
        }
        
        return consultaRemitos;
    }
    
}
