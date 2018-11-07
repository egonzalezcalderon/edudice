package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.pendcarg;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.ConsultaRemitosPendientesCargaService;
import com.ingegc.restws.webservice.xml.pendientesdecarga.PendientesDeCargaRequest;
import com.ingegc.restws.webservice.xml.pendientesdecarga.PendientesDeCargaResponse;
import com.ingegc.restws.webservice.xml.pendientesdecarga.RemitoPendienteDeCarga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PendientesDeCargaEndpoint {
        
    @Autowired
    ConsultaRemitosPendientesCargaService consultaRemitosPendientesCargaService;    
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+pendcarg, localPart = "pendientesDeCargaRequest")
    @ResponsePayload
    public PendientesDeCargaResponse pendientesDeCargaRequest(@RequestPayload PendientesDeCargaRequest request) {
        PendientesDeCargaResponse response = new PendientesDeCargaResponse();
        
        return consultaRemitosPendientesCargaService.translateResponse(
                consultaRemitosPendientesCargaService.serve(
                        consultaRemitosPendientesCargaService.translateRequest(request)
                )
        );
    }
}
