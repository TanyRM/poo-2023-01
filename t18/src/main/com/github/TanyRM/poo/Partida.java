package com.github.TanyRM.poo;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private List<Lance> lances;
    private List<String> comentarios;
    private Jogador jogador1;
    private Jogador jogador2;
    
    public Partida() {
        lances = new ArrayList<>();
        comentarios = new ArrayList<>();
        jogador1 = new Jogador("Branco");
        jogador2 = new Jogador("Preto");
    }
    public Jogador getJogador1() {
        return jogador1;
    }
    public Jogador getJogador2() {
        return jogador2;
    }
    public void adicionarLance(Lance lance) {
        lances.add(lance);
    }
    public void adicionarComentario(String comentario) {
        comentarios.add(comentario);
    }

    @Override
    public String toString() {
        StringBuilder partidaString = new StringBuilder(); //classe para manipular strings sem precisar do +

        partidaString.append("Partida Imortal\n"); //'append' método da classe StringBuilder que adiciona valores a uma sequencia
        partidaString.append(jogador1).append(": Adolf Anderssen").append("\n");
        partidaString.append(jogador2).append(": Lionel Kieseritzky").append("\n\n");
        //StringBuider cria uma sequencia textual de partida e append adiciona as informações

        for (int i=0; i<lances.size(); i++) {
            Lance lance = lances.get(i); //lance na posição i
            partidaString.append(i+1).append(". ").append(lance).append("\t").append(comentarios.get(i)).append("\n");
            if ((i+1)%2 == 0) { //quebra de linha depois dos movimentos dos dois jogadores (um lance)
                partidaString.append("\n");
            }
            
        }
        return partidaString.toString();
    }
}
