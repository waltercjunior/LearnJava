package fundamentos.operadores.desafios;

import java.util.Scanner;

public class QuadradoCubo {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor a ser calculado:");
		double valor = entrada.nextDouble();
		
		System.out.printf("O valor %.1f tem o valor %.1f o seu quadrado e %.1f o seu cubo", valor, Math.pow(valor,2), Math.pow(valor, 3));
		
		entrada.close();

	}
	
}
