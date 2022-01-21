package Desafio1;

import java.util.Scanner;

public class CalculadoraV1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numerador = entrada.nextDouble();
		
		System.out.println("\nDigite outro numero: ");
		double denominador = entrada.nextDouble();
		
		System.out.println("\nEscolha uma expressao [+, -, /, %]: ");
		String escolha = entrada.next();
		
		double resposta = "+".equals(escolha) ? numerador + denominador: 0; 
		resposta = "-".equals(escolha) ? numerador - denominador: resposta;
		resposta = "*".equals(escolha) ? numerador * denominador: resposta;
		resposta = "/".equals(escolha) ? numerador / denominador: resposta;
		resposta = "%".equals(escolha) ? numerador % denominador: resposta;
		
		System.out.printf("Resultado: %.2f %s %.2f = %.2f",numerador,escolha,denominador, resposta);
		
		entrada.close();
	}
}
