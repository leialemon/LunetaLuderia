package tech.ada.luderiaJogos.model;

public enum Mecanica {
    DECK_BUILDING("Nesta mecânica, os jogadores começam com um baralho básico e, ao longo do jogo, compram cartas para adicionar ao seu baralho, personalizando-o. "),
    WORKER_PLACEMENT("Os jogadores têm um número limitado de “trabalhadores” para alocar em ações específicas do tabuleiro a cada turno. Essas ações fornecem recursos, pontos ou outras vantagens."),
    PUSH_YOUR_LUCK("Os jogadores decidem se querem continuar realizando ações arriscadas para obter mais recompensas ou se preferem parar antes de arriscar perder tudo. "),
    AREA_CONTROL("Os jogadores competem para dominar áreas específicas do tabuleiro, geralmente ganhando pontos com base em quem tem o maior controle em cada área."),
    COOPERATIVE("Os jogadores trabalham juntos para vencer o jogo, enfrentando desafios controlados pelo jogo, em vez de competir entre si. "),
    DRAFTING("Os jogadores escolhem cartas ou peças de uma seleção comum em turnos, com cada escolha afetando as opções dos outros."),
    ROLL_AND_WRITE("Os jogadores lançam dados ou viram cartas e, com base nos resultados, escrevem ou marcam ações em suas folhas individuais para acumular pontos. "),
    SET_COLLECTION("Os jogadores coletam itens ou cartas de tipos específicos para formar conjuntos que pontuam mais ao serem completados. "),
    ENGINE_BUILDING("Os jogadores desenvolvem um sistema de recursos ou habilidades que se torna mais eficiente com o tempo, proporcionando maior produção e vantagem conforme o jogo avança."),
    HIDDEN_ROLES("Cada jogador tem um papel secreto, e o objetivo é deduzir quem tem cada papel, muitas vezes através de blefe e dedução social."),
    ACTION_POINTS(" Cada jogador tem um número fixo de pontos de ação para gastar em diferentes ações em seu turno. A estratégia está em gerenciar esses pontos de forma eficiente."),
    TILE_PLACEMENT("Os jogadores colocam peças ou cartas em um tabuleiro ou área para formar padrões, caminhos ou áreas de controle."),
    AUCTION("Os jogadores competem em leilões para adquirir recursos ou vantagens, geralmente usando uma quantidade limitada de dinheiro ou recursos."),
    PROGRAMMED_MOVEMENT("Os jogadores planejam e “programam” suas ações com antecedência, revelando-as simultaneamente para criar uma sequência de movimento ou ação."),
    RESOURCE_MANAGEMENT("Os jogadores devem gerenciar seus recursos (dinheiro, comida, energia etc.) com eficiência para atingir seus objetivos no jogo.")
    ;
    private String descricao;

    Mecanica(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
