package ejerciciosEstructurasDeControl;

import vista.Consola;

public class RangoNumeros_37 {

	private int[] num = new int[11];
	private int contNValidos = 0;
	private int numMayor = 0;
	private int aux = 0;
	Consola con = new Consola();

	public static void main(String[] args) {
		new RangoNumeros_37().rango();

	}

	public void rango() {

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(con.introCadena("Introduce 11 numeros entre 20 - 40"));
			aux = num[i];// aux es necesario para hacer que cuente el numero mayor de los validos
			if (!(num[i] >= 20 && num[i] <= 40)) {
				i--;// cuando el numero introducido no es valido, se resta una posicion, de "i" del
					// contador del for. Y por lo tanto tambien se machaca el elemento del array
				contNValidos++;
				System.out.println("numero no permitido");
			} else {
				if (numMayor < aux) {
					numMayor = aux;
				}
			}
		}
		System.out.println("\n" + "Has introducido " + contNValidos + " numeros no validos.");
		System.out.println("\n" + "El mayor de los numeros validos es el: " + numMayor);
	}

}
