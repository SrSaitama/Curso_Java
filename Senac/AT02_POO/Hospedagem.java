package Senac.AT02_POO;


public class Hospedagem {

    private String descricao;
    private double diaria;

    public Hospedagem(String des) {
        this.descricao = des;
        
        if(des.equalsIgnoreCase("Hotel")){
            diaria = 50;
        }
        else if(des.equalsIgnoreCase("Casa")){
            diaria = 70;
        }       
    }

    public String getDescricao() {
        return descricao;
    }

    public double getDiaria() {
        return diaria;
    }
    
}
