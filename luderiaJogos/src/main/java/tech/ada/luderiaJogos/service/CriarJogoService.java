package tech.ada.luderiaJogos.service;

import org.springframework.stereotype.Service;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.repository.JogoRepository;

@Service
public class CriarJogoService {

    private final JogoRepository jogoRepository;

    public CriarJogoService(JogoRepository jogoRepository){
        this.jogoRepository = jogoRepository;
    }

    public void CriarJogo(Jogo jogo){
        jogoRepository.save(jogo);
    }

}
