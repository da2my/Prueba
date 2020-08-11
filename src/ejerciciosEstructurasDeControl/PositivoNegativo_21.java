package ejerciciosEstructurasDeControl;

import java.util.Scanner;

public class PositivoNegativo_21 {
	
	private int num;
	
	public PositivoNegativo_21() {
		
	}
	
	
	public static int pedirNum() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Escribe numero y te dire si es positivo o negativo / par o impar hasta que pulses 0:");
		
		return Integer.parseInt(scan.nextLine()); 
	}
	
	
	
	public void checkNum() {
		
		do {
			num = pedirNum();
			
		if ( num > 0 ) {
			System.out.println("numero positivo");
			System.out.println("\n");
		}else if(num < 0) {
			System.out.println("numero negativo");
			System.out.println("\n");
		}
		
		
		}while(!(num==0));
		
		
		
	}
	

	

}
