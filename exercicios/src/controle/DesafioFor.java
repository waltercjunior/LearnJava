package controle;

public class DesafioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valor = "#";
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";			
		}
		
		//vers�o do desafio
		//N�o pode usar valor num�rioc para controlar o la�o
		
		valor = "#";
		for(; !valor.equals("######"); ) {
			System.out.println(valor);
			valor += "#";			
		}

	}

}
