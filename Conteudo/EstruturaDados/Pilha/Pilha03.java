package Conteudo.EstruturaDados.Pilha;

import java.util.Scanner;
import java.util.Stack;


public class Pilha03 {
    
    public static void main(String[] args){
        
        Scanner leia = new Scanner(System.in);
        
        //declaração da pilha
        Stack<Integer> numeros = new Stack<>();
        
        int topo = 0, n = 0;
        
        System.out.print("Digite um número: ");        
        n = leia.nextInt();
        
        numeros.push(n);  
   
        while( n > topo){   
            
            topo = numeros.peek();
            
            System.out.print("Digite outro número: ");
            n = leia.nextInt();
                        
            if(n>topo){
                numeros.push(n);
            }
            
        }
        
        int num, cont = 5;
        while(!numeros.empty()){
            
            num = numeros.pop();
            System.out.println((cont) + "º Número a ser digitado: " + num);
            
            cont--;
        }
        
    }
   
}
