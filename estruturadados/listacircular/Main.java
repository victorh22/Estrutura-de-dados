/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.listacircular;

/**
 *
 * @author victor.machado
 */
public class Main {
    public static void main(String[] args) {
        ListaCircular<String> lista = new ListaCircular<>();
        
        lista.add("C0");
        
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        
        lista.add("C1");
        lista.add("C2");
        lista.add("C3");
        System.out.println(lista);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        System.out.println(lista.get(4));
        
        
    }
}
