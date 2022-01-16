package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionario
		//Tipos inteiros
		byte AnosdeEmpresa = 40;
		short NumeroVoos = 245;
		int Id = 0204456;
		long PontosAcumulados = 2_334_340_220L;//para tornar um valor long literal use "L" no final da numerção
		
		//Tipos reais
		float Salario = 2_334.3456F;//para tornar um valor float literal use "F" no final da numerção
		double VendasAcumuladas = 3_445_393_999.01;
		
		//Tipo verdeiro ou falso
		boolean Ferias = true;
		
		//Tipo texto ou caractere
		char Situacao = 'I';
		
		//processamento de  dados do funcuionario
		var DiasEmpresa = AnosdeEmpresa * 365;
		var NumViagem = NumeroVoos / 2;
		var PontosReal = PontosAcumulados / VendasAcumuladas;
		
		//Mostrar informações do funcionario na tela
		System.out.println("---- Informações do Funcionario ----");
		System.out.println("Numero de identificação(ID): "+Id);
		System.out.println("Salario: "+ Salario);
		System.out.println("Tempo de empresa: "+DiasEmpresa+" dias");
		System.out.println("Tempo de viagem: "+ NumViagem+" dias");
		System.out.println("Pontos Reais: "+PontosReal);
		System.out.println("Situação: "+Situacao);
		if(Situacao == 'A') {
			Ferias = false;
		}else if(Situacao == 'I'){
			Ferias = true;
		}
		System.out.println("Esta de Ferias? "+Ferias);
		
	}
	
}
