package controle.atividades;

import java.util.Random;
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		/*
		 * Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
		 * Armazene um numero aleatório em uma variável. 
		 * O Jogador tem 10 tentativas para adivinhar o número gerado. 
		 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
		 * e imprima se o número inserido é maior ou menor do que o número armazenado.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		Random random = new Random();
		boolean acertou = false;
		int palpite = 0;
		int tentativas = 0;
		int valorSorteado = random.nextInt(10);
		
		while (!acertou) {
			System.out.println("Digite o seu palpite: ");
			palpite = entrada.nextInt();
			if (palpite == valorSorteado) {
				System.out.println("Parabéns você acertou!");
				acertou = true;
			}
			if (palpite > valorSorteado) {
				System.out.println("A palpite é MAIOR que o valor sorteado");
			}else if (palpite < valorSorteado) {
				System.out.println("A palpite é MENOR que o valor sorteado");
			}
			
			tentativas++;			
		}
		
		System.out.printf("\nVocê tentou %d vezes", tentativas);
		
		
		
		
		System.out.println(valorSorteado);
		
		
		entrada.close();

	}

}
