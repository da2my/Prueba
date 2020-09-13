package ejerciciosEstructurasDeControl;

import vista.Consola;

public class IntroNumCuentaPrimos_57 {

	private int num;

	Consola con = new Consola();

	private int cont;

	private int cont1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IntroNumCuentaPrimos_57().introNumCuentaPrimos();
	}

	public void introNumCuentaPrimos() {
		while (num != -1) {
			num = Integer.parseInt(con.introCadena("Introduce numeros hasta que pongas -1: "));
			if (num != 2 && num != 3 && num != 5 && num != 7) {
				if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num==1 || num==-1) {
//					System.out.println("no es primo");
				} else {
//					System.out.println("es primo");
					cont++;
				}
			} else {
//				System.out.println("es primo");
				cont1++;
			}
		}
		System.out.println(cont+cont1);
	}

}
