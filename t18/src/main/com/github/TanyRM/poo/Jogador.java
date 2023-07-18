package com.github.tanyrm.poo;

public class Jogador {
    private String cor;

    public Jogador(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return cor;
    }
}
