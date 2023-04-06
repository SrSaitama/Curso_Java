package Conteudo.AbstractFactory.pacote;

import java.util.Scanner;

import Conteudo.AbstractFactory.entidadeAbs.FabricaAntigos;
import Conteudo.AbstractFactory.entidadeAbs.FabricaNovos;
import Conteudo.AbstractFactory.entidadeAbs.Modelo;
import Conteudo.AbstractFactory.entidadeAbs.SugestaoGameAbs;

public class ProgrmaAbs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe 1-Games Antigos ou 2-Games novos");
        byte opc = sc.nextByte();

        Modelo modelo = null;
        switch (opc) {
            case 1:
                modelo = new FabricaAntigos();
                break;
            case 2:
                modelo = new FabricaNovos();
                break;
        }

        SugestaoGameAbs sugestao = new SugestaoGameAbs(modelo);
        sugestao.gerar(opc);

        System.out.println("Esportes: " + sugestao.getGameEsporte().toString());
        System.out.println("Rpg: " + sugestao.getGameRpg().toString());

    }
    
}
