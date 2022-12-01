/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.listaduplaencadeadas;

/**
 *
 * @author victor.machado
 */
public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> NoPrevio;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * @return the conteudo
     */
    public T getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * @return the proximoNo
     */
    public NoDuplo<T> getProximoNo() {
        return proximoNo;
    }

    /**
     * @param proximoNo the proximoNo to set
     */
    public void setProximoNo(NoDuplo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    /**
     * @return the NoPrevio
     */
    public NoDuplo<T> getNoPrevio() {
        return NoPrevio;
    }

    /**
     * @param NoPrevio the NoPrevio to set
     */
    public void setNoPrevio(NoDuplo<T> NoPrevio) {
        this.NoPrevio = NoPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo[conteudo= " + conteudo + "]";
    }
    
     
   
}
