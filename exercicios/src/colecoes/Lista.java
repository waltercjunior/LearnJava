package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Carlos"));
		
		
		System.out.println(lista.get(3));
		
		System.out.println(lista.contains(new Usuario("Lia")));
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		

	}

}
