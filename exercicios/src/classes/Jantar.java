package classes;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p = new Pessoa();
		p.nome = "João";
		p.peso = 100;
		double pesoAntes = p.peso;
		
		Comida c1 = new Comida("Feijão", 0.223);
		Comida c2 = new Comida("Arroz", 0.145);
		Comida c3 = new Comida("Carne", 0.589);
		
		p.comer(c1);
		p.comer(c2);
		p.comer(c3);
		
		System.out.printf("O peso de %s antes de comer era %.3f e depois de comer é: %.3f", p.nome, pesoAntes, p.peso);
		
	}

}
