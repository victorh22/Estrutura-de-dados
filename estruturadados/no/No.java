/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.no;

/**
 *
 * @author victor.machado
 */
public class No<T> {
    
    private T conteudo;
    private No<T> proximoNo;
    
    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }
    
    
    public T getConteudo() {
        return conteudo;
    }

    
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    
    public No getProximoNo() {
        return proximoNo;
    }

    
    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No[" + "conteudo:" + conteudo + "]";
    }
    
    
    
}
