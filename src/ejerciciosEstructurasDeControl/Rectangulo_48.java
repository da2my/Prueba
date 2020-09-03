package ejerciciosEstructurasDeControl;

import vista.Consola;

public class Rectangulo_48 {
	
	private int base;
	private int altura;

	Consola con = new Consola();
	
	public static void main(String[] args) {

		new Rectangulo_48().rectangulo();
	}
	
	public void rectangulo() {
		base=Integer.parseInt(con.introCadena("Introduzca la base del rectangulo: "));
		altura=Integer.parseInt(con.introCadena("Introduzca la altura del rectangulo: "));
		
		for (int i = 0; i < altura; i++) {
			System.out.println();
			for (int j = 1; j < base; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
