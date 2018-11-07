package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.fecreordvw;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.FechasReordersVWService;
import com.ingegc.restws.webservice.xml.fechasreordersvw.FechasReordersVWRequest;
import com.ingegc.restws.webservice.xml.fechasreordersvw.FechasReordersVWResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class FechasReordersVWEndpoint {
     
    @Autowired
    FechasReordersVWService fechasReordersService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+fecreordvw, localPart = "fechasReordersVWRequest")
    @ResponsePayload
    public FechasReordersVWResponse fechasReordersVWRequest(@RequestPayload FechasReordersVWRequest request) {
        FechasReordersVWResponse response = new FechasReordersVWResponse();
        
        return fechasReordersService.translateResponse(
                fechasReordersService.serve(
                        fechasReordersService.translateRequest(request)
                )
        );
    }
}
