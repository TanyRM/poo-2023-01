package t08.t8;

public class JanelaGrafica {
	public ElemInteracao[] ei;
	
	public static void main(String[] args) {
		JanelaGrafica janela = new JanelaGrafica();
		
		ElemInteracao menu = new ElemInteracao();
        ElemInteracao botao = new ElemInteracao();
        ElemInteracao barraRolagem = new ElemInteracao();

        janela.ei = new ElemInteracao[3];
        janela.ei[0] = menu;
        janela.ei[1] = botao;
        janela.ei[2] = barraRolagem;
	}
}
