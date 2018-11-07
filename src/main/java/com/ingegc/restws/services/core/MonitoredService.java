/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.core;

import com.ingegc.restws.bussiness.core.BussinessObject;
import com.ingegc.restws.bussiness.impl.LawWSLogRecordBo;
import com.ingegc.restws.daos.core.LawWSLogDao;
import com.ingegc.restws.tools.SessionTool;
import java.util.Date;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a637201
 */
public abstract class MonitoredService
        <ExtRequest,
        ExtResponse,
        IntRequest extends BussinessObject, 
        IntResponse extends BussinessObject> 
        implements SingleTaskService<ExtRequest, ExtResponse, IntRequest, IntResponse> {
    
    @Autowired
    protected LawWSLogDao lawWSLogDao;
    
    protected static Logger logger = Logger.getLogger(MonitoredService.class.getName());
   
    protected String getServiceName() {
        return this.getClass().getSimpleName();
    }

    protected abstract IntResponse monitoredServe(IntRequest request) throws Exception;

    protected LawWSLogRecordBo<IntRequest,IntResponse> logRecord = new LawWSLogRecordBo<IntRequest,IntResponse>();
    
    protected void logServiceExecution() {
        logger.info("Metodo Invocado: "+logRecord.serialize());
        try { 
            lawWSLogDao.save(logRecord.getLogRecordDto());
        } catch (Exception e) {
            
            logger.severe(
                "Ocurrio un error intentando persistir en Log de la Base de Datos. Detalle: "+
                        e.getStackTrace());
        }
    }
    
    @Override 
    public IntResponse serve(IntRequest request) {
        logRecord.setServiceName(getServiceName());
        logRecord.setStartDate(new Date());
        logRecord.setRequest(request);
        logRecord.setUserName(SessionTool.getCurrentUserName());
        logRecord.setIpSource(SessionTool.getCurrentIpSource());
        IntResponse response = null;
        
        try {
            response = monitoredServe(request);
            logRecord.setStatus("Ejecucion OK");
        } catch (Exception e) {
            logRecord.setStatus("Ejecucion Error. Detalle: "+ExceptionUtils.getRootCause(e).getMessage());
        }
        logRecord.setResponse(response);
        logRecord.setStopDate(new Date());
        logServiceExecution();
        return logRecord.getResponse();
    }
    
    
}
