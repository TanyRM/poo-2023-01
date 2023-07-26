package java.com.github.tanyrm.poo.mc11;

import java.util.List;

public class Calendario {
    private int ano;
    private Evento[] feriados;
    private List<Evento> datasImportantes;

    public void adicionarData(Evento data) {
        datasImportantes.add(data);
    }
}