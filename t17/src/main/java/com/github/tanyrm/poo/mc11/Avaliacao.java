package java.com.github.tanyrm.poo.mc11;

import java.util.List;

public class Avaliacao {
    private List<Questao> questoes;
    private Prova prova;
    
    public void adicionarQuestao(Questao questao){
        questoes.add(questao);
    }
}
