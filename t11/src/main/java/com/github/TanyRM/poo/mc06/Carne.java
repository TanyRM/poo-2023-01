package java.com.github.tanyrm.poo.mc06;

import java.util.List;

public class Carne {
    private List<Prestacao> prestacoes;
    private Compra compra;
    
    public void adicionarPrestacoes(Prestacao prestacao){
        prestacoes.add(prestacao);
    }
}
