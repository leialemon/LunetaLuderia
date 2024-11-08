package tech.ada.luderiaJogos.service;

import org.springframework.stereotype.Service;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.model.Mecanica;
import tech.ada.luderiaJogos.repository.JogoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BuscarJogoService {

    private final JogoRepository jogoRepository;

    public BuscarJogoService(JogoRepository jogoRepository){
        this.jogoRepository = jogoRepository;
    }

    public Optional<Jogo> buscarJogoPorId(Long id){
        return jogoRepository.findById(id);
    }

    public Optional<Jogo> buscarJogoPorTituloExato(String titulo){
        return jogoRepository.findByTitulo(titulo);
    }

    public List<Jogo> buscarJogosPorMecanica(Mecanica mecanica){
        return jogoRepository.findByMecanica(mecanica);
    }

    public List<Jogo> buscarJogosPorTitulo(String titulo){
        return jogoRepository.findByTituloContaining(titulo);
    }

    public List<Jogo> mostrarTodosJogos(){
        return jogoRepository.findAll();
    }
}
