package ejerciciosEstructurasDeControl;

import vista.Consola;

public class MayorDe5numeros_35 {

	private int[] coleccion = new int[100];
	private int num = 5;
	private int temp = 0;
	Consola con = new Consola();

	public static void main(String[] args) {
		new MayorDe5numeros_35().numeroMayor();
	}

	public void numeroMayor() {
		System.out.println("Programa que te dice el numero mayor!");
		for (int i = 0; i < num; i++) {
			coleccion[i] = Integer.parseInt(con.introCadena("Introduce numeros"));
			if (temp < coleccion[i]) {
				temp = coleccion[i];
			}
		}
		System.out.println("\n" + "El numero mayor es: " + temp);
	}

}
