package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario("Ana"));
		
		System.out.println(resultado);
		

	}

}
