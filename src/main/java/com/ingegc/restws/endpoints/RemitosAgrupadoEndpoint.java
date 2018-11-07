package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.remagr;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.ConsultaRemitosAgrupadosService;
import com.ingegc.restws.webservice.xml.remitosagrupado.RemitoAgrupado;
import com.ingegc.restws.webservice.xml.remitosagrupado.RemitosAgrupadoRequest;
import com.ingegc.restws.webservice.xml.remitosagrupado.RemitosAgrupadoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class RemitosAgrupadoEndpoint {
        
    @Autowired
    ConsultaRemitosAgrupadosService consultaRemitosAgrupadosService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+remagr, localPart = "remitosAgrupadoRequest")
    @ResponsePayload
    public RemitosAgrupadoResponse remitosAgrupadoRequest(@RequestPayload RemitosAgrupadoRequest request) {
        RemitosAgrupadoResponse response = new RemitosAgrupadoResponse();
        
        return consultaRemitosAgrupadosService.translateResponse(
                consultaRemitosAgrupadosService.serve(
                        consultaRemitosAgrupadosService.translateRequest(request)
                )
        );
    }
}
