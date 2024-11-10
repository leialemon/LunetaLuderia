package tech.ada.luderiaJogos.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.service.DeletarJogoService;

@RestController
@RequestMapping("/v1/deletar")
public class DeletarJogoController {

    private final DeletarJogoService deletarJogoService;

    public DeletarJogoController(DeletarJogoService deletarJogoService){
        this.deletarJogoService = deletarJogoService;
    }

    @DeleteMapping
    public void deletarJogo(@RequestBody Jogo jogo){
        deletarJogoService.deletarJogo(jogo);
    }
}
