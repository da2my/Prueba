package ejerciciosEstructurasDeControl;

import java.util.Scanner;

import vista.Consola;

public class NumEnteroPositivo_17 {
	
	private int num;
	
	Consola con = new Consola();
	
	public NumEnteroPositivo_17(){
		
	}
	
	public int leeNumPositivo(int num) {
		
		
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("escribir numero positivon mayor a 2:");
			num = scan.nextInt();
			
			if (num>2) {
				System.out.println("El numero " + num + " es correcto");

			} else {
				System.out.println("El numero " + num + " es incorrecto");
				System.out.println("\n");
			}
		} while (num<2);
		
		
		
		
		return num;  
	}

}
