package java.com.github.TanyRM.poo.mc09;

import java.util.List;

public class Comite {
    private List<Pessoa> membros;
    private List<Pessoa> presidentes;

    public void adicionarMembro(Pessoa membro){
        membros.add(membro);
    }
    public void adicionarPresidente(Pessoa presidente) {
        if (presidentes.size()<=2 ) {
            presidentes.add(presidente);
        }
    }
}
