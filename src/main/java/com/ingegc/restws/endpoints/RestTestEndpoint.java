/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.endpoints;

import com.ingegc.restws.bussiness.impl.DolarBo;
import com.ingegc.restws.bussiness.impl.SumBo;
import com.ingegc.restws.controllers.impl.LawWSController;
import com.ingegc.restws.services.impl.LogQueryService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Eduardo
 */
@RestController
@RequestMapping("/restservices")
public class RestTestEndpoint {
    
    @CrossOrigin         
    @GetMapping(value="/dolarstats")
    public List<DolarBo> getDollarStats() {
        List<DolarBo> dolarStats = new ArrayList<DolarBo>();
        
        DolarBo dolarBo1 = new DolarBo();
        DolarBo dolarBo2 = new DolarBo();
        
        dolarBo1.setDate("01/05/2019");
        dolarBo1.setBuyValue("36.50");
        dolarBo1.setSellValue("35.50");
        
        dolarBo2.setDate("01/04/2019");
        dolarBo2.setBuyValue("36.30");
        dolarBo2.setSellValue("35.30");
        
        dolarStats.add(dolarBo1);
        dolarStats.add(dolarBo2);
        
        return dolarStats;
    }
    
    @CrossOrigin
    @PostMapping("/sum")
    public SumBo getSumResult(@RequestBody SumBo sum) {
        sum.setResult(Integer.toString(Integer.parseInt(sum.getVal1())+Integer.parseInt(sum.getVal2())));
        return sum;
    }
    
}
