/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.arvorebinaria;


public class BinNo<T extends Comparable<T>> {
    private T conteudo;
    private BinNo<T> NoEsq;
    private BinNo<T> NoDir;

    public BinNo(T conteudo) {
        NoEsq = null;
        NoDir = null;
        this.conteudo = conteudo;
    } 

    public BinNo() {
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
     * @return the NoEsq
     */
    public BinNo<T> getNoEsq() {
        return NoEsq;
    }

    /**
     * @param NoEsq the NoEsq to set
     */
    public void setNoEsq(BinNo<T> NoEsq) {
        this.NoEsq = NoEsq;
    }

    /**
     * @return the NoDir
     */
    public BinNo<T> getNoDir() {
        return NoDir;
    }

    /**
     * @param NoDir the NoDir to set
     */
    public void setNoDir(BinNo<T> NoDir) {
        this.NoDir = NoDir;
    }

    @Override
    public String toString() {

        return "No[conteudo="+conteudo+"]";
    }
    
    
}
