package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStrinNum {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite um numero: ");
		String valor2 = JOptionPane.showInputDialog("Digite outro numero: ");
		
		var num1 = Integer.parseInt(valor1);
		var num2 = Integer.parseInt(valor2);
		
		var soma = num1 + num2;
		System.out.printf("A soma entre %d + %d = %d", num1, num2, soma);
	}
}
