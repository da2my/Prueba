package ejerciciosEstructurasDeControl;

import vista.Consola;

public class FactorialNum_43 {

	private int num;
	private int aux;

	Consola con = new Consola();

	public static void main(String[] args) {
//		new FactorialNum_43().factorial();
		System.out.println(FactorialNum_43.factorialWhile(4));
	}

	public void factorial() {
		num = Integer.parseInt(con.introCadena("Numero Factorial: "));
		int n = 1;
		for (int j = 1; j <= num; j++) {
			aux = n * j;
			n = aux;
			System.out.println(j + "! = " + n);
		}
	}
	
	public static int factorialWhile(int numero) {
		int resultado=1;
		while(numero>0) {
			resultado *= numero; 
			numero--;
		}
		return resultado;
	}
}
