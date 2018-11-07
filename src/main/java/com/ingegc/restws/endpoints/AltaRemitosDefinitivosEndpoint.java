package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.altaremdef;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.InsertarRemitoDefinitivoService;
import com.ingegc.restws.webservice.xml.altaremitosdefinitivos.AltaRemitosDefinitivosRequest;
import com.ingegc.restws.webservice.xml.altaremitosdefinitivos.AltaRemitosDefinitivosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AltaRemitosDefinitivosEndpoint {
        
    @Autowired
    InsertarRemitoDefinitivoService insertarRemitoDefinitivoService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+altaremdef, localPart = "altaRemitosDefinitivosRequest")
    @ResponsePayload
    public AltaRemitosDefinitivosResponse altaRemitosDefinitivosRequest(@RequestPayload AltaRemitosDefinitivosRequest request) {
        AltaRemitosDefinitivosResponse response = new AltaRemitosDefinitivosResponse();
        
        return insertarRemitoDefinitivoService.translateResponse(
                insertarRemitoDefinitivoService.serve(
                        insertarRemitoDefinitivoService.translateRequest(request)
                )
        );
    }
}
