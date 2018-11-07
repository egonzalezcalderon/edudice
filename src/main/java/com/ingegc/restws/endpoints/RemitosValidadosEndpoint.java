package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.remval;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.ConsultaRemitosValidadosService;
import com.ingegc.restws.webservice.xml.remitosvalidados.RemitoValidado;
import com.ingegc.restws.webservice.xml.remitosvalidados.RemitosValidadosRequest;
import com.ingegc.restws.webservice.xml.remitosvalidados.RemitosValidadosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class RemitosValidadosEndpoint {
        
    @Autowired
    ConsultaRemitosValidadosService consultaRemitosValidadosService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+remval, localPart = "remitosValidadosRequest")
    @ResponsePayload
    public RemitosValidadosResponse remitosValidadosRequest(@RequestPayload RemitosValidadosRequest request) {
        RemitosValidadosResponse response = new RemitosValidadosResponse();
        
        return consultaRemitosValidadosService.translateResponse(
                consultaRemitosValidadosService.serve(
                    consultaRemitosValidadosService.translateRequest(request)
                )
        );
    }
}
