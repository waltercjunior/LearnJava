package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor 1.");
		String valDigi = entrada.nextLine();
		Double num1 =  Double.parseDouble(valDigi);
		
		System.out.println("Digite o valor 2.");
		valDigi = entrada.nextLine();
		Double num2 =  Double.parseDouble(valDigi);
		
		System.out.println("Qual a operação a ser realizada (+ - / * %)?");
		valDigi = entrada.nextLine();
		
		boolean soma = valDigi.equals("+");
		boolean subt = valDigi.equals("-");
		boolean divi = valDigi.equals("/");
		boolean mult = valDigi.equals("*");
		boolean mode = valDigi.equals("%");
		
		Double resultado = soma ? (num1 + num2) : 
			               subt ? (num1 - num2) :
			               divi ? (num1 / num2) :
			       		   mult ? (num1 * num2) : (num1 % num2);
			            		   		
		System.out.println("O resultado da operação " + num1 + " " + valDigi + " " + num2 + " é " + resultado);
		
		entrada.close();
	}

}
