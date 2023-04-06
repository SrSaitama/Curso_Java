package Conteudo.AbstractFactory.entidadeAbs;

import Conteudo.AbstractFactory.games.Esportes;
import Conteudo.AbstractFactory.games.Rpg;

public class SugestaoGameAbs {

    private Esportes gameEsporte;
    private Rpg gameRpg;
    private Modelo fabricaModelo;

    public SugestaoGameAbs(Modelo fabrica) {
        fabricaModelo = fabrica;
    }

    public Esportes getGameEsporte() {
        return gameEsporte;
    }

    public Rpg getGameRpg() {
        return gameRpg;
    }

    public void gerar() {
        gameEsporte = fabricaModelo.getEsportes();
        gameRpg = fabricaModelo.getRpg();
    }

    public void gerar(byte opc) {

    }

}