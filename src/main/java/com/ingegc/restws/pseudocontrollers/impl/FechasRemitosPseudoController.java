/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.pseudocontrollers.impl;

import com.ingegc.restws.bussiness.impl.LawWSDateBo;
import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.RemitoPendienteCargaBo;
import com.ingegc.restws.pseudocontrollers.core.PseudoController;
import com.ingegc.restws.pseudocontrollers.core.ServicePseudoController;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.services.impl.FechasRemitosService;
import com.ingegc.restws.services.impl.FechasReordersVWService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author a637201
 */
@Service
public class FechasRemitosPseudoController extends ServicePseudoController<ProveedorBo, List<LawWSDateBo>> {
    
    @Autowired
    FechasRemitosService fechasRemitosService;
    
    @Override
    protected MonitoredService getQueryService() {
        return fechasRemitosService;
    }

    @Override
    protected String getPseudoControllerName() {
        return "fechasRemitos";
    }

    @Override
    protected ProveedorBo getNewInstanceOfInput() {
        return new ProveedorBo();
    }

    @Override
    protected List<LawWSDateBo> getNewInstanceOfOutput() {
        return new ArrayList<LawWSDateBo>();
    }
    
}
