package controle.atividades;

import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1."));
		
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1."));
		
		String notaFinal = "" + (nota1 + nota2) / 2;
				
		switch (notaFinal) {
			case "10": case "9":  case "8": case "7": {
				System.out.println("Aprovado");
				break;
			}
			case "6": case "5":  case "4": {
				System.out.println("Recuperacao");
				break;
			}
			case "3": case "2":  case "1": case "0":{
				System.out.println("Reprovado");
				break;
			}
		}
		

	}

}
