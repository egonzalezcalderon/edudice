package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.fecdisp;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.FechasRemitosService;
import com.ingegc.restws.webservice.xml.fechasdisponibles.FechasDisponiblesRequest;
import com.ingegc.restws.webservice.xml.fechasdisponibles.FechasDisponiblesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class FechasDisponiblesEndpoint {
        
    @Autowired
    FechasRemitosService fechasRemitosService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+fecdisp, localPart = "fechasDisponiblesRequest")
    @ResponsePayload
    public FechasDisponiblesResponse fechasDisponiblesRequest(@RequestPayload FechasDisponiblesRequest request) {
        FechasDisponiblesResponse response = new FechasDisponiblesResponse();
        
        return fechasRemitosService.translateResponse(
                fechasRemitosService.serve(
                    fechasRemitosService.translateRequest(request)
                )
        );
    }
}
