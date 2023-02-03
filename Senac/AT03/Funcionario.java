package Senac.AT03;

public abstract class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String endereco;
    protected String setor;

    public Funcionario(String nome, String cpf, String telefone, String endereco, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.setor = setor;
    }
      
    
    public abstract void dadosFuncionario();
    
    public abstract void valorPagamento();
    
    public abstract void aplicarAumento(double percentual);
    
}
