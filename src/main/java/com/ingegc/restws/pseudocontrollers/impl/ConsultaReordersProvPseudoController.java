/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.pseudocontrollers.impl;

import com.ingegc.restws.bussiness.impl.LawWSListBo;
import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.bussiness.impl.ReorderProvBo;
import com.ingegc.restws.bussiness.impl.ReorderVWBo;
import com.ingegc.restws.pseudocontrollers.core.PseudoController;
import com.ingegc.restws.services.impl.ConsultaReordersProvService;
import com.ingegc.restws.services.impl.ConsultaReordersVWService;
import com.ingegc.restws.webservice.xml.consultareordersprov.ReorderProv;
import com.ingegc.restws.webservice.xml.consultareordersvw.ReorderVW;
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
public class ConsultaReordersProvPseudoController extends PseudoController<ProveedorBo> {

    @Autowired
    ConsultaReordersProvService consultaReordersService;
    
    @Override
    public void fillControllerParameters(ModelAndView model) {
        model.addObject("inputConsultaReordProv", new ProveedorBo());
        model.addObject("reordersProv", new ArrayList<ReorderProvBo>());
        model.addObject("consreordprovact", Boolean.FALSE);
    }

    @Override
    public ModelAndView processRequest(ModelAndView modelAndView, ProveedorBo modelAttribute) {
        LawWSListBo<ReorderProv, ReorderProvBo> reordersProv = consultaReordersService.serve(modelAttribute);
               
        modelAndView.addObject("inputConsultaReordProv", modelAttribute);
        modelAndView.addObject("reordersProv", (reordersProv != null)? reordersProv.getElements():new ArrayList<ReorderProvBo>());
        modelAndView.addObject("consreordprovact", Boolean.TRUE);
        return modelAndView;
    }
    
}
