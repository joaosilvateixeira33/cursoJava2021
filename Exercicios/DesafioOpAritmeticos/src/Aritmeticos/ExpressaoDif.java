package Aritmeticos;

public class ExpressaoDif {
	public static void main(String[] args) {
		//expressao 1
		var expressao1 = Math.pow(6 *(3+2),2);
		var resultA= expressao1/6;
		
		//expresao 2
		var expressao2 = (1-5)*(2-7)/2;
		var resultB = Math.pow(expressao2, 2);
		
		//expressao 3
		var expressao3 = resultA - resultB;
		var resultC = Math.pow(expressao3, 3);
		var resultD = resultC / Math.pow(10, 3);
		
		System.out.println(resultD);
		
	}
}
