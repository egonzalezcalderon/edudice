/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.pseudocontrollers.impl;

import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.ReorderVWBo;
import com.ingegc.restws.pseudocontrollers.core.ServicePseudoController;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.services.impl.ConsultaReordersVWService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author a637201
 */
@Service
public class ConsultaReordersVWPseudoController extends ServicePseudoController<ProveedorBo, List<ReorderVWBo>> {

    
    @Autowired
    ConsultaReordersVWService consultaReordersService;
    
    @Override
    protected MonitoredService getQueryService() {
        return consultaReordersService;
    }

    @Override
    protected String getPseudoControllerName() {
        return "reordersVW";
    }

    @Override
    protected ProveedorBo getNewInstanceOfInput() {
        return new ProveedorBo();
    }

    @Override
    protected List<ReorderVWBo> getNewInstanceOfOutput() {
        return new ArrayList<ReorderVWBo>();
    }
    
    
    
}
