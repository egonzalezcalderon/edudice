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
public class RemitosServicesController extends LawWSController {
    
    @Autowired
    CantidadRemitosPseudoController cantidadRemitosPseudoController;
    @Autowired  
    RemitosValidadosPseudoController remitosValidadosPseudoController;
    @Autowired  
    RemitosDetalladosPseudoController remitosDetalladosPseudoController;
    @Autowired
    RemitosAgrupadosPseudoController remitosAgrupadosPseudoController;
    @Autowired        
    RemitosPendientesCargaPseudoController remitosPendientesCargaPseudoController;
    @Autowired        
    RemitosPendientesValidacionPseudoController remitosPendientesValidacionPseudoController;    
    @Autowired        
    ConsultaRemitosPseudoController consultaRemitosPseudoController;        
    @Autowired        
    FechasRemitosPseudoController fechasRemitosPseudoController;        
    
    protected List<PseudoController> pseudoControllers = new ArrayList<PseudoController>();
    
    @PostConstruct
    public void init() {
        pseudoControllers.add(cantidadRemitosPseudoController);
        pseudoControllers.add(remitosValidadosPseudoController);
        pseudoControllers.add(remitosDetalladosPseudoController);
        pseudoControllers.add(remitosAgrupadosPseudoController);
        pseudoControllers.add(remitosPendientesCargaPseudoController);
        pseudoControllers.add(remitosPendientesValidacionPseudoController);
        pseudoControllers.add(consultaRemitosPseudoController);
        pseudoControllers.add(fechasRemitosPseudoController);        
    }
    
    protected ModelAndView getBaseModelAndView() {
        ModelAndView basicModelAndView = getBaseModelAndView("core/remitos");
        for (PseudoController pseudoController : pseudoControllers) {
            pseudoController.fillControllerParameters(basicModelAndView);
        }
        return basicModelAndView; 
    }
     
    @RequestMapping(value="/maintenance/services/remitos", method = RequestMethod.GET)
    public ModelAndView services(Model model) {
        return getBaseModelAndView();
    }   
     
    @RequestMapping(value="/maintenance/services/remitos/cantidadremitos", method = RequestMethod.GET)
    public ModelAndView cantidadRemitos(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/remitos/cantidadremitos", method = RequestMethod.POST)
    public ModelAndView cantidadRemitos(@ModelAttribute ProveedorBo proveedor) {
        return cantidadRemitosPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }            

    @RequestMapping(value="/maintenance/services/remitos/remitosvalidados", method = RequestMethod.GET)
    public ModelAndView remitosValidados(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/remitos/remitosvalidados", method = RequestMethod.POST)
    public ModelAndView remitosValidados(@ModelAttribute ProveedorBo proveedor) {
        return remitosValidadosPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }     
    
    @RequestMapping(value="/maintenance/services/remitos/remitosdetallados", method = RequestMethod.GET)
    public ModelAndView remitosDetallados(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/remitos/remitosdetallados", method = RequestMethod.POST)
    public ModelAndView remitosDetallados(@ModelAttribute ProveedorBo proveedor) {
        return remitosDetalladosPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }         
    
    @RequestMapping(value="/maintenance/services/remitos/remitosagrupados", method = RequestMethod.GET)
    public ModelAndView remitosAgrupados(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/remitos/remitosagrupados", method = RequestMethod.POST)
    public ModelAndView remitosAgrupados(@ModelAttribute ProveedorBo proveedor) {
        return remitosAgrupadosPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }   
    
    @RequestMapping(value="/maintenance/services/remitos/remitospendientesvalidacion", method = RequestMethod.GET)
    public ModelAndView remitosPendientesValidacion(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/remitos/remitospendientesvalidacion", method = RequestMethod.POST)
    public ModelAndView remitosPendientesValidacion(@ModelAttribute ProveedorBo proveedor) {
        return remitosPendientesValidacionPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }

    @RequestMapping(value="/maintenance/services/remitos/remitospendientescarga", method = RequestMethod.GET)
    public ModelAndView remitosPendientesCarga(Model model) {
        return getBaseModelAndView();
    }   
 
    @RequestMapping(value="/maintenance/services/remitos/remitospendientescarga", method = RequestMethod.POST)
    public ModelAndView remitosPendientesCarga(@ModelAttribute ProveedorBo proveedor) {
        return remitosPendientesCargaPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }
    
    @RequestMapping(value="/maintenance/services/remitos/consultaremitos", method = RequestMethod.GET)
    public ModelAndView remitos(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/remitos/consultaremitos", method = RequestMethod.POST)
    public ModelAndView remitos(@ModelAttribute ProveedorBo proveedor) {
        return consultaRemitosPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }      

    @RequestMapping(value="/maintenance/services/remitos/fechasremitos", method = RequestMethod.GET)
    public ModelAndView fechasRemitos(Model model) {
        return getBaseModelAndView();
    }   
    
    @RequestMapping(value="/maintenance/services/remitos/fechasremitos", method = RequestMethod.POST)
    public ModelAndView fechasRemitos(@ModelAttribute ProveedorBo proveedor) {
        return fechasRemitosPseudoController.processRequest(getBaseModelAndView(), proveedor);
    }    
}
