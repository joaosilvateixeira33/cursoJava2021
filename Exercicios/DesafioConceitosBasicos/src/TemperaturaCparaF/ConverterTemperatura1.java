package TemperaturaCparaF;

public class ConverterTemperatura1 {

	public static void main(String[] args) {
		// C° = (F-32) * 5/9
		final int Auxiliar1 = 32;
		final double Auxiliar2 = 5.0/9.0;
	    int F = 120;
		double C = (F - Auxiliar1) * Auxiliar2;
		
		System.out.printf("Temperatura em celsus: %.3f",C);

	}

}
