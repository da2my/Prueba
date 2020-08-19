package ejerciciosEstructurasDeControl;

import vista.Consola;

public class RangoNumeros_37 {

	
	private int[] num = new int [11];
	private int contNValidos=0;
	Consola con = new Consola();
	
	public static void main(String[] args) {
		new RangoNumeros_37().rango();
		
	}
	
	public void rango() {
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(con.introCadena("Introduce 11 numeros entre 20 - 40"));				
			if (!(num[i]>=20 && num[i]<=40)) {
				
				contNValidos=i--;
				System.out.println("numero no permitido");
			}
		}
		System.out.println(contNValidos);
		
	}

}
