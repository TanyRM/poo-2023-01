package java.com.github.TanyRM.poo.mc03;

import java.util.List;

public class Item {
    private List<Sanduiche> sanduiches;
    private List<Bebida> bebidas;
    private List<Detalhe> detalhes;

    public void adicionarSanduiche(Sanduiche sanduiche){
        sanduiches.add(sanduiche);
    }

    public void adicionarBebida(Bebida bebida){
        bebidas.add(bebida);
    }

    public void adicionarDetalhe(Detalhe detalhe){
        detalhes.add(detalhe);
    }
}
