package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		Double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7.0) {
			System.out.println("O aluno passou por m�dia!");
			System.out.println("Parab�ns!");
		}
		if (media < 7 && media >= 4.5)
			System.out.println("Aluno em recupera��o.");
		
		if (media < 4.5 && media >= 0)
			System.out.println("Aluno reprovado.");
		
		
		entrada.close();

	}

}
