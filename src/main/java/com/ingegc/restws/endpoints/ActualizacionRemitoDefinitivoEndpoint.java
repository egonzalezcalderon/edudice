package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.actualizaremdef;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.ActualizarRemitoDefinitivoService;
import com.ingegc.restws.webservice.xml.actualizacionremitosdefinitivos.ActualizacionRemitosDefinitivosRequest;
import com.ingegc.restws.webservice.xml.actualizacionremitosdefinitivos.ActualizacionRemitosDefinitivosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ActualizacionRemitoDefinitivoEndpoint {
       
    @Autowired
    ActualizarRemitoDefinitivoService actualizarRemitoDefinitivoService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+actualizaremdef, localPart = "actualizacionRemitoDefinitivoRequest")
    @ResponsePayload
    public ActualizacionRemitosDefinitivosResponse actualizacionRemitoDefinitivoRequest(@RequestPayload ActualizacionRemitosDefinitivosRequest request) {
        ActualizacionRemitosDefinitivosResponse response = new ActualizacionRemitosDefinitivosResponse();
        
        return actualizarRemitoDefinitivoService.translateResponse(
                actualizarRemitoDefinitivoService.serve(
                        actualizarRemitoDefinitivoService.translateRequest(request)
                )
        );
    }
}
