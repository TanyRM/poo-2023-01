package java.com.github.tanyrm.poo.mc02;

import java.util.List;

public class Tripulacao {
    private Piloto piloto;
    private CoPiloto coPiloto;
    private List<Aeromoca> aeromocas;

    public void adicionarAeromocas(Aeromoca aeromoca){
        aeromocas.add(aeromoca);
    }
}
