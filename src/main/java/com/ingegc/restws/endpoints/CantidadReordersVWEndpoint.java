package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.cantreordvw;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.CantidadReordersVWService;
import com.ingegc.restws.webservice.xml.cantidadreordersvw.CantidadReordersVWRequest;
import com.ingegc.restws.webservice.xml.cantidadreordersvw.CantidadReordersVWResponse;
import com.ingegc.restws.webservice.xml.remitosdetalle.RemitosDetalleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CantidadReordersVWEndpoint {
        
    @Autowired
    CantidadReordersVWService cantidadReordersService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+cantreordvw, localPart = "cantidadReordersVWRequest")
    @ResponsePayload
    public CantidadReordersVWResponse cantidadReordersVWRequest(@RequestPayload CantidadReordersVWRequest request) {
        CantidadReordersVWResponse response = new CantidadReordersVWResponse();
        
        return cantidadReordersService.translateResponse(
                cantidadReordersService.serve(
                        cantidadReordersService.translateRequest(request)
                )
        );
    }
}
