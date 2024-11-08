package tech.ada.luderiaJogos.model;

import jakarta.persistence.*;

@Entity
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;

    private Float preco;

    @Enumerated(EnumType.STRING)
    private Mecanica mecanica;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Mecanica getMecanica() {
        return mecanica;
    }

    public void setMecanica(Mecanica mecanica) {
        this.mecanica = mecanica;
    }
}
