package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = JOptionPane.showInputDialog("Informe o n�mero:");
		
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0 ) {
			System.out.println("O n�mero digitado � par");
		}
		else {
			System.out.println("O n�mero digitado � impar.");
		}

	}

}
