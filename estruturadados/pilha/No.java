/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.pilha;

/**
 *
 * @author victor.machado
 */
public class No {
    
    private int dado;
    private No refNo = null;

    public No() {
    }

    
    public No(int dado) {
        this.dado = dado;
    }

    /**
     * @return the dado
     */
    public int getDado() {
        return dado;
    }

    /**
     * @param dado the dado to set
     */
    public void setDado(int dado) {
        this.dado = dado;
    }

    /**
     * @return the reNo
     */
    public No getRefNo() {
        return refNo;
    }

    /**
     * @param refNo the reNo to set
     */
    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No[" + "dado: " +dado + "]";
    }
    
    
}
