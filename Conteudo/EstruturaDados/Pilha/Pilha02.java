package Conteudo.EstruturaDados.Pilha;

import java.util.Stack;

public class Pilha02 {
    
    public static void main(String[] args){
        
        Stack<String> carros = new Stack<>();
        
        carros.push("BMW");
        carros.push("Mercedes");
        carros.push("Audi");
        carros.push("Mustang");
        
        
        System.out.println("Carros disponíveis: \n" + carros);     
        System.out.println("\nAlugando o primeiro carro da fila..");
        System.out.println("Primeiro carro da fila: " + carros.peek());  
        carros.pop();
        System.out.println("\nCarros disponíveis: " + carros);
        
        
        System.out.println(carros.empty()?"A carros disponíveis!":"Não ah carros disponíveis!");
        
        
    }
    
}