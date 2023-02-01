package Senac.AT01;

import java.util.Scanner;

public class AT01_Q5 {

    public static void main(String[] args) {

        int andar, quarto;
        String andar1[] = new String[3];
        String andar2[] = new String[3];
        String andar3[] = new String[3];
        String andar4[] = new String[3];
        String opc = "S";

        for (int i = 0; i < 3; i++) {
            andar1[i] = " ";
            andar2[i] = " ";
            andar3[i] = " ";
            andar4[i] = " ";
        }

        Scanner leia = new Scanner(System.in);

        do {

            System.out.println("Informe o andar e o quarto: ");

            for (int i = 0; i < 9; i++) {
                System.out.print("Andar: ");
                andar = leia.nextInt();

                if (andar == 1) {
                    System.out.print("Quarto: ");
                    quarto = leia.nextInt();
                    andar1[quarto - 1] = "X";

                } else if (andar == 2) {
                    System.out.print("Quarto: ");
                    quarto = leia.nextInt();
                    andar2[quarto - 1] = "X";

                } else if (andar == 3) {
                    System.out.print("Quarto: ");
                    quarto = leia.nextInt();
                    andar3[quarto - 1] = "X";

                } else if (andar == 4) {
                    System.out.print("Quarto: ");
                    quarto = leia.nextInt();
                    andar4[quarto - 1] = "X";
                }

                System.out.println("Deseja informar outra ocupação? (S/N) ");
                opc = leia.next();

                if (opc.equals("N")) {
                    break;
                }

            }

        } while (opc.equals("S"));

        System.out.print("4º andar ");
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + andar4[i] + "] ");
        }
        System.out.println();

        System.out.print("3º andar ");
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + andar3[i] + "] ");
        }
        System.out.println();

        System.out.print("2º andar ");
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + andar2[i] + "] ");
        }
        System.out.println();

        System.out.print("1º andar ");
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + andar1[i] + "] ");
        }
        System.out.println();

    }

}
