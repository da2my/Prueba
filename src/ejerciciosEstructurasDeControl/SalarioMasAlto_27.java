package ejerciciosEstructurasDeControl;

import vista.Consola;

public class SalarioMasAlto_27 {

	private int[] empleados = new int[5];

	public SalarioMasAlto_27() {

	}

	public void pedirSalario() {

		for (int i = 0; i < empleados.length; i++) {
			empleados[i] = Consola.pedirNum();
		}
	}
	
	

}
