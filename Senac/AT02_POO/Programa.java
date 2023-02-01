package Senac.AT02_POO;

import java.util.Scanner;

public class Programa{

    public static void main(String[] args) {

        System.out.println("-------- Bem vindo ao VIAJE JÁ! --------");
    
        Scanner leia = new Scanner(System.in);
        
        //CRIAR O PACOTE:
        System.out.println();
        System.out.println("--> INFORME OS DADOS DO PACOTE <--");
        System.out.println();
        System.out.print("Para onde irá viajar: ");
        String destino = leia.next();
        System.out.print("Por quantos dias: ");
        int dias = leia.nextInt();
         System.out.println();
        System.out.println("Transporte | Valor"
                + "\n Aéreo       $ 1000"
                + "\n Marítimo    $ 1200"
                + "\n Rodoviário  $ 1500");
        System.out.print("Tipo de transporte: ");
        String trans = leia.next();
        System.out.println();
        System.out.println("Hospedagem | Diária"
                + "\n  Casa       $ 70"
                + "\n  Hotel      $ 50");
        System.out.print("Tipo de hospedagem: ");
        String hospe = leia.next();
        
        
        //ÁREA DE PROCESSAMENTO:
        Transporte transporte = new Transporte(trans);
        Hospedagem hospedagem = new Hospedagem(hospe);
        Pacote pacote = new Pacote(transporte, hospedagem, destino, dias);
        
        
        //INFORMAÇÕES DO PACOTE CRIADO:
        System.out.println();
        System.out.println();
        System.out.println(" ----- INFORMAÇÕES DO PACOTE ----- ");
        System.out.println();
        System.out.println("Destino: " + pacote.getDestino()
                       + "\nPeríodo: " + pacote.getQtdeDias()
            + "\nTipo de Hospedagem: " + hospedagem.getDescricao()
            + "\nTipo de Transporte: " + transporte.getTipo());
        
        
        //CRIAR VENDA:
        System.out.println();
        System.out.println();
        System.out.println("--> INFORME OS DADOS DA VENDA <--");
        System.out.println();
        System.out.print("Informe o nome do cliente: ");
        String nome = leia.next();
        System.out.print("Informe a porcentagem de lucro: ");
        double porcentagem = leia.nextDouble();
        System.out.println("\nA taxa padrão é de $ 10.\n");
        System.out.print("Qual será a forma de pagamento: ");
        String pagamento = leia.next();        
        System.out.print("Valor do dólar hoje: ");
        double dolar = leia.nextDouble();
        
        
        //ÁREA DE PROCESSAMENTO: 
        Venda venda = new Venda(nome, pagamento);
        pacote.adicionais(porcentagem);
        venda.convertReal(pacote.totalPacote(), dolar);
        
        
        //INFORMAÇÕES DA VENDA:
        System.out.println();
        System.out.println();
        System.out.println(" ----- INFORMAÇÕES DA VENDA ----- :\n"
                       + "\nCliente: " + venda.getNomeCliente()
            + "\nForma de Pagamento: " + venda.getFormaPagamento());  
        
                venda.valorPacote();
                       
    
    }

}


