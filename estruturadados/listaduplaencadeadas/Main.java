/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.listaduplaencadeadas;

/**
 *
 * @author victor.machado
 */
public class Main {
    public static void main(String[] args) {
        
        ListaDuplaEncad <String> lista = new ListaDuplaEncad<>();
        
        lista.add("c1");
        lista.add("c2");
        lista.add("c3");
        lista.add("c4");
        lista.add("c5");
        lista.add("c6");
        lista.add("c7");

        System.out.println(lista);

        lista.remove(3);
        System.out.println(lista);
        lista.add("99", 3);
        System.out.println(lista);
        System.out.println(lista.get(3));
    }
    
}
