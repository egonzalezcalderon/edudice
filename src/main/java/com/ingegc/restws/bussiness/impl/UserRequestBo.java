/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.CRUDRequest;

/**
 *
 * @author a637201
 */
public class UserRequestBo extends CRUDRequest {
    
    protected UserBo user;

    public UserRequestBo(UserBo user) {
        this.user = user;
    }
    
    public UserBo getUser() {
        return user;
    }

    public void setUser(UserBo user) {
        this.user = user;
    }
}
