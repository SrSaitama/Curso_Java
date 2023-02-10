package Conteudo.EstruturaDados.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

    //Java implementa pilha por meio da classe Stack
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String carro, continuar = "S";
        
        //declaração da pilha
        Stack<String> cegonha = new Stack<String>();
        
        while(!continuar.equals("N")){
            
            System.out.println("Digite o nome do próximo carro a entrar no caminhão cegonha: ");
            carro = entrada.nextLine();
            
            //incluindo(push) o carro na pilha
            cegonha.push(carro);
            System.out.println("Continuar informando dados? S/N");
            continuar = entrada.nextLine();
        }
        
        System.out.println("Retirar os carros nesta ordem:");
        
        while(!cegonha.empty()) { //enquanto ainda há elementos na pilha(empty)
      
            //retira(pop) o item do topo 
            carro = cegonha.pop();
            System.out.println(carro);
        }
    }
    
}