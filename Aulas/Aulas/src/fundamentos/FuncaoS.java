package fundamentos;

public class FuncaoS {
	public static void main(String[] args) {
		String Nome = "João Marcos";
		String Sobrenome ="Silva";
		int Idade = 22;
		double Salario = 1_066.00;
		
		String funcionario = String.format("Nome: %s\nSobrenome: %s\nIdade: %d\nSalario: R$ %.2f", Nome,Sobrenome,Idade,Salario);
		System.out.println(funcionario);
		
		
		
	}
}
