package controle;

import javax.swing.JOptionPane;

public class SwitchComBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String conceito = "";
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digita a nota"));
		
		switch (nota) {
		case 10: case 9:			
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "não encontrado!";
		}
		
		System.out.println("Conceito é :" + conceito);

	}

}
