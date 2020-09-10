package ejerciciosEstructurasDeControl;

import vista.Consola;

public class Medias_52 {

	private double area;
	private double altura;
	private double base;
	private double lado;

	private char letra;

	Consola con = new Consola();
	private String aux;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Medias_52().menu();
	}

	public void menu() {
			con.escribeY("Elige una opción: \nc: Cuadrado \nr: Rectangulo");
			aux = con.introCadena("");
			letra = aux.charAt(letra);
			switch (letra) {
			case 'r':
				areaRectangulo();
				break;
			case 'c':
				areaCuadrado();
				break;
			default:
				System.out.println("Error elija alguna opcion valida");
				break;
			}
	}

	public void areaRectangulo() {
		base = Double.parseDouble(con.introCadena("Escriba base del rectangulo: "));
		altura = Double.parseDouble(con.introCadena("Escriba altura del rectangulo: "));
		area = base * altura;
		for (int i = 0; i < altura; i++) {
			for (int j = 1; j < base; j++) {
				System.out.print("* ");
			}
			System.out.println("*");
		}
		System.out.println("El area del rectangulo es: " + area);
	}

	public void areaCuadrado() {
		lado = Double.parseDouble(con.introCadena("Escriba lado del cuadrado: "));
		area = Math.pow(lado, 2);
		for (int i = 0; i < lado; i++) {
			for (int j = 1; j < lado; j++) {
				System.out.print("* ");
			}
			System.out.println("*");
		}
		System.out.println("El area del cuadrado es: " + area);
	}

}
