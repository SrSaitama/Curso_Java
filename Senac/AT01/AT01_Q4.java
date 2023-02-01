/*Monte um algoritmo em que o usuário poderá cadastrar e pesquisar
hóspedes. O algoritmo deve oferecer um menu com três opções ao
usuário: 1- cadastrar; 2- pesquisar; 3- sair. A opção “cadastrar” deve
permitir que o usuário informe um nome de hóspede, gravando-o em
memória (máximo de 15 cadastros; caso atinja essa quantidade, o
programa deve mostrar “Máximo de cadastros atingido”). A opção
“pesquisar” deve permitir que o usuário informe um nome e, caso seja
encontrado um nome exatamente igual, mostre a mensagem “Hóspede
(nome) foi encontrado no índice (índice onde foi cadastrado)”. Se o nome
não foi encontrado, o programa deve mostrar “Hóspede não encontrado”.
O algoritmo deve permitir que o usuário realize essas operações repetidas
vezes, até que use a opção “3”, que encerra o algoritmo.*/

package Senac.AT01;

import java.util.Scanner;

public class AT01_Q4 {

    public static void main(String[] args) {

        String nomeBuscado;
        String hospede[] = new String[15];
        int opc, cad = 0;
        boolean encontro = false;

        for (int i = 0; i < 15; i++) {
            hospede[i] = "asfbhsdayae";
        }

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1 - cadastrar 2 - pesquisar 3 - sair ");
            opc = sc.nextInt();

            switch (opc) {

                case 1:

                    if (cad < 15) {
                        System.out.print("Cadastrar o nome do hóspede: ");
                        hospede[cad] = sc.next();
                        cad++;

                    } else {
                        System.out.print("Máximo de cadastros atingido!!");
                        System.out.println();
                    };

                    break;

                case 2:

                    System.out.print("Pesquisar o nome do hóspede: ");
                    nomeBuscado = sc.next();

                    encontro = false;
                    for (int i = 0; i < hospede.length; i++) {
                        String elemento = hospede[i];

                        if (elemento.equals(nomeBuscado)) {
                            System.out.println();
                            System.out.println("Hospede " + nomeBuscado + " foi encontrado no índice " + i);
                            System.out.println();

                            encontro = true;
                            break;
                        }
                    }

                    if (encontro == false) {
                        System.out.println("Hóspede não encontrado");
                        System.out.println();

                    }

                    break;

                case 3:

                    break;

                default:
                    System.out.println("Opção Inválida !");
            };

        } while (opc != 3);

    }

}
