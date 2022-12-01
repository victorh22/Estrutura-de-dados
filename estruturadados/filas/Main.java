/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.filas;

/**
 *
 * @author victor.machado
 */
public class Main {
    
    public static void main(String[] args) {
        
        Fila<String> fila = new Fila<>();
        
        fila.enqueue(("primeiro"));
        fila.enqueue(("segundo"));
        fila.enqueue(("terceiro"));
        fila.enqueue(("quarto"));
        
        System.out.println(fila);
        
        
        System.out.println(fila.dequeue());
        
        System.out.println(fila);
        
        fila.enqueue(("ultimo"));
        
        System.out.println(fila);

        System.out.println(fila.first());
    }
}
