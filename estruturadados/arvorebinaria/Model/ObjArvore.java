/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.arvorebinaria.Model;

/**
 *
 * @author victor.machado
 */
public abstract class ObjArvore<T> implements Comparable<T> {
    public abstract boolean equals(Object o);
    public abstract int hashCode();    
    public abstract int compareTo(T outro);
    public abstract String toString();
    
}
