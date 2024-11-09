package tech.ada.luderiaJogos.config;

public class JogoNaoEncontradoException extends RuntimeException{

    String busca;

    public JogoNaoEncontradoException(String busca){
        this.busca = busca;
    }

    public String getBusca(){
        return this.busca;
    }
}
