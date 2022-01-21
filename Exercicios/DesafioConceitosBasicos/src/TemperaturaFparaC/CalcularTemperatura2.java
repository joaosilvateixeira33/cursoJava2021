package TemperaturaFparaC;

public class CalcularTemperatura2 {

	public static void main(String[] args) {
		// F° = (C * 9/5) + 32
		final int Auxiliar1 = 32;
		final double Auxiliar2 = 9.0/5.0;
	    int C = 50;
	    double F = (C * Auxiliar2) + Auxiliar1 ;
				
		System.out.printf("Temperatura em Farheint: %.3f",F);
	}

}
