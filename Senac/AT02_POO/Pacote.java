package Senac.AT02_POO;

public class Pacote {

    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int qtdeDias;

    public Pacote(Transporte transporte, Hospedagem hospedagem, String destino, int qtdeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.qtdeDias = qtdeDias;
    }

    /*public Transporte getTransporte() {
        return transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }*/

    public String getDestino() {
        return destino;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    
    //CALCULO TOTAL HOSPEDAGEM:
    public double totalHospedagem(){
        double valHosp = qtdeDias * hospedagem.getDiaria();
        return valHosp;
    }
    
    
    //CALCULO VALOR DO LUCRO:
    private double lucro;
    public double adicionais(double percentual) { 
        double margem = (percentual / 100) * totalHospedagem();
        lucro = margem + 10; //defini uma taxa de $10.
        return lucro; 
    }

    //CALCULO TOTAL PACOTE:
    public double totalPacote(){ 
        double valTotal = transporte.getValorTrans() + totalHospedagem() + lucro;
        
        return valTotal;
    }
    
    
}
