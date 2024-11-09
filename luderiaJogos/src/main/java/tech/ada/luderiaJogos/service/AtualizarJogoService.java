package tech.ada.luderiaJogos.service;

import org.springframework.stereotype.Service;
import tech.ada.luderiaJogos.config.JogoNaoEncontradoException;
import tech.ada.luderiaJogos.model.Jogo;
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

    public String atualizarJogo(String titulo){
        Optional<Jogo> jogo = buscarJogoService.buscarJogoPorTituloExato(titulo);
        if (jogo.isEmpty()){
            throw new JogoNaoEncontradoException(titulo);
        }
        jogoRepository.save(jogo.get());
        return String.format("Jogo %s atualizado com sucesso!", titulo);
    }

}
