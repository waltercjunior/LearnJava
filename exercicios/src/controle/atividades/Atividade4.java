package controle.atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// Criar um programa que receba um número e diga se ele é um número primo.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		Integer valor = entrada.nextInt();
		int contador = 0;
		
		for(int i = 1; i <= valor; i++) {
			if(valor % i ==0) {
				contador++;
			}
		}
		
		if(contador == 2) {
			System.out.printf("\nO número %d é um número primo", valor);
		}else {
			System.out.printf("\nO número %d NÃO é um número primo", valor);
		}
		
		
		entrada.close();
		
	}

}
