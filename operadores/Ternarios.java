package fundamentos.operadores;

public class Ternarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media = 4.9;
		String resultadoParcial = media >= 5.0 ? "em recupera��o." : " reprovado.";
		String resultado = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno est� " + resultado);
		
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoDesconto = temDesconto ? "Sim." : "N�o.";
		
		System.out.println("Tem desconto? " + resultadoDesconto);
		
		
	}

}
