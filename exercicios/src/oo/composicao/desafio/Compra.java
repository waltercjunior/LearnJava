package oo.composicao.desafio;

import java.util.ArrayList;


public class Compra {
	final ArrayList<Item> itens = new  ArrayList<Item>();
	
	void adicionarItem(int quantidade, Produto p) {
		this.itens.add(new Item(quantidade, p));
	}
	
	final double obterValorTotalCompra() {
		double total = 0;
		
		for(Item item: this.itens) {
			total += item.qtde * item.p.preco;
		}
		
		return total;
	}

}
