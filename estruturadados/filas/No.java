/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.filas;

/**
 *
 * @author victor.machado
 */
public class No<T> {
    
    private T object;
    private No<T> refNo;

    public No() {
    }

    
    public No(T object) {
        this.object = object;
        this.refNo = null;
    }

    /**
     * @return the object
     */
    public Object getObject() {
        return object;
    }

    /**
     * @param object the object to set
     */
    public void setObject(T object) {
        this.object = object;
    }

    /**
     * @return the refNo
     */
    public No getRefNo() {
        return refNo;
    }

    /**
     * @param refNo the refNo to set
     */
    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No[" + 
               "object=" + object +
                "]";
    }
    
    
    
}
