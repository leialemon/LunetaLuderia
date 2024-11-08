package tech.ada.luderiaJogos.controller;

import org.springframework.web.bind.annotation.*;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.service.AtualizarJogoService;
import tech.ada.luderiaJogos.service.BuscarJogoService;
import tech.ada.luderiaJogos.service.CriarJogoService;
import tech.ada.luderiaJogos.service.DeletarJogoService;

import java.util.List;

@RestController
@RequestMapping("/v1/jogos")
public class JogosController {

    private final CriarJogoService criarJogoService;
    private final BuscarJogoService buscarJogoService;
    private final AtualizarJogoService atualizarJogoService;
    private final DeletarJogoService deletarJogoService;

    public JogosController(CriarJogoService criarJogoService, BuscarJogoService buscarJogoService, AtualizarJogoService atualizarJogoService, DeletarJogoService deletarJogoService){
        this.criarJogoService = criarJogoService;
        this.buscarJogoService = buscarJogoService;
        this.atualizarJogoService = atualizarJogoService;
        this.deletarJogoService = deletarJogoService;
    }

    @PostMapping("/criar")
    public void criarJogo(@RequestBody Jogo jogo){
        criarJogoService.criarJogo(jogo);
    }

    @GetMapping
    public List<Jogo> mostrarTodosOsJogos(){
        return buscarJogoService.mostrarTodosJogos();
    }

    @DeleteMapping
    public void deletarJogo(Jogo jogo){
        deletarJogoService.deletarJogo(jogo);
    }

}
