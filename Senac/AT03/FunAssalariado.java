package Senac.AT03;

public class FunAssalariado extends Funcionario{
    
    private double salario;

    public FunAssalariado(String nome, String cpf, String telefone, String endereco, String setor, double salario) {
        super(nome, cpf, telefone, endereco, setor);
        this.salario = salario;
    }

    
    @Override
    public void dadosFuncionario() {
        System.out.println("Nome: " + nome
                        + "\nCPF: " + cpf
                   + "\nTelefone: " + telefone
                   + "\nEndereço: " + endereco
                      + "\nSetor: " + setor );
        valorPagamento();
    }

    
    @Override
    public void valorPagamento() {
        System.out.println("o total a receber será: " + salario);
    }
    
    
    @Override
    public void aplicarAumento(double percentual){
        double aumento = (percentual / 100) * salario;
        
        System.out.println("O funcionário(a) "
                                + "\nNome: " + nome
                  + "\nTeve um aumento de: " + aumento
         + "\nAgora ele(a) deverá receber: " + (aumento + salario));
    }
    
}

