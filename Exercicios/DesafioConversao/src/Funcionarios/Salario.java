package Funcionarios;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		//entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro salario: ");
		var valor1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o segundo salario: ");
		var valor2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o terceiro salario: ");
		var valor3 = entrada.next().replace(",", ".");
		
		//processsamento
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		var soma = salario1 + salario2 + salario3;
		var media = soma /3;
		
		//saida
		System.out.printf("Salario total: %.2f", soma);
		System.out.printf("media salarial: %.2f", media);

		entrada.close();
	}
}
