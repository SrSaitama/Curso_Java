package Conteudo.EstruturaDados.Fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class exercicio {
    
    public static void main(String[] args) {
        
        Queue<String> listaMensagens = new LinkedList<String>();
        
        Scanner leia = new Scanner(System.in);
        
        int cont = 0;
        
        System.out.println("Digite 5 mensagens: ");
        
        while(cont < 5){
            
            System.out.print("Mensagem " + (cont + 1) + ": ");
            String men = leia.nextLine();
            
            listaMensagens.add(men);
            cont++;
        }
        
        cont = 0;        
        while(!listaMensagens.isEmpty()){
         
            String chat = listaMensagens.poll(); //listaMensagens.remove();
            System.out.println("A " + (cont + 1) + "ª Mensagem enviada foi: " + chat
                                + " \n - Ela está sendo excluída!");
               
            cont++;
        }
        
    }
    
}
