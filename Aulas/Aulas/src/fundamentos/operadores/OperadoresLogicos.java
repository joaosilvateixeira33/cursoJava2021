package fundamentos.operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		//tabela verdade valores logicos
		
		System.out.println("Tabela verdade do E (AND)");
		System.out.println(true && true );  // V
		System.out.println(true && false);  // F
//		System.out.println(false && true ); // F
//		System.out.println(false && false); // F
		
		System.out.println("\nTabela verdade do  OU (OR)");
//		System.out.println(true || true ); // V
//		System.out.println(true || false); // V
		System.out.println(false || true ); // V
		System.out.println(false || false); // F
		
		System.out.println("\nTabela verdade do  OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true ); // F
		System.out.println(true ^ false); // V
		System.out.println(false ^ true ); // V
		System.out.println(false ^ false); // F
		
		System.out.println("\nTabela verdade do NÃO (NOT)");
		System.out.println(!true ); // F
		System.out.println(!false); // V
		
		
	}
}
