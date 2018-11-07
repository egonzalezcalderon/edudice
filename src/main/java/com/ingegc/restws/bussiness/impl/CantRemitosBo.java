/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.TranslatableBussinessObject;
import com.ingegc.restws.webservice.xml.cantidadremitos.CantidadRemitosResponse;

/**
 *
 * @author a637201
 */
public class CantRemitosBo extends TranslatableBussinessObject<CantidadRemitosResponse> {
        
    protected Integer cantidadPiezas;
    protected Integer cantidadRemitos;    

    public Integer getCantidadPiezas() {
        return cantidadPiezas;
    }

    public void setCantidadPiezas(Integer cantidadPiezas) {
        this.cantidadPiezas = cantidadPiezas;
    }

    public Integer getCantidadRemitos() {
        return cantidadRemitos;
    }

    public void setCantidadRemitos(Integer cantidadRemitos) {
        this.cantidadRemitos = cantidadRemitos;
    }
    
    @Override
    public CantidadRemitosResponse translate() {
        return translate(new CantidadRemitosResponse());
    }
}
