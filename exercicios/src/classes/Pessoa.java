package classes;

public class Pessoa {
	String nome;
	double peso;
	
	void comer(Comida comeu) {
		this.peso += comeu.peso;
		
	}
}
