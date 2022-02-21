package fundamentos.operadores.desafios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor da base do tri�ngulo:");
		double vlrBase = entrada.nextDouble();
		System.out.println("Digite o valor da altura do tri�ngulo:");
		double vlrAltura = entrada.nextDouble();
		double vlwArea = ( vlrBase * vlrAltura) / 2;
				
		System.out.printf("A �rea do triangulo digitado �: %.1f", vlwArea);
		
		entrada.close();

	}

}

/* 
 * 
 * 
 * Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0) utilizando a f�rmula de Bhaskara. 
 *      Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
 * */