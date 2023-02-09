package Senac.Conteudo.Herenca;

public class Aluno extends Pessoa {
    
    String numMatricula;

    public Aluno(String nome, int idade, double altura, String cpf, double saldo, String turma, String numMatricula) {
        super(nome, idade, altura, cpf, saldo, turma);
        this.numMatricula = numMatricula;
    }
    
    
    public void dadosAluno1() {
        System.out.println("Aluno: " + nome + ", matricula: " + numMatricula);
    }   
    /*Como na classe "MÃE" todas essas variáveis são PUBLIC podem ser acessadas
    Sem erros*/
    
    public void dadosAluno2() {
        System.out.println("Aluno: " + nome + ", matricula: " + numMatricula
                            + ", saldo: " + saldo);
    }   
    /*Como na classe "MÃE" essa variável "saldo" é PRIVATE ela não pode ser executada
    aqui*/
    
    public void dadosAluno3() {
        System.out.println("Aluno: " + nome + ", matricula: " + numMatricula
                            + ", turma: " + turma);
    }  
    /*Como na classe "MÃE" essa variável "turma" é PROTECTED ela pode ser executada
    aqui por ser uma classe "FILHA", mas em outras classe normais não pode.*/

}
