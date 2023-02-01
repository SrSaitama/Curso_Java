/*Escreva um programa Java que faça a troca de quartos entre dois
hóspedes. O programa deve receber o nome de um cliente e a idade dele
(este cliente, a princípio, será hospedado no quarto A), depois receber o
nome de outro cliente e a idade (este, se for mais jovem, ficará no quarto
B, mas, se for mais velho que o primeiro cliente, ficará no quarto A e o
primeiro cliente ficará no quarto B). Além disso, se a pessoa mais velha

for idosa (tem 60 anos ou mais), ela terá desconto de 40%. O programa
deve mostrar, ao final, qual cliente ficou no quarto A e o desconto, se
houver, e qual ficou no quarto B.*/

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

 


