package Senac.AT02_POO;

public class Venda {

    private String nomeCliente;
    private String formaPagamento;
    Pacote pacote;
        

    public Venda(String nomeCliente, String formaPagamento) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
    }
    

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
    
   
    private double valorReal, valorDolar;
    
    //CONVERTER EM REAL:
    public double convertReal(double valor, double cotacao) {
        valorDolar = valor;
        return valorReal = valor * cotacao;                
    }   
    
    //VALOR EM DOLAR E REAL:
    public void valorPacote(){ 
        System.out.printf("Valor em dólar: %.2f", valorDolar);
        System.out.printf("\nValor em real: %.2f", valorReal); 
        System.out.println();
    }
    
}
