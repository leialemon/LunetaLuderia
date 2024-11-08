package tech.ada.luderiaJogos.service;

import org.springframework.stereotype.Service;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.repository.JogoRepository;

@Service
public class AtualizarJogoService {

    private final JogoRepository jogoRepository;
    private final BuscarJogoService buscarJogoService;

    public AtualizarJogoService(JogoRepository jogoRepository, BuscarJogoService buscarJogoService){
        this.jogoRepository = jogoRepository;
        this.buscarJogoService = buscarJogoService;
    }

    public void atualizarJogo(Jogo jogo){

    }

}
