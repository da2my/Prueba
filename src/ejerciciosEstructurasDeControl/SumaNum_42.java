package ejerciciosEstructurasDeControl;

import vista.Consola;

public class SumaNum_42 {

	private int num;
	private int cont = 1;
	private int aux;

	Consola con = new Consola();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SumaNum_42().sumaNum();
	}

	public void sumaNum() {
		System.out.println("Introduce 8 numeros y te dare la suma total de ellos" + "\n");

		while (cont <= 8) {
			num = Integer.parseInt(con.introCadena((cont++) + "º" + " numero:"));
			aux += num;
		}
		System.out.println("\n" + "La suma total es: " + aux);
	}

}
