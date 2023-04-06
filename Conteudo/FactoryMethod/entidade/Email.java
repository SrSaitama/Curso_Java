package Conteudo.FactoryMethod.entidade;

import javax.swing.JOptionPane;


public class Email implements Mensagem{

    @Override
    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null, "E-mail: " + mensagem);
    }
    
}

