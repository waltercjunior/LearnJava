package classes;

public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data data1 = new Data();
		data1.dia = 14;
		data1.mes = 01;
		data1.ano = 1977;	
		
		System.out.printf("%d/%d/%d\n", data1.dia, data1.mes, data1.ano);
		//data1.imprimirDataFormatada();
		
		
		Data data2 = new Data(12, 02, 1981);
		//data2.dia = 12;
		//data2.mes = 02;
		//data2.ano = 1981;

		Data data3 = new Data();
		
		System.out.printf(data2.obterDataFormatada()+"\n");
		
		System.out.println(data3.obterDataFormatada());

		
	}

}
