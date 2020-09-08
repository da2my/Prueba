package ejerciciosEstructurasDeControl;

public class ListadoAlumnos_28 {

	private static int edad;
	private static double altura;
	private static int contador=0;
	private int sumaEdades=0;
	
	public ListadoAlumnos_28() {
		
	}

	public ListadoAlumnos_28(int edad, double altura) {
		this.edad=edad;
		this.altura=altura;
		contador++;
		
	}
	
	public static int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public static int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	@Override
	public String toString() {
		return "ListadoAlumnos_28 [edad=" + edad + ", altura=" + altura + "]";
	}
	
	
}
