package fundamentos.operadores.desafios;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do Fahrenheit: ");
		Double vlwFhr = entrada.nextDouble();
		Double vlwCel = (vlwFhr - 32) / 1.8;
		
		System.out.printf("O valor %.2f Fahrenheit em Celsius é %.2f", vlwFhr, vlwCel);		
		
		entrada.close();		
	}

}