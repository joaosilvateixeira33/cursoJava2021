package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String Nome = entrada.next();
		
		System.out.println("Digite seu sobrenome: ");
		String Sobrenome = entrada.next();
		
		System.out.println("Digite sua idade: ");
		int Idade = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Digite seu salario: ");
		double Salario = entrada.nextDouble();
		entrada.nextLine();

		String info = String.format("Nome: %s\nSobrenome: %s\nIdade: %d\nSalario: R$ %.2f", Nome, Sobrenome,Idade,Salario);
		System.out.println(info);
		entrada.close();
	}
}
