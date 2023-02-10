package Conteudo.EstruturaDados;

import java.util.ArrayDeque;

public class Deque {

    
    public static void main(String[] args) {
        
        ArrayDeque<String> deque = new ArrayDeque<>();
        ArrayDeque<Integer> deque2 = new ArrayDeque<>();
        
        deque.addFirst("B"); // Adiciona no inicio do deque.
        deque.addFirst("A");
        deque.add("C");     // Adicionar depois do ultimo elemento adicionado no deque.
        deque.addLast("D");
        deque.addLast("E"); // Adiciona no final do deque.
        
        System.out.println(deque);
        
        /*deque.pop(); // Este comando irá remover o primeira elemento adicionado.
        System.out.println("Remover o primeiro adicionado: " + deque);*/
        
        deque.removeFirst(); // Este comando removera o elemento da primeira posição.
        System.out.println("Remover primeiro elemento do deque: " + deque);
        deque.removeLast(); // Este comando removera o elemento da ultima posição.
        System.out.println("Remover último elemento do deque:" + deque);
        
        System.out.println("\n\n-------------------\n\n");
               
        deque2.add(3);    // Primeiro elemento do deque.
        deque2.addLast(4); 
        deque2.addLast(5); // Adiciona no final do deque.
        deque2.addFirst(2); 
        deque2.addFirst(1); // Adiciona no inicio do deque.
        
        System.out.println(deque2);
        
        System.out.println("Primeiro elemento: " + deque2.getFirst()); // Retorna o primeiro elemento do deque.
        System.out.println("Último elemento: " + deque2.getLast()); // Retorna o último elemento do deque.      
        
    }

}

