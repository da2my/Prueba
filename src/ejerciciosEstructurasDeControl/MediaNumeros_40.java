package ejerciciosEstructurasDeControl;

import java.text.DecimalFormat;

import vista.Consola;

public class MediaNumeros_40 {

	private int[] num = new int[10];
	private int n;
	private int sum = 0;
	private double media = 0;
	private boolean cond = false;
	Consola con = new Consola();
	DecimalFormat dFormat = new DecimalFormat("###.###");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MediaNumeros_40().media();
	}

	public void media() {
		System.out.println("Introduce 9 numeros, si el primero y el ultimo son iguales te doy la media" + "\n");
		for (int i = 1; i < num.length; i++) {
			n = Integer.parseInt(con.introCadena("Introduzca el " + i + "º numero: "));
			num[i] = n;
			sum += num[i];
//			System.out.println("Introducido el " + i + "º" + " Numero" + "\n");
			if (num[1] == num[i] && num[9] == num[i]) {
				media = (double) sum / (num.length - 1);
				cond = true;

			}

		}
		if (cond == true) {
			System.out.println("\n" + "La media de estos 9 numeros es: " + dFormat.format(media));
		}
	}

}
