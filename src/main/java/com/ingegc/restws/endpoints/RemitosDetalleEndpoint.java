package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.remdet;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.ConsultaRemitosDetalleService;
import com.ingegc.restws.webservice.xml.remitosdetalle.DetalleRemito;
import com.ingegc.restws.webservice.xml.remitosdetalle.RemitosDetalleRequest;
import com.ingegc.restws.webservice.xml.remitosdetalle.RemitosDetalleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class RemitosDetalleEndpoint {
      
    @Autowired
    ConsultaRemitosDetalleService consultaRemitosDetalleService;    
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+remdet, localPart = "remitosDetalleRequest")
    @ResponsePayload
    public RemitosDetalleResponse remitosDetalleRequest(@RequestPayload RemitosDetalleRequest request) {
        RemitosDetalleResponse response = new RemitosDetalleResponse();
        
        return consultaRemitosDetalleService.translateResponse(
                consultaRemitosDetalleService.serve(
                        consultaRemitosDetalleService.translateRequest(request)
                )
        );
    }
}
