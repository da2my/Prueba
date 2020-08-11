package ejerciciosEstructurasDeControl;

import vista.Consola;

public class SalarioMasAlto_27 {
	
	private int[] empleados = new int[6];

	public SalarioMasAlto_27() {
	}

	public int[] rellenaLista() {
		System.out.println("\n" + "El numero de empleados que gana mas de 1000€ al es");
		for (int i = 1; i < empleados.length; i++) {
			System.out.println("\n" + "Introducir Salario del empleado:");
			empleados[i] = Consola.pedirNum();
		}
		return empleados;
	}

	public void numSalarios() {
		int iNumeroMayor = 1000;
		int contador = 0;
		empleados = rellenaLista();

		for (int i = 1; i < empleados.length; i++) {
			if (empleados[i] > iNumeroMayor) {
				contador++;
			}
		}
		System.out.println("\n" + contador);
	}
}
