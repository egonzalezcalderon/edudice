/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.RemitoAgrupadoBo;
import com.ingegc.restws.bussiness.impl.RemitoDetalleBo;
import com.ingegc.restws.daos.impl.ConsultaRemitosAgrupadosDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaRemitosDetalleDaoImpl;
import com.ingegc.restws.dtos.impl.RemitoAgrupadoDto;
import com.ingegc.restws.dtos.impl.RemitoDetalleDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.remitosagrupado.RemitoAgrupado;
import com.ingegc.restws.webservice.xml.remitosagrupado.RemitosAgrupadoRequest;
import com.ingegc.restws.webservice.xml.remitosagrupado.RemitosAgrupadoResponse;
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
public class ConsultaRemitosAgrupadosService extends MonitoredService<
        RemitosAgrupadoRequest,
        RemitosAgrupadoResponse,
        ProveedorBo,
        LawWSListBo<RemitoAgrupado ,RemitoAgrupadoBo>> {

    @Autowired
    ConsultaRemitosAgrupadosDaoImpl consultaRemitosAgrupadosDaoImpl;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<RemitoAgrupadoDto> remitos = consultaRemitosAgrupadosDaoImpl.getRemitosAgrupados(request.getId(), 
                request.getFecha());
        LawWSListBo<RemitoAgrupado ,RemitoAgrupadoBo> lawwsList = new LawWSListBo<RemitoAgrupado ,RemitoAgrupadoBo>();
        
        for (RemitoAgrupadoDto remito : remitos) {
            lawwsList.getElements().add(remito.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(RemitosAgrupadoRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        proveedor.setFecha(DatesTool.getDate(extRequest.getFecha()));
        return proveedor;
    }

    @Override
    public RemitosAgrupadoResponse translateResponse(LawWSListBo<RemitoAgrupado ,RemitoAgrupadoBo> intResponse) {
        RemitosAgrupadoResponse consultaRemitos = new RemitosAgrupadoResponse();
        
        List<RemitoAgrupado> remitos = intResponse.translate();
        
        for (RemitoAgrupado remito : remitos) {
            consultaRemitos.getRemitosAgrupados().add(remito);
        }
        
        return consultaRemitos;
    }
    
}
