package fundamentos.operadores;


public class OperadoresTernarios {
	public static void main(String[] args) {
		double Nota = 1.5;
		String NotaParcial = Nota >= 5.0 ? "Recuperação" : "Reprovado";
		String NotaFinal = Nota >= 7.0 ? "Aprovado" : NotaParcial;
		
		System.out.println("O aluno esta " + NotaFinal.concat("."));
	}
	
}
