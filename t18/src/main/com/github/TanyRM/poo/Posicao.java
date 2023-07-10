package com.github.TanyRM.poo;

public class Posicao {
    private char x;
    private char y;

    public Posicao(char x, char y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "" + x + y + "" ;
    }
}
