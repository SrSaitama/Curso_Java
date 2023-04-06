package Conteudo.AbstractFactory.games;

public abstract class EstruGames {
    private String nome;

    public EstruGames(String nome) {
        this.nome = nome;
    }
    
    public String toString() {
        return nome;
    }
    
}
