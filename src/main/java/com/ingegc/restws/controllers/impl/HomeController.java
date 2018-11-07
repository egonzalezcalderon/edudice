/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.controllers.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author A637201
 */
@Controller
public class HomeController extends LawWSController {
        
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView base() {
        return getBaseModelAndView("core/home");
    }
    
    @RequestMapping(value="/home", method = RequestMethod.GET)
    public ModelAndView home() {
        return getBaseModelAndView("core/home");
    }   
    
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView login() {
        return getBaseModelAndView("core/login");
    }
    
}
