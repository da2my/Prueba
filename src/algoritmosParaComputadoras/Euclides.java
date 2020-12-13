package algoritmosParaComputadoras;

public class Euclides {

	public static void main(String[] args) {

		euclides(66, 44);// tiene que ser mayor el parametro m por cuestiones de array

	}

	public static void euclides(int m, int n) {// tiene que ser mayor el parametro m por cuestiones de array
		int[] divisores1 = new int[m];
		int[] divisores2 = new int[n];
		int[] divisoresR = new int[divisores1.length + divisores2.length];

		for (int i = 1; i < divisores1.length; i++) {
			if (m % i == 0) {
				divisores1[i] = i;
			}
//            System.out.println(divisores1[i]);
		}
		for (int i = 1; i < divisores2.length; i++) {

			if (n % i == 0) {
				divisores2[i] = i;
			}
//            System.out.println(divisores2[i]);
		}
		int mcd = 0;
		System.arraycopy(divisores1, 0, divisoresR, 0, divisores1.length);
		System.arraycopy(divisores2, 0, divisoresR, divisores1.length, divisores2.length);

		for (int j = 0; j < divisores2.length; j++) {
			if (divisores1[j] == divisores2[j] && divisores1[j] != 0) {
				mcd = divisoresR[j];
			}
		}
		System.out.println("El mcd de " + m + " y " + n + " es: " + mcd);
	}

}
