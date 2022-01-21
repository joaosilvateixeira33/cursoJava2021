package fundamentos.operadores;

public class OperadoresRelacionais {
	public static void main(String[] args) {
//		int a = 97;
//		char b = 'a';
//		
//		System.out.println("É igual? "+(a == b)); // true
//		
//		System.out.println("É maior? "+ (4 > 7));  // false
//		System.out.println("É menor? "+ (8 < 9 )); // true
//		System.out.println("É maior ou igual? "+ (11 >= 20)); // false
//		System.out.println("É menor ou igual? "+ (11 <= 20)); // true
////		System.out.println("Não é igual? "+ (20 != 20)); // false
//		
		//exemplo
		boolean PassouPorFrequencia = true;
		double Nota = 4.8;
		boolean PassouPorNota = Nota >= 7.0;
		boolean EstaDeCastigo = PassouPorFrequencia && PassouPorNota;
		System.out.println("Esta de castigo? " + EstaDeCastigo);
		
		
		
	}
}
