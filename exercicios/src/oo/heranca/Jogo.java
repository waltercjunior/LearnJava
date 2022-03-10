package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heroi monstro = new Heroi();
		
		monstro.x = 10;
		monstro.y = 10;
		
		
		Monstro heroi = new Monstro();
		heroi.x = 10;
		heroi.y = 11;
		
		
		System.out.println("Monstro tem =>" + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem =>" + heroi.vida);
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem =>" + heroi.vida);
		
		
		
		
		
		/*		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
				
		System.out.println(j1.y);
		System.out.println(j1.x);
		*/
	}

}
