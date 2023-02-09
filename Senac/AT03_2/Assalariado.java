package Java.Senac.AT03_2;

public class Assalariado extends Funcionario{
    
    private double salario;

    public Assalariado(String nome, String cpf, String telefone, String endereco, String setor, double salario) {
        super(nome, cpf, telefone, endereco, setor);
        this.salario = salario;
    }

    
    @Override
    public void dadosFuncionario() {
        System.out.println("\nNome: " + nome
                        + "\nCPF: " + cpf
                   + "\nTelefone: " + telefone
                   + "\nEndereço: " + endereco
                      + "\nSetor: " + setor );
        valorPagamento();
    }

    
    @Override
    public void valorPagamento() {
        System.out.printf("O total a receber será: %.2f", salario);
    }
    
    
    @Override
    public void aplicarAumento(double percentual){
        double aumento = (percentual / 100) * salario;
        
        System.out.println("\nO funcionário \nNome: " + nome);       
        System.out.printf("Teve um aumento de: %.2f%%", percentual);
        System.out.printf("\nAgora ele(a) deverá receber: %.2f", (aumento + salario));
    }
    
}