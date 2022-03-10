package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente (String nome, Compra compra){
		this.nome = nome;
		this.compras.add(compra);
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	final double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotalCompra();
		}
		
		return total;
	}

}
