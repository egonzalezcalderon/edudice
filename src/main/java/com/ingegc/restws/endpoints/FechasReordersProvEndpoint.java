package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.fecreordprov;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.FechasReordersProvService;
import com.ingegc.restws.webservice.xml.fechasreordersprov.FechasReordersProvRequest;
import com.ingegc.restws.webservice.xml.fechasreordersprov.FechasReordersProvResponse;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class FechasReordersProvEndpoint {
        
    @Autowired
    FechasReordersProvService fechasReordersService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+fecreordprov, localPart = "fechasReordersProvRequest")
    @ResponsePayload
    public FechasReordersProvResponse fechasReordersProvRequest(@RequestPayload FechasReordersProvRequest request) {
        FechasReordersProvRequest response = new FechasReordersProvRequest();
        
        return fechasReordersService.translateResponse(
                fechasReordersService.serve(
                        fechasReordersService.translateRequest(request)
                )
        );
    }
}
