package ejerciciosEstructurasDeControl;

import java.util.Scanner;

public class NumNegativo_23 {

	private int num;

	public NumNegativo_23() {

	}

	public static int pedirNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe numeros hasta que introduzcas un numero negativo, ademas te dire cuantos numeros has introducido:");
		return Integer.parseInt(scan.nextLine());
	}
	
public int checkNegativo() {
		int cont = 0;
		do {
			num = pedirNum();
			cont++;
		}while(!(num<0));
		System.out.println("Has introducido " + cont + " numeros");
		return num;
	}

}
