package ejerciciosEstructurasDeControl;

import vista.Consola;

public class EsPrimo_39 {

	private int num;

	Consola con = new Consola();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EsPrimo_39().esPrimo();

	}

	public void esPrimo() {
		do {
			num = Integer.parseInt(con.introCadena("Introduce numero y te dire si es Primo o no: "));

			if (num != 2 && num != 3 && num != 5 && num != 7) {

				if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
					System.out.println("no es primo");

				} else {
					System.out.println("es primo");
				}
			} else {
				System.out.println("es primo");
			}

		} while (!(num <= 0));
		System.out.println("sale del bucle");

	}

}
