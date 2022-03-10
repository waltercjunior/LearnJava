package fundamentos.operadores.desafios;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		// Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
		//      Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		
		int a = 1;
		int b = 12;
		int c = -13;
		
		/*
		 * x = -b +- Raiz b2 - 4a.c
		 *     --------------------
		 *            2a
		 * */
		
		/*
		 * double num1 = -(b);
		 * double num2 = Math.sqrt(
		 *     (Math.pow(b, 2) - (4 * (a * c))));
		 *     		double denm = 2 * a;
		 *		double resultPositv = (num1 + num2) / denm;
		 *		double resultNegatv = (num1 - num2) / denm;
		 *		System.out.printf("O valor de Delta está entre %.1f e %.1f", resultPositv, resultNegatv);
		 */

		/*            
		 * Delta = bsqr - 4a.c
		 */

		Double deltaPos = Math.pow(b, 2) - (4 *(a *c));
		Double deltaNeg = Math.pow(b, 2) + (4 *(a *c));
		
		System.out.printf("O valor de Delta está entre %.1f e %.1f", deltaPos, deltaNeg);
	
		
	}

}