package java.com.github.tanyrm.poo.mc10;

import java.util.List;

public class Viagem {
    private List<Passageiro> passageiros;
    private Motorista motorista;
    private Cidade origem;
    private Cidade destino;

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }
}