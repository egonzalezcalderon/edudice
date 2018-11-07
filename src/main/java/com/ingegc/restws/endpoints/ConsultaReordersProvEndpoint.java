package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.consreordprov;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.ConsultaReordersProvService;
import com.ingegc.restws.webservice.xml.consultareordersprov.ConsultaReordersProvRequest;
import com.ingegc.restws.webservice.xml.consultareordersprov.ConsultaReordersProvResponse;
import com.ingegc.restws.webservice.xml.consultareordersprov.ReorderProv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ConsultaReordersProvEndpoint {
       
    @Autowired
    ConsultaReordersProvService consultaReordersService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+consreordprov, localPart = "consultaReordersProvRequest")
    @ResponsePayload
    public ConsultaReordersProvResponse consultaReordersProvRequest(@RequestPayload ConsultaReordersProvRequest request) {
        ConsultaReordersProvResponse response = new ConsultaReordersProvResponse();
        
        return consultaReordersService.translateResponse(
                consultaReordersService.serve(
                        consultaReordersService.translateRequest(request)
                )
        );
    }
}
