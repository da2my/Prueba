package ejerciciosEstructurasDeControl;

import vista.Consola;

public class Piramide {
	private int auxi;

	private int base;
	private int altura;
	private int cont;
	private int jAux;
	private int aux;
	private int ladoIz;
	private int ladoIzI;
	private int ladoDe;
	private int ladoDeI;
	private int centro;

	Consola con = new Consola();

	public static void main(String[] args) {
//		new Piramide().dibPiramide();
		new Piramide().dibPiramideVacia();
	}

	public void dibPiramide() {
		altura = Integer.parseInt(con.introCadena("Introduzca la altura de la Piramide: "));
		// HACER QUE LA ALTURA CORESPONDA CON LA BASE DE LA FORMA GEOMETRICA DE LA
		// PIRAMIDE
		aux = altura + altura;
		base = aux - 1;
		// QUE DECREZCA PROPORCIONALMENTE EL NUMERO DE BLANCOS DE UN LADO
		ladoIz = base - altura;// representa el comienzo del triangulo rectangulo lateral izquierdo decreciente
		ladoDe = base - altura;// representa el comienzo del triangulo rectangulo lateral derecho decreciente
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
//				jAux = cont++;// en la primera itº no se asigna el valor del "cont" a "jAux"
				// porque la primera itº es la de inicializacion || es muy importante aislar el
				// flujo de contaje de "j" ya que si lo utilizamos se modificaria todo, por eso
				// utilizamos un auxiliar || despues de terminar el programa me di cuenta que no
				// necesito el "jAux" y obviamente tampoco necesito el "cont"
				if (ladoIz > j || ladoDe < j) {// QUE DECREZCA PROPORCIONALMENTE EL NUMERO DE BLANCOS DE UN LADO
												// O/Y DEL OTRO LADO
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			// ACONDICIONAMIENTO DE VARIABLES PARA LA SIGUENTE ITERACION DE i ES DECIR DE
			// LOS ESCALONES, ALTURA
//			jAux = 0;
//			cont = 0;
			ladoIz--;
			ladoDe++;

			System.out.println();
		}
		System.out.println();
	}

	public void dibPiramideVacia() {
		altura = Integer.parseInt(con.introCadena("Introduzca la altura de la Piramide: "));
		aux = altura + altura;
		base = aux - 1;
		ladoIz = base - altura;
		ladoDe = base - altura;
		ladoIzI = (base - altura);
		ladoDeI = (base - altura);
		centro = (base - altura) + 1;
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				if (ladoIz > j == ladoDe < j) {// 0 - 0 ø 1 - 1 entra
					if (i > 0 && (ladoIzI > j == ladoDeI < j)) {// 0 - 0 y cuando esta en el escalon 1 entra
						if (j<=i) {
							System.out.print("@");
						} else if(i > 1) {
							System.out.print(" ");
						}else {
							System.out.print(" ");
						}
					} else {
						System.out.print("@");
					}
				} else {
					System.out.print(" ");
				}
			}
			ladoIz--;
			ladoDe++;
//			ladoIzI--;
//			ladoDeI++;
//			centro++;
			System.out.println();
		}
		System.out.println();

	}

}
