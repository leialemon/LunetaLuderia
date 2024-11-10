package tech.ada.luderiaJogos.controller;

import org.springframework.web.bind.annotation.*;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.service.AtualizarJogoService;
import tech.ada.luderiaJogos.service.CriarJogoService;
import tech.ada.luderiaJogos.service.DeletarJogoService;

@RestController
@RequestMapping("/v1/jogos")
public class CriarJogoController {

    private final CriarJogoService criarJogoService;


    public CriarJogoController(CriarJogoService criarJogoService){
        this.criarJogoService = criarJogoService;
    }

    @PostMapping()
    public void criarJogo(@RequestBody Jogo jogo){
        criarJogoService.criarJogo(jogo);
    }

}
