package tech.ada.luderiaJogos.controller;

import org.springframework.web.bind.annotation.*;
import tech.ada.luderiaJogos.config.JogoNaoEncontradoException;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.model.JogoDto;
import tech.ada.luderiaJogos.model.JogoMapper;
import tech.ada.luderiaJogos.model.Mecanica;
import tech.ada.luderiaJogos.service.BuscarJogoService;

import java.util.List;

@RestController
@RequestMapping("/v1/jogos/buscar")
public class BuscarJogoController {

    private final BuscarJogoService buscarJogoService;
    private final JogoMapper jogoMapper;

    public BuscarJogoController(BuscarJogoService buscarJogoService, JogoMapper jogoMapper){
        this.buscarJogoService = buscarJogoService;
        this.jogoMapper = jogoMapper;
    }

    @GetMapping("/{tituloexato}")
    public JogoDto buscarJogoPorTituloExato(@PathVariable("tituloExato") String tituloExato){
        return jogoMapper.deJogoParaDto(buscarJogoService.buscarJogoPorTituloExato(tituloExato).orElseThrow(() -> new JogoNaoEncontradoException(tituloExato)));
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
