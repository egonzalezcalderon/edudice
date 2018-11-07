package com.ingegc.restws.endpoints;

import com.ingegc.restws.webservice.xml.GetEmployeeRequest;
import com.ingegc.restws.webservice.xml.GetEmployeeResponse;
import com.ingegc.restws.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Innova on 02-10-2017.
 */
@Endpoint
public class EmployeeEndpoint {
    private static final String NAMESPACE_URI = "http://ingegc.com/restws/webservice/xml";

    private EmployeeRepository empRepository;

    @Autowired
    public EmployeeEndpoint(EmployeeRepository empRepository) {
        this.empRepository = empRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeRequest")
    @ResponsePayload
    public GetEmployeeResponse getEmployee(@RequestPayload GetEmployeeRequest request) {
        GetEmployeeResponse response = new GetEmployeeResponse();
        response.setEmployee(empRepository.findEmployee(request.getId()));

        return response;
    }
}
