package ejerciciosEstructurasDeControl;

import java.util.Scanner;

//ASEGURATE DE QUE PONES BIEN EL OPERADOR +=
public class CalcMedia_26 {

	private float num;

	public CalcMedia_26() {

	}

	public static int pedirNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce nuemeros hasta meter un negativo, sacara la media te todos ellos");
		return Integer.parseInt(scan.nextLine());
	}

	public float media() {
		float media = 0;
		float temp = 0;
		int contador = 0;

		while (!(num < 0)) {

			num = pedirNum();
			contador++;
			if (num > 0) {
				temp += num;
				media = temp / contador;

			}

		}

		System.out.println(media);

		return num;
	}
}
