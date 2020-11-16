package recursividad;

public class Admin {

	public static void main(String[] args) {
		System.out.println(Admin.factorial(4));
	}
	
	public static int factorial(int n) {
		int resultado = 0;
		if (n == 0) {
			resultado = 1;
		} else {
			resultado = n * factorial(n - 1);
		}
		return resultado;
	}

}
