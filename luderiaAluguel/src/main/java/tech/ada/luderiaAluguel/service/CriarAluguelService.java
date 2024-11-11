package tech.ada.luderiaAluguel.service;

import org.springframework.stereotype.Service;
import tech.ada.luderiaAluguel.repository.AluguelRepository;

@Service
public class CriarAluguelService {

    private final AluguelRepository aluguelRepository;

    public CriarAluguelService(AluguelRepository aluguelRepository){
        this.aluguelRepository = aluguelRepository;
    }


}
