package Conteudo.Abstracao;

public class Locacao extends Veiculo {
    

    public Locacao(String tipo, String marca, double valor) {
        super(tipo, marca, valor);
    }

    public void alugar(Veiculo veiculo) {
      
    }

    public void informacoes(){
        System.out.println("Tipo de veiculo: " + tipo
                      + "\nMarca do veiculo: " + marca
                      + "\nvalor do aluguel: " + valor);
    }
}
