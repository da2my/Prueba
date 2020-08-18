package vista;

import java.util.Scanner;

public class Consola {

	public void escribeX(String letras) {
		System.out.print(letras);
	}

	public void escribeY(String letras) {
		System.out.println(letras);
	}

	public void escribeNum(int num) {
		System.out.println(num);
	}
	
	public void escribeNumX(double numero) {
		System.out.print(numero);
	}

	public String introCadena() {

		Scanner scan = new Scanner(System.in);
		escribeX("");
		String dato = scan.next();
		//scan.close();
		return dato;
	}

	public int introNumero() {

		Scanner sc = new Scanner(System.in);
		escribeX("");
		int num = sc.nextInt();
		//sc.close();// deshabilitar para los dados
		return num;

	}

	public static int pedirNum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("");
		//scan.close();
		return scan.nextInt();
	}

	public String introCadena(String cadena) {
		String letras;
		Scanner sc = new Scanner(System.in);
		escribeY(cadena);
		letras = sc.nextLine();
		//sc.close();
		return letras;

	}

}
