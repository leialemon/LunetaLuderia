package tech.ada.luderiaJogos.model;

public class JogoMapper {

    public JogoDto deJogoParaDto(Jogo jogo){
        JogoDto retorno = new JogoDto();
        retorno.setPreco(jogo.getPreco());
        retorno.setTitulo(jogo.getTitulo());
        retorno.setDisponivel(jogo.isDisponivel());
        return retorno;
    }

    public Jogo deDtoParaJogo(JogoDto jogoDto){
        Jogo retorno = new Jogo();
        retorno.setDisponivel(jogoDto.isDisponivel());
        retorno.setPreco(jogoDto.getPreco());
        retorno.setTitulo(jogoDto.getTitulo());
        return retorno;
    }
}
