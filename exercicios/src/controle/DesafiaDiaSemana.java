package controle;

import javax.swing.JOptionPane;

public class DesafiaDiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Domingo -> 1
		//Quarta  -> 4
		//Ter�a   -> 3
		//Quinta  -> 5

		String dia = JOptionPane.showInputDialog("Digite o dia da semana: ");
		
		if (dia.equals("domingo")) {			
			System.out.println("O n�mero do dia da semana � 1");
		}else if (dia.toLowerCase().equals("segunda")) {
			System.out.println("O n�mero do dia da semana � 2");
		}else if (dia.toLowerCase().equals("ter�a") || dia.equalsIgnoreCase("terca")) {
			System.out.println("O n�mero do dia da semana � 3");
		}else if (dia.toLowerCase().equals("quarta")) {
			System.out.println("O n�mero do dia da semana � 4");
		}else if (dia.toLowerCase().equals("quinta")) {
			System.out.println("O n�mero do dia da semana � 5");
		}else if (dia.toLowerCase().equals("sexta")) {
			System.out.println("O n�mero do dia da semana � 6");
		}else if (dia.toLowerCase().equals("s�bado") || dia.toLowerCase().equals("sabado")) {
			System.out.println("O n�mero do dia da semana � 7");
		}else {
			System.out.println("Dia inv�lido!");
		}







		
		
		
	}

}
