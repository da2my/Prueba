package ejerciciosEstructurasDeControl;

import vista.Consola;

public class LeeNumeros_54 {
	
	private int num;
	private int suma;
	private int cont;
	
	Consola con = new Consola();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LeeNumeros_54().leeNumSumaCien();
	}
	
	public void leeNumSumaCien() {
		while (suma<=100) {
		num=Integer.parseInt(con.introCadena("Introduce numeros hasta que su suma no llegue a 100: "));	
		suma+=num;
		cont++;
		}
		System.out.println(cont);
	}

}
