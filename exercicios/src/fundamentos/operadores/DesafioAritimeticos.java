package fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * 		int a = 3 * 4 - 10;
		 * 		int b = (int) Math.pow(a, 3);
		 * 		System.out.println(b);
		 * 
		 * Desafio
		 * ([6*(3+2)]elv2 /3*2  - ((1-5) * (2 -7) / 2)elv2)elv3 / 10ele3
		 * 
		 *     [6*(3+2)]2        (1-5) * (2-7)
		 * (  -------------  - (---------------)2  )3
		 *       3 * 2                 2
		 * ------------------------------------------
		 *        10 3
		 * 
		 * */
		
		double numerador1 = 6 * (3+2);
		System.out.println(numerador1);
		
		numerador1 = Math.pow(numerador1, 2);
		System.out.println(numerador1);
		
		double denominador1 = 3 * 2;
		System.out.println(denominador1);
		
		double resultNumerador1 = numerador1 / denominador1;
		System.out.println(resultNumerador1);
		
		double numerador2 = ((1-5) * (2 - 7));
		System.out.println(numerador2);
		
		numerador2 = numerador2 /2;
		System.out.println(numerador2);
		
		double resultNumerador2 = Math.pow(numerador2, 2);
		System.out.println(resultNumerador2);
		
		numerador1 = resultNumerador1 - resultNumerador2;
		System.out.println(numerador1);
		
		double resultado = Math.pow(numerador1 / 10, 3);
		
		System.out.println((int) resultado);
		

	}

}
