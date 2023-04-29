package t07;

public abstract class Pessoa1 {
	    private Data nascimento;
	    public short idade;
	    private String nome;
	    private Pessoa pai;
	    private Pessoa mae;
	    
	    public short getIdade() {
			return idade;
		}
		public void setIdade(short idade) {
			this.idade = idade;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Pessoa getPai() {
			return pai;
		}
		public void setPai(Pessoa pai) {
			this.pai = pai;
		}
		public Pessoa getMae() {
			return mae;
		}
		public void setMae(Pessoa mae) {
			this.mae = mae;
		}
		public Data getNascimento() {
			return nascimento;
		}
		public void setNascimento(Data nascimento) {
			this.nascimento = nascimento;
		}
}
