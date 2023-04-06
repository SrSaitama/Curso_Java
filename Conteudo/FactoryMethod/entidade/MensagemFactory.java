package Conteudo.FactoryMethod.entidade;

public class MensagemFactory {
    
    public static Mensagem getMensagem(int tipo){
        if(tipo == 1){
            return new SMS();
        }
        else if(tipo == 2){
            return new Email();
        }
        else{
            return null;
        }
        
    }
    
}
