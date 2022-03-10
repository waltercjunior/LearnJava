package controle.atividades;

import javax.swing.JOptionPane;

public class Atividade1 {

	public static void main(String[] args) {
		// 
		Integer entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado: "));
		
		if(entrada >= 0 || entrada <= 10) {
			System.out.println("O valor é válido");
			if (entrada % 2 == 0) {
				System.out.println("O valor informado é par.");
			}else {
				System.out.println("O valor informado é impar.");
			}
		}else {
			System.out.println("O valor é inválido");
		}
		

	}

}
