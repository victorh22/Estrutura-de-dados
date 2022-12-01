/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estruturadados.pilha;

/**
 *
 * @author victor.machado
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha();
        pilha.push(new No(1));
        pilha.push(new No(2));
        pilha.push(new No(3));
        pilha.push(new No(4));
        pilha.push(new No(5));
        pilha.push(new No(6));
        
        
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
        pilha.push(new No(99));
        System.out.println(pilha);
    }
}
