package fundamentos;

public class ConvTiposPrimitNum {
	public static void main(String[] args) {
		double a =1;//conversao implicita
		System.out.println(a);
		
		var b = (int)1.0;
		System.out.println(b);
		
		var c =(double) 20.1020f;
		System.out.println(c);
	}
}
