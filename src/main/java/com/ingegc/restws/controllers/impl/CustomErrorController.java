/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.controllers.impl;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

/**
 *
 * @author a637201
 */
@Controller
public class CustomErrorController implements ErrorController{
    protected static final String ERROR_PATH = "/error";
        
    @RequestMapping(value = ERROR_PATH, method = RequestMethod.GET)
    public ModelAndView error() {
        return new ModelAndView("core/error");
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
    
}