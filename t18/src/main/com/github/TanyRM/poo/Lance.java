package com.github.tanyrm.poo;

public class Lance {
    private Jogador jogador;
    private Peca peca;
    private Posicao origem;
    private Posicao destino;
    
    public Lance(Jogador jogador, Peca peca, Posicao origem, Posicao destino) {
        this.jogador = jogador;
        this.peca = peca;
        this.origem = origem;
        this.destino = destino;
    }
    
    @Override
    public String toString() {
        return jogador +"\n" + peca + " - de " + origem + " para " + destino;
    }   
}
