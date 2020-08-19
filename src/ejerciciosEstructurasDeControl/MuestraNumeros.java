package ejerciciosEstructurasDeControl;

import vista.Consola;

public class MuestraNumeros {

	private int num1;
	private int num2;
	private int num;

	Consola con = new Consola();

	public static void main(String[] args) {
		new MuestraNumeros().muestraNum();
	}

	public void muestraNum() {
		num = Integer.parseInt(con.introCadena("Escribe primer numero"));
		num2 = Integer.parseInt(con.introCadena("Escribe segundo numero"));
		
		if (num>num2) {
			for (num1 = num; (num1 >= num2); num1--) {
				System.out.println(num1);
			}
		} else {
			for (num1 = num; (num1 <= num2); num1++) {
				System.out.println(num1);
			}
		}
	}

}
