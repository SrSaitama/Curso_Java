package Senac.AT03_2;

public class Horista extends Funcionario{
    
    private double horas;
    private double valor;
    private double pagamento;

       public Horista(String nome, String cpf, String telefone, String endereco, String setor, double valor, double horas) {
        super(nome, cpf, telefone, endereco, setor);
        this.valor = valor;
        this.horas = horas;
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
        pagamento = horas * valor;
        System.out.printf("O total a receber será: %.2f", pagamento);
    }
    
    
    @Override
    public void aplicarAumento(double percentual){        
        double aumento = (percentual / 100) * pagamento;
        
        System.out.println("\nO funcionário \nNome: " + nome);       
        System.out.printf("Teve um aumento de: %.2f%%", percentual);
        System.out.printf("\nAgora ele(a) deverá receber: %.2f", (aumento + pagamento));
    }

}

  
