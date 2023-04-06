package Conteudo.AbstractFactory.entidadeAbs;

import Conteudo.AbstractFactory.games.EldenRing;
import Conteudo.AbstractFactory.games.Esportes;
import Conteudo.AbstractFactory.games.Fifa;
import Conteudo.AbstractFactory.games.Rpg;

public class FabricaAntigos implements Modelo {
    
    public Esportes getEsportes() {
        return new Fifa();
    }
    
    public Rpg getRpg() {
        return new EldenRing();
    }
    
}
