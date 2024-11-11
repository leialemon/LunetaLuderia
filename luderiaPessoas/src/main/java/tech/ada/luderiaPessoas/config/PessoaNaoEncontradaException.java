package tech.ada.luderiaPessoas.config;

public class PessoaNaoEncontradaException extends RuntimeException{

    public PessoaNaoEncontradaException(String message){
        super(message);
    }
}
