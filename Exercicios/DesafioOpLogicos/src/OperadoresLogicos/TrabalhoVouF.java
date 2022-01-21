package OperadoresLogicos;

public class TrabalhoVouF {
	public static void main(String[] args) {
		
		boolean TrabalhoT = false;
		boolean TrabalhoQ = false;
		
		if(TrabalhoT && TrabalhoQ) {
			System.out.println("Comprar TV de 50 Polegadas");
		}else if(TrabalhoT ^ TrabalhoQ ){
			System.out.println("Comprar TV de 32 Polegadas");
		}else if(TrabalhoT || TrabalhoQ) {
			System.out.println("Tomar sorvete");
		}else if(!TrabalhoT && !TrabalhoQ) {
			System.out.println("Ficar em casa");
		}
	}
}