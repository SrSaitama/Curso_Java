package Senac.AT03_2;

import java.util.Scanner;


public class Programa {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        Funcionario[] funcionario = new Funcionario[10];
                   
        String opc = null;
        int cont = 0;
        
            
        do{
            
            System.out.print("Informe o tipo de funcionário: ");
            String tipo = leia.next();
            
            System.out.print("Nome: ");
            String nome = leia.next();
            System.out.print("CPF: ");
            String cpf = leia.next();
            System.out.print("Telefone: ");
            String tel = leia.next();
            System.out.print("Endereço: ");
            leia.nextLine();
            String end = leia.nextLine();
            System.out.print("Setor: ");
            String set = leia.next();
            
            
            
            if (tipo.equalsIgnoreCase("Assalariado")) {                
                System.out.print("Salário: ");
                double sal = leia.nextDouble();

                funcionario[cont] = new Assalariado(nome, cpf, tel, end, set, sal);
                cont++;
            }                 
            else if(tipo.equalsIgnoreCase("Horista")) {                
                 System.out.print("Valor por hora: ");
                double val = leia.nextDouble();
                System.out.print("Total de horas: ");
                double hor = leia.nextDouble();

                funcionario[cont] = new Horista(nome, cpf, tel, end, set, val, hor);
                cont++;
            }
            
            System.out.println();
            System.out.println("Deseja informar outro funcionário? [S]sim [N]não");
            opc = leia.next();            
            
        }while(opc.equals("S"));
        
        
        System.out.println();
        System.out.println("----- DADOS E PAGAMENTOS DOS FUNCIONÁRIOS -----");
        System.out.println("");
        for (int i = 0; i < funcionario.length; i++) {
            
            if (funcionario[i] != null) {
                funcionario[i].dadosFuncionario();
                System.out.println();
            } 
            
        }
        
        System.out.println();
        System.out.print("Informe um percentual de aumento: ");
        double percent = leia.nextDouble();
        System.out.println();
        for (int i = 0; i < funcionario.length; i++) {
            
            if (funcionario[i] != null) {
                funcionario[i].aplicarAumento(percent);
                System.out.println();
            } 
            
        }
            
    }
    
}
