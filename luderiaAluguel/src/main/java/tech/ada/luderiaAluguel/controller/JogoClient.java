package tech.ada.luderiaAluguel.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tech.ada.luderiaAluguel.model.Jogo;

@FeignClient(name = "luderiaJogos")
public interface JogoClient {

    @GetMapping("/v1/jogos/buscar/{tituloexato}")
    public Jogo buscarJogoPorTituloExato(@PathVariable("tituloexato") String tituloExato);
}
