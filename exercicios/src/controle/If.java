package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		Double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7.0) {
			System.out.println("O aluno passou por média!");
			System.out.println("Parabéns!");
		}
		if (media < 7 && media >= 4.5)
			System.out.println("Aluno em recuperação.");
		
		if (media < 4.5 && media >= 0)
			System.out.println("Aluno reprovado.");
		
		
		entrada.close();

	}

}
