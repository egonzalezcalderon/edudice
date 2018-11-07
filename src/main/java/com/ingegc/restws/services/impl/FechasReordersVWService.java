/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LawWSDateBo;
import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.ReorderVWBo;
import com.ingegc.restws.daos.impl.ConsultaFechasReordersVWDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaReordersVWDaoImpl;
import com.ingegc.restws.dtos.impl.FechaReorderVWDto;
import com.ingegc.restws.dtos.impl.ReorderVWDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.webservice.xml.consultareordersvw.ReorderVW;
import com.ingegc.restws.webservice.xml.fechasreordersvw.FechasReordersVWRequest;
import com.ingegc.restws.webservice.xml.fechasreordersvw.FechasReordersVWResponse;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class FechasReordersVWService extends MonitoredService<
        FechasReordersVWRequest,
        FechasReordersVWResponse,
        ProveedorBo,
        LawWSListBo<XMLGregorianCalendar, LawWSDateBo>> {

    @Autowired
    ConsultaFechasReordersVWDaoImpl consultaFechasReordersDao;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<FechaReorderVWDto> reordersDates = consultaFechasReordersDao.getVWReordersDates(request.getId());
        LawWSListBo<XMLGregorianCalendar, LawWSDateBo> lawwsList = new LawWSListBo<XMLGregorianCalendar, LawWSDateBo>();
        
        for (FechaReorderVWDto reorderDate : reordersDates) {
            lawwsList.getElements().add(reorderDate.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(FechasReordersVWRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdproveedor());
        return proveedor;
    }

    @Override
    public FechasReordersVWResponse translateResponse(LawWSListBo<XMLGregorianCalendar, LawWSDateBo> intResponse) {
        FechasReordersVWResponse consultaReorders = new FechasReordersVWResponse();
        
        List<XMLGregorianCalendar> dates = intResponse.translate();
        
        for (XMLGregorianCalendar date : dates) {
            consultaReorders.getFechasReordersVW().add(date);
        }
        
        return consultaReorders;
    }


    
}
