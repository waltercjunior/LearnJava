package fundamentos.operadores.desafios;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua altura: ");
		Double vlwAltura = entrada.nextDouble();
		System.out.println("Digite a seu peso: ");
		Double vlwPeso = entrada.nextDouble();

		Double vlwIMC = vlwPeso / Math.pow((vlwAltura / 100), 2);
				
		System.out.printf("O valor do IMC da pessoa com %.2f com a %.2f é de: %.2f", vlwAltura/100, vlwPeso, vlwIMC);		
		
		entrada.close();		
	}

}
