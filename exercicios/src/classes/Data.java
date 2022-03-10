package classes;

public class Data {

	int dia = 0;
	int mes = 0;
	int ano = 0;
	
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;		
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	String obterDataFormatada (){
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d", dia, mes, ano);
	}
	
}
