package java.com.github.tanyrm.poo.t07;

public class Permuta {
	public static void Permutacao(String p, String S) {
		if (S.length() == 1) {
			System.out.println(p+S);
		}
		else {
			String Slinha;
			String pLinha;
			
			for (int j=0; j<S.length();j++) {
				Slinha = S.substring((int) 0,j)+S.substring(j+1);
				pLinha = p+S.charAt(j);
				Permutacao(pLinha,Slinha);
			}
		}
	}
	public static void main(String[] args) {
		Permutacao(new String(),args[0]);
	}
}
