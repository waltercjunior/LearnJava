package classes;

public class AreaCirc {

	double raio;
	static final double PI = 3.1415;;
	
	AreaCirc(double raioinicial) {
		raio = raioinicial;
	}
	
	double area () {
		return PI * Math.pow(raio, 2);
	}
}
