/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.dtos.impl;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.ingegc.restws.bussiness.impl.UserBo;
import com.ingegc.restws.dtos.core.TransformableDto;
import com.ingegc.restws.security.encription.UserPasswordEncryptor;

/**
 *
 * @author a637201
 */
@Entity
@Table(name = "WEB_SERVICE_USUARIO")
public class UserDto extends TransformableDto<UserBo> implements Serializable {
    
    protected Integer id;
    protected String name;
    protected String password;
    protected String description;
    protected Set<RoleDto> roles = new HashSet<RoleDto>();
    
    @Id
    @Column(name="ID")   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="NOMBRE")   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="PASSWORD")  
    @Convert(converter = UserPasswordEncryptor.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="DESCRIPCION")       
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="WEB_SERVICE_USUARIOS_PERFILES",
            joinColumns = {@JoinColumn(name = "ID_USUARIO")},
            inverseJoinColumns = {@JoinColumn(name = "ID_PERFIL")}
    )
    public Set<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDto> roles) {
        this.roles = roles;
    }
    
    @Override
    public UserBo translate() {
        UserBo user = translate(new UserBo());
        
        for (RoleDto role : roles) {
            user.getRoles().getElements().add(role.translate());
        }
        
        return user;
    }  

}