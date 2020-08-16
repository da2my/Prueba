package ejerciciosEstructurasDeControl;

public class CuentaParImpar_30 {

//	private int [] numeros = new int [100];
	private int num = 100;
	private int contPar = 0;
	private int contImpar = 0;
	private int contNulos = 0;

	public void recorreNum() {
		System.out.printf("\n%10s%10s\n\n", "Indice", "Valor");// los valores "\n%10s%10s\n\n" [%s hace referencia a
																// tantos espacios como numeros pongas, en este caso 10]
		for (int i = 0; i < num; i++) {
			int numero = (int) Math.floor(Math.random() * 100);
			if ((numero % 2 == 0) && (numero != 0)) {
				contPar++;
//				System.out.println("Pares: "+numero);
				System.out.printf("%10s%10s\n", "Pares", numero);
			} else if (!(numero % 2 == 0)) {
				contImpar++;
//				System.out.println("Impares: "+numero);
				System.out.printf("%10s%10s\n", "Impar", numero);
			} else {
				contNulos++;
//				System.out.println("Nulos: "+numero);
				System.out.printf("%10s%10s\n", "Nulo", numero);
			}
		}
		System.out.println("\n");
		System.out.println("El total de Pares de 100 es: " + contPar);
		System.out.println("El total de Impares de 100 es: " + contImpar);
		System.out.println("El total de Nulos de 100 es: " + contNulos);
	}
}
