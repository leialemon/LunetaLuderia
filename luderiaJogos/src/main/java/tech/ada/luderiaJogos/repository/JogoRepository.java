package tech.ada.luderiaJogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ada.luderiaJogos.model.Jogo;
import tech.ada.luderiaJogos.model.Mecanica;

import java.util.List;
import java.util.Optional;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long>{
    public List<Jogo> findByMecanica(Mecanica mecanica);
    public Optional<Jogo> findByTitulo(String titulo);
    public List<Jogo> findByTituloContaining(String busca);
}
