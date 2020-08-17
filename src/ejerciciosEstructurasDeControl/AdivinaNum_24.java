package ejerciciosEstructurasDeControl;

import java.util.Scanner;

//ESTE EJERCICIO ME COSTO MUCHO HACERLO, REVISAR!!
public class AdivinaNum_24 {

	private int num;
	private int adivina=105;

	public AdivinaNum_24() {
		
	}
	
	public static int pedirNum() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Adivina numero, introduce: ");
		return Integer.parseInt(scan.nextLine());
	}
	
	public int revelaNum() {
	
		do {
			num=pedirNum();
//			int aprox = num - adivina;
//			int temp = aprox - adivina;
			
			
			if (num < adivina) {
				System.out.println("Mayor");
			}else  if(num > adivina) {
				System.out.println("Menor");
			}
			
		} while (!(num==adivina));
		
		return num;
	}
	
}
