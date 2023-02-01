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
