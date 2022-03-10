package oo.heranca.desafio;

public class TesteCarro {
	public static void main(String[] args) {
		
		Honda honda = new Honda();
		Fusca fusca = new Fusca();
		
		honda.velocidadeAtual = 0;
		fusca.velocidadeAtual = 0;
				System.out.printf("Velocidade do Honda => %d velocidade do fusca => %d \n", honda.velocidadeAtual, fusca.velocidadeAtual);
		
		honda.acelerar();
		honda.acelerar();
		honda.acelerar();
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
				System.out.printf("Velocidade do Honda => %d velocidade do fusca => %d \n", honda.velocidadeAtual, fusca.velocidadeAtual);
		
		honda.frear();
		honda.frear();
		honda.frear();
		honda.frear();
		
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		System.out.printf("Velocidade do Honda => %d velocidade do fusca => %d \n", honda.velocidadeAtual, fusca.velocidadeAtual);
		
		
	}

}
