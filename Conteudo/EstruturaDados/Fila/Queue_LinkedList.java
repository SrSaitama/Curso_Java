package Conteudo.EstruturaDados.Fila;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {

        //OS ITENS DA LISTA SERAM ORDENADOS POR ORDEM DE ENTRADA:
    
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();
        
        fila.add("Maria");
        fila.add("Aparecida");
        fila.add("João");
        fila.add("Tonico");
        
        int ordem = 1;
        while(!fila.isEmpty()){
            
            String nome = fila.remove();
            System.out.println(ordem + "º a ser atendido(a):" + nome);
            ordem++;
        }
        
    }
    
}