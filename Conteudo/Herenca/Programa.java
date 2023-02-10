package Conteudo.Herenca;

import java.util.Locale;

public class Programa {


    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Aluno aluno1 = new Aluno("João", 17, 1.80, "4002", 10, "3M1", "5050");
        aluno1.dadosAluno1();      
        /*Nesse 1º caso todos os dados da classe Pessoa podem ser acessados 
        pois são PUBLIC*/
        
        Aluno aluno2 = new Aluno("José", 21, 1.74, "123", 20.0, "3M1", "4040");
        aluno2.dadosAluno2();
        /*Nesse 2º caso a variável "saldo" é PRIVATE então nem todos os dados 
        podem ser acessados */
        
        Aluno aluno3 = new Aluno("Maria", 15, 1.65, "8922", 5, "3M1", "3030");
        aluno3.dadosAluno3();
        /*Nesse 3º caso todas as variáveis que serão apresentadas são PUBLIC
         * ou PROTECTED que podem ser acessadas sem erros*/

         Pessoa pessoa = new Pessoa("Ana", 10, 1.55, "4567", 15.0, "6M1");
         pessoa.dadosPessoais();
         /*A única maneira de ver os dados privados da classe Pessoa é 
         instanciando a própria classe Pessoa*/
               
    }
    
}