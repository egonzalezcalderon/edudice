/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.pseudocontrollers.impl;

import com.ingegc.restws.bussiness.impl.LawWSInputBo;
import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.RemitoAgrupadoBo;
import com.ingegc.restws.pseudocontrollers.core.PseudoController;
import com.ingegc.restws.pseudocontrollers.core.ServicePseudoController;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.services.impl.CantidadReordersProvService;
import com.ingegc.restws.services.impl.ConsultaRemitosAgrupadosService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *
 * @author a637201
 */
@Service
public class RemitosAgrupadosPseudoController extends ServicePseudoController<ProveedorBo, List<RemitoAgrupadoBo>> {

    @Autowired
    ConsultaRemitosAgrupadosService consultaRemitosAgrupadosService;

    @Override
    protected MonitoredService getQueryService() {
        return consultaRemitosAgrupadosService;
    }

    @Override
    protected String getPseudoControllerName() {
        return "remitosAgrupados";
    }

    @Override
    protected ProveedorBo getNewInstanceOfInput() {
        return new ProveedorBo();
    }

    @Override
    protected List<RemitoAgrupadoBo> getNewInstanceOfOutput() {
        return new ArrayList<RemitoAgrupadoBo>();
    }
    
    
}
