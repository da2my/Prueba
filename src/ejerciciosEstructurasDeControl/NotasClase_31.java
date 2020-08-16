package ejerciciosEstructurasDeControl;

public class NotasClase_31 {

	private int alumnos = 30;
	private int cont=0;

	public void leeNotas() {

		for (int i = 0; i < alumnos; i++) {
			int numero = (int) Math.floor(Math.random() * 10);
			if (numero>=5) {
				cont++;
			}
			System.out.println(numero);
		}
		System.out.println("El numero de aprobados de esta clase de 30 alumnos es: " + cont);
	}

}
