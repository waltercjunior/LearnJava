package controle.atividades;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		// Criar um programa que enquanto estiver recebendo n�meros positivos, imprime no console a 
		// soma dos n�meros inseridos, caso receba um n�mero negativo, encerre o programa. 
		// Tente utilizar a estrutura do while.
		
		Scanner entrada = new Scanner(System.in);
		
		double valor = 0.0;
		double somaValor = 0.0;
		
		while (valor >= 0) {
			System.out.println("Digite o valor: ");
			valor = entrada.nextDouble();
			if (valor > 0) {
				somaValor += valor;
			}
			System.out.println("O valor acumulado �: "+ somaValor);
		}
		
		System.out.println("Fim!");
		
		
		entrada.close();

	}

}
