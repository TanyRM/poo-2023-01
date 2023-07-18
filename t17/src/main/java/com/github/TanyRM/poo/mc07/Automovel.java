package java.com.github.tanyrm.poo.mc07;

public class Automovel {
    private String marca;
    private String modelo;
    private int ano;
    private Pessoa[] pessoas;
    private Pessoa motorista;

    public void setMotorista(Pessoa pessoa){
        this.motorista = pessoa;
    }
}
