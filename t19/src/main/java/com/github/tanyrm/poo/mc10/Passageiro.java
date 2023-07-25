package java.com.github.tanyrm.poo.mc10;

import java.util.List;

public class Passageiro extends Papel {
    private List<Viagem> viagens;

    public void adicionarViagem(Viagem viagem) {
        viagens.add(viagem);
    }
}