/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingegc.restws.bussiness.impl;

import com.ingegc.restws.bussiness.core.BussinessObject;
import com.ingegc.restws.bussiness.core.TranslatableBussinessObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author a637201
 */
public class LawWSListBo<Translation, Element extends TranslatableBussinessObject<Translation>> extends BussinessObject implements Serializable{
    List<Element> elements = new ArrayList<Element>();

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public List<Translation> translate() {
        List<Translation> translatedList = new ArrayList<Translation>();
        for (Element element : elements) {
            translatedList.add(element.translate());
        }        
        return translatedList;
    }
    
    @Override
    public String serialize() {
        String serializedList = "[";
        for (Element element : elements) {
            serializedList += element.serialize()+", ";
        }
        serializedList += "]";
        
        return serializedList.replace(", ]", "]");
    }
         
}
