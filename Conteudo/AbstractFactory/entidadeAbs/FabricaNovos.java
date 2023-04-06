package Conteudo.AbstractFactory.entidadeAbs;

import Conteudo.AbstractFactory.games.Esportes;
import Conteudo.AbstractFactory.games.Rpg;
import Conteudo.AbstractFactory.games.WiningEleven;
import Conteudo.AbstractFactory.games.Zelda;

public class FabricaNovos implements Modelo {
    
    public Esportes getEsportes() {
        return new WiningEleven();
    }
    
    public Rpg getRpg() {
        return new Zelda();
    }
    
}
