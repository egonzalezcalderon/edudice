package com.ingegc.restws.endpoints;

import static com.ingegc.restws.config.WebServiceConfig.consreordexpvw;
import static com.ingegc.restws.config.WebServiceConfig.webserviceNameSpace;
import com.ingegc.restws.services.impl.ConsultaReordersExportVWService;
import com.ingegc.restws.webservice.xml.consultareordersexportvw.ConsultaReordersExportVWRequest;
import com.ingegc.restws.webservice.xml.consultareordersexportvw.ConsultaReordersExportVWResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ConsultaReordersExportVWEndpoint {
       
    @Autowired
    ConsultaReordersExportVWService consultaReordersExportService;
    
    @PayloadRoot(namespace = webserviceNameSpace+"/"+consreordexpvw, localPart = "consultaReordersExportVWRequest")
    @ResponsePayload
    public ConsultaReordersExportVWResponse consultaReordersVWRequest(@RequestPayload ConsultaReordersExportVWRequest request) {
        ConsultaReordersExportVWResponse response = new ConsultaReordersExportVWResponse();
        
        return consultaReordersExportService.translateResponse(
                consultaReordersExportService.serve(
                        consultaReordersExportService.translateRequest(request)
                )
        );
    }
}
