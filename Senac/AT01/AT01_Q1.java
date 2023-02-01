package Senac.AT01;

import java.util.Scanner;

public class AT01_Q1 {
 
    public static void main(String[] args) {
        
        int conv, cade = 150, cadeira;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantidade de convidados: ");
        conv = sc.nextInt();
        
        if(conv > 0 && conv <= 350) {
            
            if(conv <= 220) {
                cadeira = conv - cade;
                System.out.println("Use o auditório Alfa.");
                System.out.println("Inclua mais " + cadeira + " cadeiras.");
            }
            else {
                System.out.println("Use o auditório Beta.");
            }
                
        }
        else {
            System.out.println("Número de convidados inválido");
        }	

    } 
      
}