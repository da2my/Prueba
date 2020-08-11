package ejerciciosEstructurasDeControl;

import java.util.Scanner;

public class InicioNumAlCuadrado_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1;
		
		System.out.println("Escriba numero:");
		Scanner scan = new Scanner(System.in);
		num1 = Double.parseDouble(scan.nextLine());
		
		NumAlCuadrado_20 num = new NumAlCuadrado_20();
		System.out.println("El cuadrado de " + num1 + " es: " + num.alCuadrado(num1));
		
	}

}
