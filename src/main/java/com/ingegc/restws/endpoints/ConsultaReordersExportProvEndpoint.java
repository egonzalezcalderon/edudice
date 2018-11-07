package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.consreordexpprov;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.ConsultaReordersExportProvService;
import com.ingegc.restws.webservice.xml.consultareordersexportprov.ConsultaReordersExportProvRequest;
import com.ingegc.restws.webservice.xml.consultareordersexportprov.ConsultaReordersExportProvResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ConsultaReordersExportProvEndpoint {
       
    @Autowired
    ConsultaReordersExportProvService consultaExportReordersService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+consreordexpprov, localPart = "consultaReordersExportProvRequest")
    @ResponsePayload
    public ConsultaReordersExportProvResponse consultaReordersExportProvRequest(@RequestPayload ConsultaReordersExportProvRequest request) {
        ConsultaReordersExportProvResponse response = new ConsultaReordersExportProvResponse();
        
        return consultaExportReordersService.translateResponse(
                consultaExportReordersService.serve(
                        consultaExportReordersService.translateRequest(request)
                )
        );
    }
}
