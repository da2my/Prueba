package ejerciciosEstructurasDeControl;

import vista.Consola;

public class ParesAnteriores_33 {

	private int num;

	Consola con = new Consola();

	public static void main(String[] args) {
		new ParesAnteriores_33().arrastraPares();
	}

	public int arrastraPares() {
		num = Integer.parseInt(con.introCadena("Introduce numero: "));
		for (int i = 0; i < num; i += 2) {
			System.out.println(i);
		}
		return num;
	}
}
