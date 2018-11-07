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
import com.ingegc.restws.daos.impl.ConsultaFechasReordersProvDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaReordersProvDaoImpl;
import com.ingegc.restws.daos.impl.ConsultaReordersVWDaoImpl;
import com.ingegc.restws.dtos.impl.FechaReorderProvDto;
import com.ingegc.restws.dtos.impl.ReorderVWDto;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.tools.DatesTool;
import com.ingegc.restws.webservice.xml.consultareordersvw.ConsultaReordersVWRequest;
import com.ingegc.restws.webservice.xml.consultareordersvw.ConsultaReordersVWResponse;
import com.ingegc.restws.webservice.xml.consultareordersvw.ReorderVW;
import com.ingegc.restws.webservice.xml.fechasreordersprov.FechasReordersProvRequest;
import com.ingegc.restws.webservice.xml.fechasreordersprov.FechasReordersProvResponse;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class FechasReordersProvService extends MonitoredService<
        FechasReordersProvRequest,
        FechasReordersProvResponse,
        ProveedorBo,
        LawWSListBo<XMLGregorianCalendar, LawWSDateBo>> {

    @Autowired
    ConsultaFechasReordersProvDaoImpl consultaFechasReordersDao;
    
    @Override
    protected LawWSListBo monitoredServe(ProveedorBo request) {
        List<FechaReorderProvDto> reordersDates = consultaFechasReordersDao.getVWReordersDates(request.getId());
        LawWSListBo<XMLGregorianCalendar, LawWSDateBo> lawwsList = new LawWSListBo<XMLGregorianCalendar, LawWSDateBo>();
        
        for (FechaReorderProvDto reorderDate : reordersDates) {
            lawwsList.getElements().add(reorderDate.translate());
        }
        
        return lawwsList;
    }

    @Override
    public ProveedorBo translateRequest(FechasReordersProvRequest extRequest) {
        ProveedorBo proveedor = new ProveedorBo();
        proveedor.setId(extRequest.getIdProveedor());
        return proveedor;
    }

    @Override
    public FechasReordersProvResponse translateResponse(LawWSListBo<XMLGregorianCalendar, LawWSDateBo> intResponse) {
        FechasReordersProvResponse consultaReorders = new FechasReordersProvResponse();
        
        List<XMLGregorianCalendar> dates = intResponse.translate();
        
        for (XMLGregorianCalendar date : dates) {
            consultaReorders.getFechasReordersProv().add(date);
        }
        
        return consultaReorders;
    }
}
