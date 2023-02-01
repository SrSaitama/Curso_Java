package Senac.AT01;

import java.util.Scanner;

public class AT01_Q2 {
       
    public static void main(String[] args) {
        
        String cliente1, cliente2;
        int idade1, idade2;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        cliente1 = leia.next();
        System.out.print("Informe sua idade: ");
        idade1 = leia.nextInt();       
        System.out.println("");
        
        System.out.print("Informe seu nome: ");
        cliente2 = leia.next();
        System.out.print("Informe sua idade: ");
        idade2 = leia.nextInt();       
        System.out.println();
        
        if(idade1 >= 60 ) {
          System.out.println("Quarto A: " + cliente1 + " com desconto de 40%;");
          System.out.println("Quarto B: " + cliente2);
            
        } else if(idade2 >= 60) {
           System.out.println("Quarto A: " + cliente2 + " com desconto de 40%;");
           System.out.println("Quarto B: " + cliente1);
           
        }else{           
            if(idade1 >= idade2) {
                System.out.println("Quarto A: " + cliente1);
                System.out.println("Quarto B: " + cliente2);
                
            } else {
                System.out.println("Quarto A: " + cliente2);
                System.out.println("Quarto B: " + cliente1);               
            }
    
        }
  
    }

}

 


