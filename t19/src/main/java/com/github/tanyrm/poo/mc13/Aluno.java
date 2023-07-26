package java.com.github.tanyrm.poo.mc13;

import java.util.List;

public class Aluno {
    private Computador computador;
    private List<Computador> computadores;

    public void adicionarComputador(Computador computador) {
        computadores.add(computador);
    }
}