package controle.atividades;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		/** 5. Refatorar o exerciÌ�cio 04, utilizando a estrutura switch. */

		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se Ã© primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " Ã© um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  nÃ£o Ã© um numero primo.");

		}

		scanner.close();

	}

}
