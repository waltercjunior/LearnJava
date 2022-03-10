package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);			//converte autom�ticamente para Double
		conjunto.add(true);			//converte autom�ticamente para Boolean
		conjunto.add("Teste");
		conjunto.add(1);			//converte autom�ticamente para Integer
		conjunto.add('X');			//converte autom�ticamente para Character
		
		System.out.println("O tamanho �: " + conjunto.size());
		
		
		conjunto.add("Teste");
		
		System.out.println("O tamanho �: " + conjunto.size());
		
		conjunto.remove("Teste");
		
		System.out.println("O tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.contains('X'));

		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		conjunto.addAll(nums);				//Uni�o entre 2 conjuntos
		
		System.out.println(conjunto);
				
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}

}
