package Senac.AT02_POO;

public class Transporte {
    
    private String Tipo;
    private double valorTrans;

    public Transporte(String Tipo) {
        this.Tipo = Tipo;
        
        if(Tipo.equalsIgnoreCase("aéreo")){
            valorTrans = 1000;
        }
        else if(Tipo.equalsIgnoreCase("marítimo")){
            valorTrans = 1200;
        }
        else if(Tipo.equalsIgnoreCase("rodoviário")){
            valorTrans = 1500;
        }
    }

    public String getTipo() {
        return Tipo;
    }

    public double getValorTrans() {
        return valorTrans;
    }
    
}
