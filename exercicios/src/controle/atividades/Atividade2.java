package controle.atividades;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ano = 2024;
		String descreveAno = ano % 4 == 0 ? "� bissexto" : "n�o � bissexto";
		
		System.out.printf("O ano de %d " + descreveAno , ano);

	}

}
