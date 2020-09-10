package ejerciciosEstructurasDeControl;

import vista.Consola;

public class TrianguloRectangulo_49_50 {
	
	private int altura;
	private int base;
	private int aux;
	
	Consola con = new Consola();
	private int aux1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TrianguloRectangulo_49_50().triangulo();
		new TrianguloRectangulo_49_50().trianguloInvertido();

		
	}
	
	public void triangulo() {
		altura=Integer.parseInt(con.introCadena("Dibuja un triangulo rectangulo, solo, con la altura: "));
		base=altura;
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				if (j<=i) {
					System.out.print("*");
				}
//				System.out.print("*");
			}
			System.out.println();
//			System.out.println();
		}
	}
	
	public void trianguloInvertido() {
		altura=Integer.parseInt(con.introCadena("Dibuja un tiangulo rectangulo invertido, solo, con la altura: "));
		base=altura;
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				if (j>=i) {
					System.out.print("*");
				}
//				System.out.print("*");
			}
			System.out.println();
//			System.out.println();
		}
	}
	
}
