package Conteudo.FactoryMethod.pacote;

import java.util.Scanner;
import javax.swing.JOptionPane;

import Conteudo.FactoryMethod.entidade.Mensagem;
import Conteudo.FactoryMethod.entidade.MensagemFactory;


public class Programa {


    public static void main(String[] args) {
             
        Scanner leia = new Scanner(System.in);        
        int tipo;
        System.out.println("1 - SMS \n2-Email");
        tipo = leia.nextInt();
        
        String texto = JOptionPane.showInputDialog(null);
        Mensagem mensagem = MensagemFactory.getMensagem(tipo);
        mensagem.enviar(texto);
        
    }
    
}

