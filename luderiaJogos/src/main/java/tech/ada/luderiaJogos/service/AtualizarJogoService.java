package tech.ada.luderiaJogos.service;

import org.springframework.stereotype.Service;
import tech.ada.luderiaJogos.config.JogoNaoEncontradoException;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.model.Mecanica;
import tech.ada.luderiaJogos.repository.JogoRepository;

import java.util.Optional;

@Service
public class AtualizarJogoService {

    private final JogoRepository jogoRepository;
    private final BuscarJogoService buscarJogoService;

    public AtualizarJogoService(JogoRepository jogoRepository, BuscarJogoService buscarJogoService){
        this.jogoRepository = jogoRepository;
        this.buscarJogoService = buscarJogoService;
    }

    public String atualizarTituloJogo(String tituloAtual, String novoTitulo){
        Optional<Jogo> jogo = buscarJogoService.buscarJogoPorTituloExato(tituloAtual);
        if (jogo.isEmpty()){
            throw new JogoNaoEncontradoException(tituloAtual);
        }
        Jogo jogoASerAtualizado = jogo.get();
        jogoASerAtualizado.setTitulo(novoTitulo);
        jogoRepository.save(jogoASerAtualizado);
        return String.format("Jogo %s atualizado com sucesso!", jogoASerAtualizado.getTitulo());
    }

    public String atualizarPrecoJogo(String titulo, Double novoPreco){
        Optional<Jogo> jogo = buscarJogoService.buscarJogoPorTituloExato(titulo);
        if (jogo.isEmpty()){
            throw new JogoNaoEncontradoException(titulo);
        }
        Jogo jogoASerAtualizado = jogo.get();
        jogoASerAtualizado.setPreco(novoPreco);
        jogoRepository.save(jogoASerAtualizado);
        return String.format("Jogo %s atualizado com sucesso!", jogoASerAtualizado.getTitulo());
    }

    public String atualizarMecanicaJogo(String titulo, Mecanica novaMecanica){
        Optional<Jogo> jogo = buscarJogoService.buscarJogoPorTituloExato(titulo);
        if (jogo.isEmpty()){
            throw new JogoNaoEncontradoException(titulo);
        }
        Jogo jogoASerAtualizado = jogo.get();
        jogoASerAtualizado.setMecanica(novaMecanica);
        jogoRepository.save(jogoASerAtualizado);
        return String.format("Jogo %s atualizado com sucesso!", jogoASerAtualizado.getTitulo());
    }



}
