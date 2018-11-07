/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.TranslatableBussinessObject;
import com.ingegc.restws.dtos.impl.RoleDto;
import com.ingegc.restws.dtos.impl.UserDto;
import java.io.Serializable;

/**
 *
 * @author a637201
 */
public class RoleBo extends TranslatableBussinessObject<RoleDto> implements Serializable{
    
    protected Integer id;
    protected String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public RoleDto translate() {
        return translate(new RoleDto());
    }
    
    
    
}
