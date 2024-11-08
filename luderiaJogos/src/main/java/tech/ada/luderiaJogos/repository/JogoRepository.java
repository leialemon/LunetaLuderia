package tech.ada.luderiaJogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ada.luderiaJogos.model.Jogo;

import java.util.List;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long>{
    public List<Jogo> findByMecanica();
}
