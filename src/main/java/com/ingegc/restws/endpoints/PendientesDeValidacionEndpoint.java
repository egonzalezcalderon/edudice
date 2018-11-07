package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.pendval;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.ConsultaRemitosPendientesValidacionService;
import com.ingegc.restws.webservice.xml.pendientesdevalidacion.PendientesDeValidacionRequest;
import com.ingegc.restws.webservice.xml.pendientesdevalidacion.PendientesDeValidacionResponse;
import com.ingegc.restws.webservice.xml.pendientesdevalidacion.RemitoPendienteDeValidacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PendientesDeValidacionEndpoint {
      
    @Autowired
    ConsultaRemitosPendientesValidacionService consultaRemitosPendientesValidacionService;      
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+pendval, localPart = "pendientesDeValidacionRequest")
    @ResponsePayload
    public PendientesDeValidacionResponse pendientesDeValidacionRequest(@RequestPayload PendientesDeValidacionRequest request) {
        PendientesDeValidacionResponse response = new PendientesDeValidacionResponse();
        
        return consultaRemitosPendientesValidacionService.translateResponse(
                consultaRemitosPendientesValidacionService.serve(
                        consultaRemitosPendientesValidacionService.translateRequest(request)
                )
        );
    }
}
