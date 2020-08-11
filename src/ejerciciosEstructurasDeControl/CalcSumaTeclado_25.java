package ejerciciosEstructurasDeControl;

import java.util.Scanner;

//ESTE EJERCICIO ME COSTO MUCHO HACERLO, REVISAR!!
public class CalcSumaTeclado_25 {

	private int num;
	private int temp;
	private int resultado;

	public CalcSumaTeclado_25() {

	}

	public static int pedirNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce numeros hasta que metas un 0, ademas suma todos los numeros que ha metido:");
		return Integer.parseInt(scan.nextLine());
	}

	public int calSuma() {

		do {
			num = pedirNum();
			temp += num;//ESTO FUNCIONA PORQUE ESTOY AISLANDO LA VARIABLE TEMP DE LA
						// CONDICION WHILE
//			resultado=num+num; //intentaba hacer esto sin exito, era muy logico que no funcionase
			
			

		} while (!(num == 0));

		System.out.println(temp);

		return num;
	}

}
