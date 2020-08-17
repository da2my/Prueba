package ejerciciosEstructurasDeControl;

import vista.Consola;

public class ArrastraNumeros_32 {

	 private int num;
		 
	public int arrastraNum() {
		Consola con = new Consola();
		num=Integer.parseInt(con.introCadena("Introduce numero a arrastrar: "));
		for (int i = 0; i < num; i++) {
			System.out.print(i+" ");
		}
		
		return num;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ArrastraNumeros_32().arrastraNum();
	}

}
