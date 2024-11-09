package tech.ada.luderiaJogos.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class GerenciadorDeExcecoes {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(JogoNaoEncontradoException.class)
    public String responderExcecaoDeJogoNaoEncontrado(JogoNaoEncontradoException exception){
        return String.format("O jogo %s não está cadastrado no sistema!", exception.getBusca());
    }
}
