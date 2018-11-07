package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.cantreordprov;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.CantidadReordersProvService;
import com.ingegc.restws.webservice.xml.cantidadreordersprov.CantidadReordersProvRequest;
import com.ingegc.restws.webservice.xml.cantidadreordersprov.CantidadReordersProvResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CantidadReordersProvEndpoint {
        
    @Autowired
    CantidadReordersProvService cantidadReordersService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+cantreordprov, localPart = "cantidadReordersProvRequest")
    @ResponsePayload
    public CantidadReordersProvResponse cantidadReordersProvRequest(@RequestPayload CantidadReordersProvRequest request) {
        CantidadReordersProvResponse response = new CantidadReordersProvResponse();
        
        return cantidadReordersService.translateResponse(
                cantidadReordersService.serve(
                        cantidadReordersService.translateRequest(request)
                )
        );
    }
}
