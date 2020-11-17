package recursividad;

public class SumaRecursiva {

	public static void main(String[] args) {
		System.out.println(SumaRecursiva.sumaRecursiva(3));
//		System.out.println(SumaRecursiva.suma(3));
	}

	public static int sumaRecursiva(int numero) {
		int resultado = 0;
		if (numero != 0) {
			resultado=numero+sumaRecursiva(numero-1);
		}
		return resultado;
	}

	public static int suma(int numero) {// iterativa
		int resultado = 0;
		int aux = 0;
		while (numero != 0) {//Caso base del recursivo, que no es mas que una condicion para que el metodo deje de llamarse a si mismo
			numero--;
			aux++;
			resultado += aux;
		}
		return resultado;
	}
}
