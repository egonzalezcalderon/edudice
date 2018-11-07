/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.pseudocontrollers.core;

import com.ingegc.restws.bussiness.core.BussinessObject;
import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.services.core.MonitoredService;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author a637201
 */
public abstract class ServicePseudoController<ServiceInput extends BussinessObject, ServiceOutput> extends PseudoController<ServiceInput> {
        
    @Override
    public void fillControllerParameters(ModelAndView model) {
        model.addObject(getPseudoControllerName()+"Input", getNewInstanceOfInput());
        model.addObject(getPseudoControllerName(), getNewInstanceOfOutput());
        model.addObject(getPseudoControllerName()+"Act", Boolean.FALSE);
    }

    @Override
    public ModelAndView processRequest(ModelAndView modelAndView, ServiceInput modelAttribute) {
        LawWSListBo queryResult = (LawWSListBo) getQueryService().serve(modelAttribute);
        modelAndView.addObject(getPseudoControllerName()+"Input", modelAttribute);
        modelAndView.addObject(getPseudoControllerName(), (queryResult != null)?queryResult.getElements():getNewInstanceOfOutput());
        modelAndView.addObject(getPseudoControllerName()+"Act", Boolean.TRUE);
        return modelAndView;
    }
    
    protected abstract MonitoredService getQueryService();
    
    protected abstract String getPseudoControllerName();
    
    protected abstract ServiceInput getNewInstanceOfInput();
    
    protected abstract ServiceOutput getNewInstanceOfOutput();
    
}
