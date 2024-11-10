package tech.ada.luderiaJogos.controller;

import org.springframework.web.bind.annotation.*;
import tech.ada.luderiaJogos.model.Mecanica;
import tech.ada.luderiaJogos.service.AtualizarJogoService;

@RestController
@RequestMapping("/v1/atualizar")
public class AtualizarJogoController {

    private final AtualizarJogoService atualizarJogoService;

    public AtualizarJogoController(AtualizarJogoService atualizarJogoService){
        this.atualizarJogoService = atualizarJogoService;
    }

    @PatchMapping("/titulo/id/{id}")
    public String atualizarTituloJogoPorId(@PathVariable("id") Long id, @RequestBody String novoTitulo){
        return atualizarJogoService.atualizarTituloJogoPorId(id, novoTitulo);
    }

    @PatchMapping("/titulo/{tituloatual}")
    public String atualizarTituloJogo(@PathVariable("tituloaatual") String tituloAtual, @RequestBody String novoTitulo){
        return atualizarJogoService.atualizarTituloJogo(tituloAtual, novoTitulo);
    }

    @PatchMapping("/preco/{titulo}")
    public String atualizarPrecoJogo(@PathVariable("titulo") String titulo, @RequestBody Double novoPreco){
        return atualizarJogoService.atualizarPrecoJogo(titulo, novoPreco);
    }

    @PatchMapping("/mecanica/{titulo}")
    public String atualizarMecanicaJogo(@PathVariable("titulo") String titulo, Mecanica novaMecanica){
        return atualizarJogoService.atualizarMecanicaJogo(titulo, novaMecanica);
    }
}
