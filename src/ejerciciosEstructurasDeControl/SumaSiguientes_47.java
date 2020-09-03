package ejerciciosEstructurasDeControl;

import java.util.Scanner;

public class SumaSiguientes_47 {

	private int[] num = new int[100];
	private int numero;
	private int aux;
	private int cont;

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		new SumaSiguientes_47().sumaNum();
	}

	public void sumaNum() {
		System.out.println("Introduzca numero: ");
		numero = (int) scan.nextInt();

		for (int i = 1; i <= num.length; i++) {
			aux += numero++;
		}
		System.out.println(aux);
	}

}
