package controle;

import javax.swing.JOptionPane;

public class DesafiaDiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Domingo -> 1
		//Quarta  -> 4
		//Terça   -> 3
		//Quinta  -> 5

		String dia = JOptionPane.showInputDialog("Digite o dia da semana: ");
		
		if (dia.equals("domingo")) {			
			System.out.println("O número do dia da semana é 1");
		}else if (dia.toLowerCase().equals("segunda")) {
			System.out.println("O número do dia da semana é 2");
		}else if (dia.toLowerCase().equals("terça") || dia.equalsIgnoreCase("terca")) {
			System.out.println("O número do dia da semana é 3");
		}else if (dia.toLowerCase().equals("quarta")) {
			System.out.println("O número do dia da semana é 4");
		}else if (dia.toLowerCase().equals("quinta")) {
			System.out.println("O número do dia da semana é 5");
		}else if (dia.toLowerCase().equals("sexta")) {
			System.out.println("O número do dia da semana é 6");
		}else if (dia.toLowerCase().equals("sábado") || dia.toLowerCase().equals("sabado")) {
			System.out.println("O número do dia da semana é 7");
		}else {
			System.out.println("Dia inválido!");
		}







		
		
		
	}

}
