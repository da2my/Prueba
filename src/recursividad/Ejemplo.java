package recursividad;

public class Ejemplo {

	public static void main(String[] args) {
//	Programa que incrementa si a es par!!
		int a = 7;
		a=incrementar(a);
		
		System.out.println(a);
	}

	public static boolean par(int numero) {
		return numero % 2 == 0;
	}

	private static int incrementar(int numero) {
		if (par(numero)) {//si retorna false no entra al if y no incrementa
			numero = numero + 1;
		}
		return numero;
	}
}
