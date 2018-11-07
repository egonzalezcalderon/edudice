/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.controllers.impl;

import com.ingegc.restws.bussiness.impl.ProveedorBo;
import com.ingegc.restws.pseudocontrollers.core.PseudoController;
import com.ingegc.restws.pseudocontrollers.impl.CantidadRemitosPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.CantidadReordersProvPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.CantidadReordersVWPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.ConsultaRemitosPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.ConsultaReordersProvPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.ConsultaReordersVWPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.FechasRemitosPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.FechasReordersProvPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.FechasReordersVWPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.RemitosAgrupadosPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.RemitosDetalladosPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.RemitosPendientesCargaPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.RemitosPendientesValidacionPseudoController;
import com.ingegc.restws.pseudocontrollers.impl.RemitosValidadosPseudoController;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

/**
 *
 * @author a637201
 */
@Controller
public class ReordersServicesController extends LawWSController {
    
    @Autowired 
    CantidadReordersProvPseudoController cantidadReordersProvPseudoController;
    @Autowired 
    CantidadReordersVWPseudoController cantidadReordersVWPseudoController;
    @Autowired 
    ConsultaReordersProvPseudoController consultaReordersProvPseudoController;
    @Autowired 
    ConsultaReordersVWPseudoController consultaReordersVWPseudoController;
    @Autowired 
    FechasReordersProvPseudoController fechasReordersProvPseudoController;
    @Autowired 
    FechasReordersVWPseudoController fechasReordersVWPseudoController;
    
    protected List<PseudoController> pseudoControllers = new ArrayList<PseudoController>();
    
    @PostConstruct
    public void init() {
        pseudoControllers.add(cantidadReordersProvPseudoController);
        pseudoControllers.add(cantidadReordersVWPseudoController);
        pseudoControllers.add(consultaReordersProvPseudoController);
        pseudoControllers.add(consultaReordersVWPseudoController);
        pseudoControllers.add(fechasReordersProvPseudoController);
        pseudoControllers.add(fechasReordersVWPseudoController);     
    }
    
    protected ModelAndView getBaseModelAndView() {
        ModelAndView basicModelAndView = getBaseModelAndView("core/reorders");
        for (PseudoController pseudoController : pseudoControllers) {
            pseudoController.fillControllerParameters(basicModelAndView);
        }
        return basicModelAndView; 
    }
     
    @RequestMapping(value="/maintenance/services/reorders", method = RequestMethod.GET)
    public ModelAndView services(Model model) {
        return getBaseModelAndView();
    }   
     
    @RequestMapping(value="/maintenance/services/reorders/cantidadreordersprov", method = RequestMethod.GET)
    public ModelAndView cantidadReordersProv(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/reorders/cantidadreordersprov", method = RequestMethod.POST)
    public ModelAndView cantidadReordersProv(@ModelAttribute ProveedorBo proveedor) {
        return cantidadReordersProvPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }
    
    @RequestMapping(value="/maintenance/services/reorders/cantidadreordersvw", method = RequestMethod.GET)
    public ModelAndView cantidadReordersVW(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/reorders/cantidadreordersvw", method = RequestMethod.POST)
    public ModelAndView cantidadReordersVW(@ModelAttribute ProveedorBo proveedor) {
        return cantidadReordersVWPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }

    @RequestMapping(value="/maintenance/services/reorders/consultareordersprov", method = RequestMethod.GET)
    public ModelAndView consultaReordersProv(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/reorders/consultareordersprov", method = RequestMethod.POST)
    public ModelAndView consultaReordersProv(@ModelAttribute ProveedorBo proveedor) {
        return consultaReordersProvPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }

    @RequestMapping(value="/maintenance/services/reorders/consultareordersvw", method = RequestMethod.GET)
    public ModelAndView consultaReordersVW(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/reorders/consultareordersvw", method = RequestMethod.POST)
    public ModelAndView consultaReordersVW(@ModelAttribute ProveedorBo proveedor) {
        return consultaReordersVWPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }

    @RequestMapping(value="/maintenance/services/reorders/fechasreordersprov", method = RequestMethod.GET)
    public ModelAndView fechasReordersProv(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/reorders/fechasreordersprov", method = RequestMethod.POST)
    public ModelAndView fechasReordersProv(@ModelAttribute ProveedorBo proveedor) {
        return fechasReordersProvPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }    
    
    @RequestMapping(value="/maintenance/services/reorders/fechasreordersvw", method = RequestMethod.GET)
    public ModelAndView fechasReordersVW(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/reorders/fechasreordersvw", method = RequestMethod.POST)
    public ModelAndView fechasReordersVW(@ModelAttribute ProveedorBo proveedor) {
        return fechasReordersVWPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }        
    
}
