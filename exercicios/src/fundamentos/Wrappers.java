package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {

//		Scanner entrada = new Scanner(System.in);
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
		Integer ii = Integer.parseInt("1000");
		long l = 100000L;

		System.out.println("O valor de b � " + b.byteValue());
		System.out.println(s.toString());

		System.out.println("Digite um valor: ");
		//ii = Integer.parseInt(entrada.next());
		System.out.println("O tr�pulo do valor digitado foi: " + ii * 3);

//		entrada.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '#';
		System.out.println(c.toString() + "...");

	}

}
