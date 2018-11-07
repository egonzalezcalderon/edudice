/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.controllers.impl;

import com.ingegc.restws.bussiness.impl.Greeting;
import com.ingegc.restws.bussiness.impl.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.HtmlUtils;

/**
 *
 * @author Eduardo
 */
@Controller
public class GreetingController extends LawWSController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
    
    @RequestMapping(value="/websocketservices/webSocketTest", method = RequestMethod.GET)
    public ModelAndView webSocketTest() {
        return new ModelAndView("services/webSocketTest");
    }
}




