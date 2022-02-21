package controle;

import javax.swing.JOptionPane;

public class WhileIndeterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String entrada = new String();
	
		while(!entrada.equalsIgnoreCase("SAIR")) {
			entrada = JOptionPane.showInputDialog("Digite a chave");
		}

	}

}
