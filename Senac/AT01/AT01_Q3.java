/*Escreva um programa Java que receba o valor padrão de uma diária e,
em seguida, receba vários nomes de hóspedes e suas idades. Caso o
hóspede tenha idade menor que 4 anos, ele não paga hospedagem
(nesse caso, o programa deve mostrar na tela “(Nome do hóspede) possui
gratuidade”); mas, se o hóspede tiver mais de 80 anos, ele paga metade
(o programa deve mostrar na tela “(Nome do hóspede) paga meia”). O
usuário informará hóspedes até digitar a palavra “PARE”, que interrompe
a entrada de dados. Ao fim, o programa deve mostrar a quantidade de
gratuidades, a quantidade de meias hospedagens e o valor total,
considerando todos os hóspedes informados.*/

package Senac.AT01;

import java.util.Scanner;

public class AT01_Q3 {

    public static void main(String[] args) {

        int idade, grat = 0, meia = 0;
        String nome;
        double valor, soma = 0.0, aux = 0.0, aux2 = 50.0, cal = 0.0, valor1 = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da diária: ");
        valor = sc.nextDouble();

        do {
            System.out.print("Informe o nome do hóspede: ");
            nome = sc.next();

            if (!nome.equals("PARE")) {
                System.out.print("Informe a idade do hóspede: ");
                idade = sc.nextInt();

                while (idade < 1) {
                    System.out.println("Idade Invalida.");
                    System.out.print("Informe a idade do hóspede: ");
                    idade = sc.nextInt();
                };

                if (idade >= 4 && idade <= 80) {
                    valor = valor;
                    cal = cal + valor;
                }

                else if (idade < 4) {
                    System.out.println(nome + " possui gratuidade.");
                    grat++;
                }

                else if (idade > 80) {
                    System.out.println(nome + " paga meia.");
                    valor1 = aux2;
                    cal = cal + valor1;
                    meia++;
                };

                soma = cal;
            }

            System.out.println();

        } while (!nome.equals("PARE"));

        System.out.println("Total de hospedagens: R$" + soma + "; " + grat + " gatuidade(s); " + meia + " meia(s).");
    }

}
