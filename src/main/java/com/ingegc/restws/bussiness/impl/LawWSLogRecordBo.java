/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.BussinessObject;
import com.ingegc.restws.dtos.impl.LawWSLogRecordDto;
import java.util.Date;

/**
 *
 * @author a637201
 */
public class LawWSLogRecordBo<IntRequest extends BussinessObject, 
        IntResponse extends BussinessObject> extends BussinessObject {
    
    protected String serviceName;
    protected Date startDate;
    protected Date stopDate;
    protected IntRequest request;
    protected IntResponse response;
    protected String status;
    protected String userName;
    protected String ipSource;    

    public IntRequest getRequest() {
        return request;
    }

    public void setRequest(IntRequest request) {
        this.request = request;
    }

    public IntResponse getResponse() {
        return response;
    }

    public void setResponse(IntResponse response) {
        this.response = response;
    }
    
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }    

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIpSource() {
        return ipSource;
    }

    public void setIpSource(String ipSource) {
        this.ipSource = ipSource;
    }
    
    public LawWSLogRecordDto getLogRecordDto() {
        LawWSLogRecordDto logRecordDto = new LawWSLogRecordDto();
        logRecordDto.setExecutedMethod(serviceName);
        logRecordDto.setRequestMade(getRequest().serialize());
        logRecordDto.setStartDate(getStartDate());
        logRecordDto.setStopDate(getStopDate());
        logRecordDto.setStatus(getStatus());
        logRecordDto.setIpSource(getIpSource());
        logRecordDto.setUserName(getUserName());
        return logRecordDto;
    }
    
    
}
