package controle;

public class DesafioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valor = "#";
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";			
		}
		
		//versão do desafio
		//Não pode usar valor numérioc para controlar o laço
		
		valor = "#";
		for(; !valor.equals("######"); ) {
			System.out.println(valor);
			valor += "#";			
		}

	}

}
