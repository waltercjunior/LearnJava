package controle.atividades;

import javax.swing.JOptionPane;

public class Atividade1 {

	public static void main(String[] args) {
		// 
		Integer entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado: "));
		
		if(entrada >= 0 || entrada <= 10) {
			System.out.println("O valor � v�lido");
			if (entrada % 2 == 0) {
				System.out.println("O valor informado � par.");
			}else {
				System.out.println("O valor informado � impar.");
			}
		}else {
			System.out.println("O valor � inv�lido");
		}
		

	}

}
