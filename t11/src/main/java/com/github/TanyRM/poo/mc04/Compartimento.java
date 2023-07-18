package java.com.github.tanyrm.poo.mc04;

import java.util.List;

public class Compartimento {
    private List<Livro> livros;
    private List<CD> cds;

    //livros = new Livro[3];
    public void adicionarLivro(Livro livro) {
        if (livros.size() < 3) {
            livros.add(livro);
        }
    }
    public void adicionarCD(CD cd) {
        if (cds.size() == 2 || cds.size() == 4 || cds.size() == 7 || cds.size() > 7) {
            cds.add(cd);
        }
    }
}
