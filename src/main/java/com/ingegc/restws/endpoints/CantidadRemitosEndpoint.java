package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.cantrem;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.CantidadRemitosService;
import com.ingegc.restws.services.impl.ConsultaRemitosService;
import com.ingegc.restws.webservice.xml.cantidadremitos.CantidadRemitosRequest;
import com.ingegc.restws.webservice.xml.cantidadremitos.CantidadRemitosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CantidadRemitosEndpoint {
        
    @Autowired
    CantidadRemitosService cantidadRemitosService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+cantrem, localPart = "cantidadRemitosRequest")
    @ResponsePayload
    public CantidadRemitosResponse cantidadRemitosRequest(@RequestPayload CantidadRemitosRequest request) {
        CantidadRemitosResponse response = new CantidadRemitosResponse();
        
        return cantidadRemitosService.translateResponse(
                cantidadRemitosService.serve(
                        cantidadRemitosService.translateRequest(request)
                )
        );
    }
}
