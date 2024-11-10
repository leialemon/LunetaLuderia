package tech.ada.luderiaJogos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.luderiaJogos.config.JogoNaoEncontradoException;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.model.Mecanica;
import tech.ada.luderiaJogos.service.BuscarJogoService;

import java.util.List;

@RestController
@RequestMapping("/v1/jogos/buscar")
public class BuscarJogoController {

    private final BuscarJogoService buscarJogoService;

    public BuscarJogoController(BuscarJogoService buscarJogoService){
        this.buscarJogoService = buscarJogoService;
    }

    @GetMapping("/titulo")
    public Jogo buscarJogoPorTituloExato(@RequestParam String tituloExato){
        return buscarJogoService.buscarJogoPorTituloExato(tituloExato).orElseThrow(() -> new JogoNaoEncontradoException(tituloExato));
    }

    @GetMapping("/pesquisa")
    public List<Jogo> buscarJogosPorTitulo(@RequestParam String busca){
        return buscarJogoService.buscarJogosPorTitulo(busca);
    }

    @GetMapping("/mecanica")
    public List<Jogo> buscarJogosPorMecanica(@RequestParam Mecanica mecanica){
        return buscarJogoService.buscarJogosPorMecanica(mecanica);
    }

    @GetMapping
    public List<Jogo> mostrarTodosOsJogos(){
        return buscarJogoService.mostrarTodosJogos();
    }
}
