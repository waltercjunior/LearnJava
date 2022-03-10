package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<>();
		
		//Adiciona elementos na fila
		fila.add("Ana");
		fila.offer("Bia");			//retorna falso se n�o conseguir inserir
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		// Obter elementos da fila sem remover
		System.out.println(fila.peek());		//retorna false se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element());		//lan�a uma exce��o se a fila tiver vazia
		System.out.println(fila.element());
		
		//fila.clear();
		//fila.size();
		//fila.isEmpty();
		
		
		// Obter o pr�ximo elemento da fila e remove;
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		//System.out.println(fila.remove());     //Se vazio lan�a uma exce��o

	}

}
