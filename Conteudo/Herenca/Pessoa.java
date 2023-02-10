package Conteudo.Herenca;

public class Pessoa {
    
    String nome;
    int idade;
    double altura;
    String cpf;
    private double saldo; //Apenas dentro dessa classe.
    protected String turma; //Nessa classe e em classes "FILHAS".

    public Pessoa(String nome, int idade, double altura, String cpf, double saldo, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.cpf = cpf;
        this.saldo = saldo;
        this.turma = turma;
    } 
    
    public void dadosPessoais(){
        System.out.println("Nome: " + nome + ", CPF: " + cpf + ", saldo: " + saldo + ", turma: " + turma);
    }
    
}