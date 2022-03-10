package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Perguntar quantas notas ser�o e criar o array
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas ser�o digitadas?");
		int quantidadeNotas = entrada.nextInt();
		double[] notas = new double[quantidadeNotas];
		
		//Perguntar as notas
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota: " + (i+1));
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println("Fim de leitura de notas!");
		
		double mediaNotas = 0;
		//Somar as notas e apresentar a m�dia
		for(double nota: notas) {
			mediaNotas += nota;
		}
		
		System.out.printf("\nA m�dia final do aluno foi: %.2f", mediaNotas / quantidadeNotas);
		
		entrada.close();
	}

}
