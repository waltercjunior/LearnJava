package controle.atividades;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		// Criar um programa que receba uma palavra e imprime no console letra por letra.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a palavra");
		String palavra = entrada.nextLine();
		
		int tamanhoPalavra = palavra.length();
		
		for(int i = 0; tamanhoPalavra > i; i++) {
			System.out.println(palavra.charAt(i));
		}
		
		System.out.println("Fim!");
		
		entrada.close();
	}

}
