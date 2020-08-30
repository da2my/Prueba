package ejerciciosEstructurasDeControl;

import vista.Consola;

public class FactorialNum_43 {

	private int num;
	private int aux = 2;
	private int cont;
	private int result;
	private int reset;

	Consola con = new Consola();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FactorialNum_43().factorial();
	}

	public void factorial() {
		num = Integer.parseInt(con.introCadena("Numero Factorial: "));

		for (int i = 1; i <= num; i++) {
			for (int j = 2; j <= num; j++) {
				aux = i * j;
				i = aux;
			}
			System.out.println(i);
		}
	}
}
