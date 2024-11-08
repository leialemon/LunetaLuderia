package tech.ada.luderiaJogos.service;

import org.springframework.stereotype.Service;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.repository.JogoRepository;

@Service
public class DeletarJogoService {

    private final JogoRepository jogoRepository;

    public DeletarJogoService(JogoRepository jogoRepository){
        this.jogoRepository = jogoRepository;
    }

    public void deletarJogo(Jogo jogo){
        jogoRepository.delete(jogo);
    }
}
