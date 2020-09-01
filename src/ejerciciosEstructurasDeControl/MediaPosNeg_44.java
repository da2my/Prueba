package ejerciciosEstructurasDeControl;

import java.text.DecimalFormat;

//import java.util.*;

public class MediaPosNeg_44 {

	private int[] num = new int[10];
	private int auxP;
	private int auxN;
	private int contP;
	private int contN;
	private int contC;
	private float mediaP;
	private float mediaN;

	DecimalFormat dFormat = new DecimalFormat("###.##");

	public static void main(String[] args) {
		new MediaPosNeg_44().mediaNum();
	}

	public void mediaNum() {
		for (int i : num) {
			num[i] = (int) (Math.random() * 100 * (Math.random() > 0.1 ? 1 : -1));// esta sentencia muestra como hacer
																					// con un operador ternario que
																					// cuente de -100 hasta 100
			if (num[i] > 0) {
				contP++;
				auxP += num[i];
				mediaP = (float) auxP / contP;
			} else if (num[i] < 0) {
				contN++;
				auxN += num[i];
				mediaN = (float) auxN / contN;
			} else {
				contC++;
			}
			System.out.println(num[i]);
		}
		System.out.println("\n" + "Esta es la media de los numeros Positivos: " + dFormat.format(mediaP));
		System.out.println("\n" + "Esta es la media de los numeros Negativos: " + dFormat.format(mediaN));
		System.out.println("\n" + "La cantidad de ceros es: " + contC);

	}
}
