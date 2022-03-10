package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criar Produto
		Produto p1  = new Produto("Caneta", 1.00);
		Produto p2  = new Produto("Lápis", 0.96);
		Produto p3  = new Produto("Caderno", 21.35);
		Produto p4  = new Produto("Estojo", 16.80);
		Produto p5  = new Produto("Apontador", 1.22);
		Produto p6  = new Produto("Régua", 1.00);
		Produto p7  = new Produto("Cola", 2.15);
		Produto p8  = new Produto("Lápis de cor", 15.00);
		Produto p9  = new Produto("Esquadro", 1.80);
		Produto p10 = new Produto("Hidrocor", 12.00);
		
		//Criar Item
		Item i1  = new Item(5, p1);
		Item i2  = new Item(2, p2);
		Item i3  = new Item(8, p3);
		Item i4  = new Item(3, p4);
		Item i5  = new Item(1, p5);
		Item i6  = new Item(9, p6);
		Item i7  = new Item(10, p7);
		Item i8  = new Item(7, p8);
		Item i9  = new Item(4, p9);
		Item i10 = new Item(6, p10);
		Item i11 = new Item(18, p1);
		Item i12 = new Item(1, p2);
		Item i13 = new Item(15, p3);
		Item i14 = new Item(11, p4);
		Item i15 = new Item(9, p5);
		Item i16 = new Item(7, p6);
		Item i17 = new Item(6, p7);
		Item i18 = new Item(3, p8);
		Item i19 = new Item(25, p9);
		Item i20 = new Item(15, p10);
		
		
		//Criar Compra
		Compra c1 = new Compra();
		Compra c2 = new Compra();
		Compra c3 = new Compra();
		
		c1.itens.add(i1);
		c1.itens.add(i2);
		c1.itens.add(i3);
		c1.itens.add(i4);
		c1.itens.add(i5);
		c2.itens.add(i6);
		c2.itens.add(i7);
		c2.itens.add(i8);
		c2.itens.add(i9);
		c2.itens.add(i10);
		c3.itens.add(i11);
		c3.itens.add(i12);
		c3.itens.add(i13);
		c3.itens.add(i14);
		c3.itens.add(i15);
		c1.itens.add(i16);
		c2.itens.add(i17);
		c3.itens.add(i18);
		c1.itens.add(i19);
		c2.itens.add(i20);
				
		//Criar cliente
		Cliente cliente1 = new Cliente("João", c1);
		
		Cliente cliente2 = new Cliente("Pedro", c2);
		
		Cliente cliente3 = new Cliente("José", c3);

		
		System.out.printf("O valor total da compra de %s foi de  R$ %.2f \n", cliente1.nome, cliente1.obterValorTotal());
		System.out.printf("O valor total da compra de %s foi de  R$ %.2f \n", cliente2.nome, cliente2.obterValorTotal());
		System.out.printf("O valor total da compra de %s foi de  R$ %.2f \n", cliente3.nome, cliente3.obterValorTotal());
		
	}

}
