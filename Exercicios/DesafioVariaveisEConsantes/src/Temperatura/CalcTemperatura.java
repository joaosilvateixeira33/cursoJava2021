package Temperatura;

public class CalcTemperatura {
	public static void main(String[] args) {
		//(F°-32) * 5/9 = C°
		final int ajuste = 32;
		final double multiplicador = 5.0/9.0;
		
		double f = 212.0;
		double c = (f - ajuste) * multiplicador;
		
		System.out.println("O valor de "+f+"F°"+"é igual a "+c+"C°");
	}
}
