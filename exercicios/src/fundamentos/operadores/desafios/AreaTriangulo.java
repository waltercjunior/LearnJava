package fundamentos.operadores.desafios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor da base do triângulo:");
		double vlrBase = entrada.nextDouble();
		System.out.println("Digite o valor da altura do triângulo:");
		double vlrAltura = entrada.nextDouble();
		double vlwArea = ( vlrBase * vlrAltura) / 2;
				
		System.out.printf("A área do triangulo digitado é: %.1f", vlwArea);
		
		entrada.close();

	}

}

/* 
 * 
 * 
 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
 *      Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
 * */