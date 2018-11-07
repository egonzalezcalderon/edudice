/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.pseudocontrollers.impl;

import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.RemitoValidadoBo;
import com.ingegc.restws.pseudocontrollers.core.ServicePseudoController;
import com.ingegc.restws.services.core.MonitoredService;
import com.ingegc.restws.services.impl.ConsultaRemitosValidadosService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class RemitosValidadosPseudoController extends ServicePseudoController<ProveedorBo, List<RemitoValidadoBo>> {

    @Autowired
    ConsultaRemitosValidadosService consultaRemitosValidadosService;
    
    @Override
    protected MonitoredService getQueryService(){
        return consultaRemitosValidadosService;
    }
    
    @Override
    protected String getPseudoControllerName(){
        return "remitosValidados";
    }
    
    @Override
    protected ProveedorBo getNewInstanceOfInput(){
        return new ProveedorBo();
    }
    
    @Override
    protected List<RemitoValidadoBo> getNewInstanceOfOutput(){
        return new ArrayList<RemitoValidadoBo>();
    }
    
}
