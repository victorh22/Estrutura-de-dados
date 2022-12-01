/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.listaduplaencadeadas;

/**
 *
 * @author victor.machado
 */
public class ListaDuplaEncad<T> {
    
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista = 0;

    public ListaDuplaEncad() {
    this.primeiroNo = null;   
    this.ultimoNo = null;    
    this.tamanhoLista = 0;
    }
    
    public int size(){
        return tamanhoLista;
    }
    
    private NoDuplo<T> getNo (int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0;(i<index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }
    
    public T get (int index){
        return this.getNo(index).getConteudo();
    }
    
    public void add (T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setProximoNo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }
    
    public void add (T elemento,int index){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setProximoNo(noAuxiliar);
        if(novoNo.getProximoNo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getProximoNo().setNoPrevio(novoNo);
        }else{
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }if(index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setProximoNo(novoNo);
        }
        
        tamanhoLista++;
    }
    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setProximoNo(noAuxiliar.getProximoNo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getProximoNo().setNoPrevio(noAuxiliar.getNoPrevio());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;
    }

    @Override
    public String toString() {
        String s = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; i < size(); i++) {
            s += "{No[conteudo= " + noAuxiliar.getConteudo() + "]}-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        s += "null";
        return s;
    }
    
    
    
}
