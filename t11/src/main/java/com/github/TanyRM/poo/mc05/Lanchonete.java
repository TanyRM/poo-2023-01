package java.com.github.TanyRM.poo.mc05;
import java.util.List;

public class Lanchonete {
    private List<Funcionario> funcionarios;
    private Funcionario gerente;

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    public void setGerente(Funcionario gerente){
        this.gerente = gerente;
    }
}
