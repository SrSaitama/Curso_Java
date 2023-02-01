/*Com relação ao atendimento a eventos, o hotel necessita de uma
funcionalidade que indique qual de seus dois auditórios é o mais
adequado para um evento. O auditório Alfa conta com 150 lugares e
espaço para até 70 cadeiras adicionais. O auditório Beta conta com 350
lugares, sem espaço para mais cadeiras. Desenvolva um programa Java
que receba o número de convidados do evento e faça uma verificação
sobre a quantidade: se for maior que 350 ou se for menor que zero, mostre
a mensagem “Número de convidados inválido”. Se o valor informado for
válido, mostre na tela qual dos auditórios é o mais adequado. No caso do
auditório Alfa, calcule ainda quantas cadeiras adicionais serão
necessárias, observando o limite citado.*/

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