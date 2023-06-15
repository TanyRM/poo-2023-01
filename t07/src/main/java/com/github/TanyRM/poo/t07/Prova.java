package java.com.github.TanyRM.poo.t07;

public class Prova implements Identificacao {
	private byte numQuestoes;

    public byte getNumQuestoes(){
        return numQuestoes;
    }
    public void setNumQuestoes(byte n){
        if (n>0)
            this.numQuestoes = n;
    }
    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}
