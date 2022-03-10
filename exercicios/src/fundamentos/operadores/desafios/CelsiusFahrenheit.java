package fundamentos.operadores.desafios;

import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do Celsius: ");
		Double vlwCel = entrada.nextDouble();
		Double vlwFhr = (vlwCel * 1.8) +  32;
		
		System.out.printf("O valor %.2f Celsius em Fahrenheit é %.2f", vlwCel, vlwFhr);		
		
		entrada.close();		
	}

}