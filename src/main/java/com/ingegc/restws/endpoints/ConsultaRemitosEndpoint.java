package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.consrem;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.daos.impl.ConsultaRemitosDaoImpl;
import com.ingegc.restws.services.impl.ConsultaRemitosService;
import com.ingegc.restws.webservice.xml.consultaremitos.ConsultaRemitosRequest;
import com.ingegc.restws.webservice.xml.consultaremitos.ConsultaRemitosResponse;
import com.ingegc.restws.webservice.xml.consultaremitos.Remito;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.beans.factory.annotation.Autowired;

@Endpoint
public class ConsultaRemitosEndpoint {
        
    @Autowired
    ConsultaRemitosService consultaRemitosService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+consrem, localPart = "consultaRemitosRequest")
    @ResponsePayload
    public ConsultaRemitosResponse consultaRemitosRequest(@RequestPayload ConsultaRemitosRequest request) {
        ConsultaRemitosResponse response = new ConsultaRemitosResponse();
        
        return consultaRemitosService.translateResponse(
                consultaRemitosService.serve(
                        consultaRemitosService.translateRequest(request)
                )
        );
    }
}
