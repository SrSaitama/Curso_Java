package Conteudo.Abstracao;

public abstract class Veiculo {

    protected String tipo;
    protected String marca;
    protected double valor;

    public Veiculo(String tipo, String marca, double valor) {
        this.tipo = tipo;
        this.marca = marca;
        this.valor = valor;
    }

    public String emiteCabecalho(){
        return "----- INFORMAÇÕES DE LOCAÇÃO -----";
    }

    public abstract void informacoes();

    public String emiteRodape(){
        return "----- VOLTE SEMPRE -----";
    }
}
