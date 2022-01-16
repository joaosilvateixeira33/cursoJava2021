package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informa��es do funcionario
		//Tipos inteiros
		byte AnosdeEmpresa = 40;
		short NumeroVoos = 245;
		int Id = 0204456;
		long PontosAcumulados = 2_334_340_220L;//para tornar um valor long literal use "L" no final da numer��o
		
		//Tipos reais
		float Salario = 2_334.3456F;//para tornar um valor float literal use "F" no final da numer��o
		double VendasAcumuladas = 3_445_393_999.01;
		
		//Tipo verdeiro ou falso
		boolean Ferias = true;
		
		//Tipo texto ou caractere
		char Situacao = 'I';
		
		//processamento de  dados do funcuionario
		var DiasEmpresa = AnosdeEmpresa * 365;
		var NumViagem = NumeroVoos / 2;
		var PontosReal = PontosAcumulados / VendasAcumuladas;
		
		//Mostrar informa��es do funcionario na tela
		System.out.println("---- Informa��es do Funcionario ----");
		System.out.println("Numero de identifica��o(ID): "+Id);
		System.out.println("Salario: "+ Salario);
		System.out.println("Tempo de empresa: "+DiasEmpresa+" dias");
		System.out.println("Tempo de viagem: "+ NumViagem+" dias");
		System.out.println("Pontos Reais: "+PontosReal);
		System.out.println("Situa��o: "+Situacao);
		if(Situacao == 'A') {
			Ferias = false;
		}else if(Situacao == 'I'){
			Ferias = true;
		}
		System.out.println("Esta de Ferias? "+Ferias);
		
	}
	
}
