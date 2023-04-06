package Conteudo.AbstractFactory.entidadeAbs;

import Conteudo.AbstractFactory.games.Esportes;
import Conteudo.AbstractFactory.games.Rpg;

public interface Modelo {
    
    Esportes getEsportes();
    Rpg getRpg();
    
}
