package vista;

import java.util.Scanner;

public class Consola {

	public void escribeLetrasX(String letras) {

		System.out.print(letras);

	}

	public void escribeLetrasY(String letras) {

		System.out.println(letras);

	}

	public void escribeNumX(double numero) {

		System.out.print(numero);

	}

	public String introCadena() {

		Scanner scan = new Scanner(System.in);
		escribeLetrasX("");
		String dato = scan.next();

		return dato;
	}

	public int introNumero() {

		Scanner sc = new Scanner(System.in);
		escribeLetrasX("");
		int num = sc.nextInt();

		// sc.close();// deshabilitar para los dados
		return num;

	}
	
	public static int pedirNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce numero:");
		return Integer.parseInt(scan.nextLine());
	}
	


}
