package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro sal�rio: ");
		String salario1 = entrada.nextLine();

		System.out.print("Digite o segundo sal�rio: ");
		String salario2 = entrada.nextLine();
		
		System.out.print("Digite o terceiro sal�rio: ");
		String salario3 = entrada.nextLine();
		
		Double mediaSalario = (Double.parseDouble(salario1.replace(',', '.')) + 
							   Double.parseDouble(salario2.replace(',', '.')) + 
							   Double.parseDouble(salario3.replace(',', '.'))) / 3;
		
		System.out.println("A m�dia de sal�rio �: " + mediaSalario);
		
		
		entrada.close();

	}

}
