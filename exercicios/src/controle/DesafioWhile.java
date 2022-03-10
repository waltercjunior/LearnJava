package controle;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calcular a média das notas de uma turma
		//digitar uma nota válida entra 0 e 10
		//para sair deve ser digitado -1
		
		double notas = 0;
		int contador = 0;
		
		String entrada = "";
		
		while (!entrada.equalsIgnoreCase("-1")) {
			entrada = JOptionPane.showInputDialog("Digite um a nota:");
			
			if (Integer.parseInt(entrada)> 10 || Integer.parseInt(entrada) < 0) {
				System.out.println("Digite uma nota válida!");
			}else {
				System.out.println("Nota: " + entrada);
				contador++;
				notas += Double.parseDouble(entrada);
			}
		}
		
		System.out.println("A média de notas da classe é: " + (notas / contador));
		
		

	}

}
