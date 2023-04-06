package Conteudo.AbstractFactory.pacote;

import java.util.Scanner;

import Conteudo.AbstractFactory.entidade.SugestaoGame;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe 1-Games Antigos ou 2-Games novos");
        byte opc = sc.nextByte();

        SugestaoGame sugestao = new SugestaoGame();
        sugestao.gerar(opc);

        System.out.println("Esportes: " + sugestao.getGameEsporte().toString());
        System.out.println("Rpg: " + sugestao.getGameRpg().toString());

    }

}
