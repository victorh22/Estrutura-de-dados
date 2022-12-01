/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.pilha;

/**
 *
 * @author victor.machado
 */
public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    
    public No pop(){
        if(!this.isEmpty()){
            No noPeped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPeped;
        }
        return null;
    }
    
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    
    public No top(){
        return refNoEntradaPilha;
    }
    
    public boolean isEmpty(){
        if(refNoEntradaPilha == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------------\n";
        stringRetorno +=  "    Pilha\n";
        stringRetorno += "------------------\n";
        
        No noAuxiliar = refNoEntradaPilha;
        
        while(true){
           if(noAuxiliar != null){
               stringRetorno += "{No[dado=" + noAuxiliar.getDado() + "]}\n";
               noAuxiliar = noAuxiliar.getRefNo();
               
           }else{
               break;
           } 
            
            
        }
        stringRetorno += "==================\n";
        return stringRetorno;
    }
   
}
