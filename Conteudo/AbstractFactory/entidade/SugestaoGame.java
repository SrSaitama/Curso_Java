package Conteudo.AbstractFactory.entidade;

import Conteudo.AbstractFactory.games.EldenRing;
import Conteudo.AbstractFactory.games.Esportes;
import Conteudo.AbstractFactory.games.Fifa;
import Conteudo.AbstractFactory.games.Rpg;
import Conteudo.AbstractFactory.games.WiningEleven;
import Conteudo.AbstractFactory.games.Zelda;

public class SugestaoGame {
    
    private Esportes gameEsporte;
    private Rpg gameRpg;

    public Esportes getGameEsporte() {
        return gameEsporte;
    }

    public Rpg getGameRpg() {
        return gameRpg;
    }
    
    public void gerar(byte opc){
        if(opc == 1){
            gameEsporte = new Fifa();
            gameRpg = new EldenRing();
        }
        else{
            gameEsporte = new WiningEleven();
            gameRpg = new Zelda();
        }
        
    }
  }
