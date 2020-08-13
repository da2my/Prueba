package ejerciciosEstructurasDeControl;



public class InicioListadoAlumnos_28 {

	int contador;
	int edad;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListadoAlumnos_28 alumno1 =new ListadoAlumnos_28(18, 1.67);
		ListadoAlumnos_28 alumno2 =new ListadoAlumnos_28(12, 1.54);
		ListadoAlumnos_28 alumno3 =new ListadoAlumnos_28(43, 1.87);
		ListadoAlumnos_28 alumno4 =new ListadoAlumnos_28(23, 1.81);
		ListadoAlumnos_28 alumno5 =new ListadoAlumnos_28(14, 1.70);
		
		
		for (int i = 0; i < ListadoAlumnos_28.getContador(); i++) {
			
		}
	
//		System.out.println(alumno1.toString());
		System.out.println("La edad media de los alumno es:");
		System.out.println(mediaEdad());
		System.out.println("La cantidad de alumnos mayores de 18 años es:");
		System.out.println(mayorEdad());
		System.out.println("La altura media de los alumnos es");
		System.out.println(mediaAltura());
		System.out.println("La cantidad de alumnos que miden mas de 1,75 es:");
		System.out.println(mayorAltura());


	}
	
	public static double mediaEdad() {
		int[] edades = { 15, 18, 14, 21, 16 };
		double sumaEdad=0;
		for (int i = 0; i < 5; i++) {
			sumaEdad = sumaEdad + edades[i];
		}
		double mediaEdad = sumaEdad/5;
		
		return mediaEdad;
	}
	
	public static int mayorEdad() {
		int edad=0;
		int cont=0;
		int[] edades = { 23, 19, 14, 21, 16 };
		for (int i = 0; i < 5; i++) {
			if (edades[i]>18) {
				cont++;
				edad=cont;
			}
		}
		return edad;
	}
	
	public static double mediaAltura() {
		double[] alturas = { 1.67, 1.54, 1.87, 1.81, 1.70 };
		double sumaAltura=0;
		for (int i = 0; i < 5; i++) {
			sumaAltura = sumaAltura + alturas[i];
		}
		double mediaEdad = sumaAltura/5;
		
		return mediaEdad;
	}
	
	public static int mayorAltura() {
		int altura=0;
		int cont=0;
		double[] alturas = { 1.67, 1.54, 1.87, 1.81, 1.70 };
		for (int i = 0; i < 5; i++) {
			if (alturas[i]>1.75) {
				cont++;
				altura=cont;
			}
		}
		return altura;
	}

}
