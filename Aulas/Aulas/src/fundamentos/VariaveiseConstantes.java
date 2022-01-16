package fundamentos;

public class VariaveiseConstantes {
	public static void main(String[] args) {
		double raio = 3.4;
		// o PI deve ser constante entao usamos a palavra final
		//Constantes devem estar descritas com letras maiusculas
		final double PI = 3.14159;
		
		double areaCirco = PI *raio * raio;
		System.out.println("A area do raio é igual a "+areaCirco);
	}
}
