package java.com.github.TanyRM.poo.mc04;

import java.util.List;

public class Convite {
    private Pessoa convidado;
    private List<Pessoa> acompanhantes;

    public void adicionarAcomp(Pessoa acompanhante){
        acompanhantes.add(acompanhante);
    }
}
