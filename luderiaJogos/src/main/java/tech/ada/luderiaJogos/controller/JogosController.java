package tech.ada.luderiaJogos.controller;

import org.springframework.web.bind.annotation.*;
import tech.ada.luderiaJogos.config.JogoNaoEncontradoException;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.model.Mecanica;
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

    @PostMapping()
    public void criarJogo(@RequestBody Jogo jogo){
        criarJogoService.criarJogo(jogo);
    }

    @GetMapping("/buscar/titulo")
    public Jogo buscarJogoPorTituloExato(@RequestParam String tituloExato){
        return buscarJogoService.buscarJogoPorTituloExato(tituloExato).orElseThrow(() -> new JogoNaoEncontradoException(tituloExato));
    }

    @GetMapping("/buscar")
    public List<Jogo> buscarJogosPorTitulo(@RequestParam String busca){
        return buscarJogoService.buscarJogosPorTitulo(busca);
    }

    @GetMapping("/buscar/mecanica")
    public List<Jogo> buscarJogosPorMecanica(@RequestParam Mecanica mecanica){
        return buscarJogoService.buscarJogosPorMecanica(mecanica);
    }

    @GetMapping
    public List<Jogo> mostrarTodosOsJogos(){
        return buscarJogoService.mostrarTodosJogos();
    }

    @DeleteMapping
    public void deletarJogo(@RequestBody Jogo jogo){
        deletarJogoService.deletarJogo(jogo);
    }
    //TODO verificar como fazer o método PUT
//    @PutMapping
//    public String atualizarJogo(@RequestBody String titulo){
//        atualizarJogoService.atualizarJogo(titulo);
//        return "Jogo atualizado com sucesso!";
//   }

}
