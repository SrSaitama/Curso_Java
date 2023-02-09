package Senac.AT03;

public class FunHorista extends Funcionario{
    
    private double horas;
    private double valor;
    private double pagamento;

       public FunHorista(String nome, String cpf, String telefone, String endereco, String setor, double valor, double horas) {
        super(nome, cpf, telefone, endereco, setor);
        this.valor = valor;
        this.horas = horas;
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
        pagamento = horas * valor;
        System.out.println("o total a receber será: " + pagamento);
    }
    
    
    @Override
    public void aplicarAumento(double percentual){        
        double aumento = (percentual / 100) * pagamento;
        
        System.out.println("O funcionário(a) "
                                + "\nNome: " + nome
                  + "\nTeve um aumento de: " + aumento
         + "\nAgora ele(a) deverá receber: " + (aumento + pagamento));
    }

}