/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.pseudocontrollers.impl;

import com.ingegc.restws.bussiness.impl.LawWSInputBo;
import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.pseudocontrollers.core.PseudoController;
import com.ingegc.restws.services.impl.CantidadReordersProvService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author a637201
 */
@Service
public class ConsultaReordersExportProvPseudoController extends PseudoController<ProveedorBo> {

    @Autowired
    CantidadReordersProvService cantidadReordersService;
    
    @Override
    public void fillControllerParameters(ModelAndView model) {
        model.addObject("inputCantReordProv", new ProveedorBo());
        model.addObject("cantReordProv", new ArrayList<Integer>());
        model.addObject("cantreordprovact", Boolean.FALSE);
    }

    @Override
    public ModelAndView processRequest(ModelAndView modelAndView, ProveedorBo modelAttribute) {
        LawWSListBo<Integer, LawWSInputBo<Integer>> cantidadReorders = cantidadReordersService.serve(modelAttribute);
        modelAndView.addObject("inputCantReordProv", modelAttribute);
        modelAndView.addObject("cantReordProv", (cantidadReorders != null)?cantidadReorders.translate():new ArrayList<Integer>());
        modelAndView.addObject("cantreordprovact", Boolean.TRUE);
        return modelAndView;
    }
    
}
