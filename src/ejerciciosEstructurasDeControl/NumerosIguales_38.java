package ejerciciosEstructurasDeControl;

import vista.Consola;

public class NumerosIguales_38 {

	private int num;
	private int aux;
	private int aux1;
//	private boolean cond; 

	Consola con = new Consola();

	public static void main(String[] args) {
		new NumerosIguales_38().introNumIguales();
	}

	public void introNumIguales() {
		while ((num != aux1) || (num == 0)) {
			num = Integer.parseInt(con.introCadena("Introduce numeros hasta que dos sean iguales y seguidos: "));
			if ((aux == num)) {
				aux1 = aux;
			} else {
				aux = num;
			}
		}
		System.out.println("Salio!!" + "\n" + "Se ha introducido dos numeros iguales");
	}
}
