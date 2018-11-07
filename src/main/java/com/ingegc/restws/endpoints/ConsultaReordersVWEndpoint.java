package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.consreordvw;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.ConsultaReordersVWService;
import com.ingegc.restws.webservice.xml.consultareordersvw.ConsultaReordersVWRequest;
import com.ingegc.restws.webservice.xml.consultareordersvw.ConsultaReordersVWResponse;
import com.ingegc.restws.webservice.xml.consultareordersvw.ReorderVW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ConsultaReordersVWEndpoint {
       
    @Autowired
    ConsultaReordersVWService consultaReordersService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+consreordvw, localPart = "consultaReordersVWRequest")
    @ResponsePayload
    public ConsultaReordersVWResponse consultaReordersVWRequest(@RequestPayload ConsultaReordersVWRequest request) {
        ConsultaReordersVWResponse response = new ConsultaReordersVWResponse();
        
        return consultaReordersService.translateResponse(
                consultaReordersService.serve(
                        consultaReordersService.translateRequest(request)
                )
        );
    }
}
