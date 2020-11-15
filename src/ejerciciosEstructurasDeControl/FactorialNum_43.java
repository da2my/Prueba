package ejerciciosEstructurasDeControl;

import vista.Consola;

public class FactorialNum_43 {

	private int num;
	private int aux;

	Consola con = new Consola();

	public static void main(String[] args) {
		new FactorialNum_43().factorial();
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
}
