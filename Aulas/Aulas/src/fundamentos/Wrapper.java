package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		//Wrapper e a versao classe dos tipos primitivos
		Byte b = 10;
		Short s = 100;
		Integer i = 10000;
		Long l = 1000000L;
		
		System.out.println(b.toString());
		System.out.println(s.compareTo(s));
		System.out.println(i.intValue());
		System.out.println(l.equals(b));
		
		Boolean bo = true;
		System.out.println(bo.compareTo(bo));
	}
}
