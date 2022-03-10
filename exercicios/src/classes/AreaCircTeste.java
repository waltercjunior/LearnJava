package classes;

public class AreaCircTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCirc a = new AreaCirc(10);
		//a.pi = 10;		

		
		AreaCirc b = new AreaCirc(5);
		//b.pi = 5;		
		
		//AreaCirc.pi = 3.1415;
		
		System.out.println(a.PI);
		System.out.println(Math.PI);
		
		System.out.println(a.area());
		System.out.println(b.area());

	}

}
