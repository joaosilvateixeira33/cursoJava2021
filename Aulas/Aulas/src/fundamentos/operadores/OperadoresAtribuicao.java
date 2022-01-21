package fundamentos.operadores;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		int a = 39;
		int b = a;
		int c = a +b;
		
		c += a; // c = c + 1
		c -= a; // c = c - 1
		c *= a; // c = c * 1
		c /= a; // c = c / 1
		
		c %= a; // c = c % 1 = 0 ou 1
		
		System.out.println(c);
	}

}
