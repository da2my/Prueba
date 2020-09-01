package ejerciciosEstructurasDeControl;

import java.util.ArrayList;

public class SumaSueldo_45 {

	private int[] sueldo = new int[10];

	ArrayList<Integer> sueldos = new ArrayList();
//	private int sueldo;
	private int cont;
	private int aux;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SumaSueldo_45().sumaSueldos();
	}

	public void sumaSueldos() {
//		for (int i : sueldo) {
//			sueldo[i] = (int) (Math.random() * (5000 - 950 + 1) + 950);
//
//			System.out.println(sueldo[i]);
//		}

		for (int i = 0; i < sueldo.length; i++) {
			
			sueldo[i] = (int) (Math.random()*(2000-450+1)+550);
			if (sueldo[i] > 1000) {
				cont++;
			}
			aux+=sueldo[i];
			System.out.println(sueldo[i]);
		}
		System.out.println("\n"+"La suma total de los sueldos es: "+aux);
		System.out.println("\n"+"Hay "+cont+" sueldos "+" mayores de a 1000€");

//		for (int i = 1; i <= 10; i++) {
//		    sueldo = (int) (Math.random() * 10000 + 950);
//		    if (sueldos.contains(sueldo)) {
//		        i--;
//		    } else {
//		        sueldos.add(sueldo);
//		    }
//		    System.out.println(sueldo);
//		}

	}

}
