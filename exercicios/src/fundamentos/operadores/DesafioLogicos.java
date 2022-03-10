package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Trabalho na terça (V ou F)
		 *Trabalho na quinta (V ou F)
		 *
		 *Se os dois OK tv de 50
		 *Se um dos dois OK tv de 32
		 *Se shopping todos tomam sorvete
		 *Se não trabalho nada acontece
		 * 
		 */
		
		//Condição dos dois trabalhos OK
		boolean trabalhoA = false;
		boolean trabalhoB = false;
		boolean comprouTV50 = (trabalhoA && trabalhoB);
		boolean comprouTV32 = (trabalhoA  ^ trabalhoB);
		boolean tomouSorvete = (trabalhoA || trabalhoB);
		
		System.out.println("A família comprou a tv de 50 polegas? "+ comprouTV50);
		System.out.println("A família comprou a tv de 32 polegas? "+ comprouTV32);
		System.out.println("E a família tomará sorvete? " + tomouSorvete);
		System.out.println("Mais saudável? " + !tomouSorvete);

	}

}
