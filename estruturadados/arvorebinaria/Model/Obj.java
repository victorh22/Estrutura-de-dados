/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.arvorebinaria.Model;

import java.util.Objects;

/**
 *
 * @author victor.machado
 */
public class Obj extends ObjArvore<Obj>{
     Integer meuValor;    

    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
         
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }
         Obj obj = (Obj) o;
        return Objects.equals(this.meuValor, obj.meuValor);
    }

    

    @Override
    public int compareTo(Obj outro) {
        int i = 0;
        if(this.meuValor > outro.meuValor){
            i =1;
        }else if(this.meuValor < outro.meuValor){
            i = -1;
        }
    return i;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
     
     
}
