package Conteudo.EstruturaDados.Fila;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {
    
    //OS ITENS DA LISTA SERAM ORDENADOS ALFABETICAMENTE
    
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<String>();
        
        fila.add("Maria");
        fila.add("Aparecida");
        fila.add("João");
        fila.add("Tonico");
        
        int ordem = 1;
        while(!fila.isEmpty())
        {
            String nome = fila.remove();
            System.out.println(ordem + "º a ser atendido(a):" + nome);
            ordem++;
        }
    }
    
}