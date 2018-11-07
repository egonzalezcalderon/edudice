/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.services.impl;

import com.ingegc.restws.bussiness.impl.LogRecordsBo;
import com.ingegc.restws.bussiness.impl.LogRequestBo;
import com.ingegc.restws.daos.core.LawWSLogDao;
import com.ingegc.restws.dtos.impl.LawWSLogRecordDto;
import com.ingegc.restws.services.core.SingleTaskService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author a637201
 */
@Service
public class LogQueryService implements SingleTaskService<
        LogRequestBo,
        LogRecordsBo,
        List<Date>,
        List<LawWSLogRecordDto>> {

    @Autowired
    LawWSLogDao lawWSLogDao;
    
    @Override
    public List<Date> translateRequest(LogRequestBo extRequest) {
        List<Date> intRequest = new ArrayList<Date>();
        intRequest.add(extRequest.getDateFrom());
        intRequest.add(extRequest.getDateTo());
        return intRequest;
    }

    @Override
    public LogRecordsBo translateResponse(List<LawWSLogRecordDto> intResponse) {
        LogRecordsBo lawWSLogRecords = new LogRecordsBo();
        for (LawWSLogRecordDto logRecord : intResponse) {
            lawWSLogRecords.getLogRecords().add(logRecord.retrieveLogRecordBO());
        }
        return lawWSLogRecords;
    }

    @Override
    public List<LawWSLogRecordDto> serve(List<Date> request) {
        return lawWSLogDao.getLogRecordsBetween(request.get(0), request.get(1));
    }
}
