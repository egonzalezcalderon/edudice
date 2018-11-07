/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.pseudocontrollers.impl;

import com.ingegc.restws.bussiness.impl.CantRemitosBo;
import com.ingegc.restws.bussiness.impl.LawWSInputBo;
import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.pseudocontrollers.core.PseudoController;
import com.ingegc.restws.services.impl.CantidadRemitosService;
import com.ingegc.restws.services.impl.CantidadReordersProvService;
import com.ingegc.restws.webservice.xml.cantidadremitos.CantidadRemitosResponse;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author a637201
 */
@Service
public class CantidadRemitosPseudoController extends PseudoController<ProveedorBo> {

    @Autowired
    CantidadRemitosService cantidadRemitosService;
    
    @Override
    public void fillControllerParameters(ModelAndView model) {
        model.addObject("inputCantRemitos", new ProveedorBo());
        model.addObject("cantRemitos", new ArrayList<CantRemitosBo>());
        model.addObject("cantidadremitosact", Boolean.FALSE);
    }

    @Override
    public ModelAndView processRequest(ModelAndView modelAndView, ProveedorBo modelAttribute) {
        LawWSListBo<CantidadRemitosResponse, CantRemitosBo> cantidadRemitos = cantidadRemitosService.serve(modelAttribute);
        modelAndView.addObject("inputCantRemitos", modelAttribute);
        modelAndView.addObject("cantRemitos", (cantidadRemitos != null)?cantidadRemitos.translate():new ArrayList<CantRemitosBo>());
        modelAndView.addObject("cantidadremitosact", Boolean.TRUE);
        return modelAndView;
    }
    
}
