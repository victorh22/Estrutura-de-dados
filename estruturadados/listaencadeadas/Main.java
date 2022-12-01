/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.listaencadeadas;

/**
 *
 * @author victor.machado
 */
public class Main {

    public static void main(String[] args) {
        
        ListaEncad<String> lista = new ListaEncad<>();
        
        lista.add("teste 1");
        lista.add("teste 2");
        lista.add("teste 3");
        lista.add("teste 4");
        
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));    
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista.get(2));
        System.out.println(lista);
    }
}
