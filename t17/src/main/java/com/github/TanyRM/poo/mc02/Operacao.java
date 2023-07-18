package java.com.github.tanyrm.poo.mc02;

import java.util.List;

public class Operacao {
    private String tipo;
    private String data;
    private String hora;
    private List<Voo> voos;
    private Aeroporto aeroporto;
    
    public void adicionarVoo(Voo voo){
        voos.add(voo);
    }
}
