package recursividad;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(Factorial.factorial(0));

	}

	public static int factorialWhile(int numero) {//Forma iterativa
		int resultado=1;
		while(numero>0) {
			resultado *= numero; 
			numero--;
		}
		return resultado;
	}
	
	public static int factorial(int numero) {//Forma recursiva
		int resultado = 0;
		if (numero == 0) {
			resultado = 1;
		} else {
			resultado = numero * factorial(numero - 1);//Se multiplica al numero con el factorial del numero inmediatamente anterior
		}
		return resultado;
	}
	
	
	
}
