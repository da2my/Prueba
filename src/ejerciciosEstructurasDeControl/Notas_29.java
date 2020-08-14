package ejerciciosEstructurasDeControl;

import vista.Consola;

public class Notas_29 {

	private int nota;
	private int cSuspenso;
	private int cAprobado;
	private int cNotable;
	private int cSobresaliente;

	public Notas_29() {

	}

	public void evaluaNotas() {

		System.out.println("Introducir notas");
		do {
			nota = Consola.pedirNum();

			switch (nota) {
			case 1:
			case 2:
			case 3:
			case 4:
				++cSuspenso;
				break;
			case 5:
			case 6:
				++cAprobado;
				break;
			case 7:
			case 8:
				++cNotable;
				break;
			case 9:
			case 10:
				++cSobresaliente;
				break;

			default:
				if (!(nota > 0 && nota < 10) ^(nota == -1)) {
					System.out.println("Nota incorrecta");
				}
					break;
			}
		} while (!(nota == -1));
		System.out.println("Numero de notas suspensos: " + cSuspenso);
		System.out.println("Numero de notas aprobadas: " + cAprobado);
		System.out.println("Numero de notas notable: " + cNotable);
		System.out.println("Numero de notas sobresaliente: " + cSobresaliente);

	}
}
