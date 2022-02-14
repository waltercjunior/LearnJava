package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double temperaturaF;
		double temperaturaC;
		
		temperaturaF = 86;
		
		temperaturaC = (temperaturaF - AJUSTE) * FATOR;
		
		System.out.println("A temperatura "+temperaturaF+" Farenheit é "+ temperaturaC +" em celsius");

		
	}
}
