package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno Pr�ncipe");  //retorna valor booleano
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for (String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.pop());
		//System.out.println(livros.remove());
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
		
		
	}

}
