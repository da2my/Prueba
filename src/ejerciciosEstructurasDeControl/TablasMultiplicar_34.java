package ejerciciosEstructurasDeControl;

import vista.Consola;

public class TablasMultiplicar_34 {

	private int num;
	Consola con = new Consola();

	public TablasMultiplicar_34() {

	}

	public void menu() {
		num = Integer.parseInt(con.introCadena("Introduce el numero de la tabla de multiplicar que quieres: "));

		switch (num) {
		case 1:
			con.escribeY("la tabla del 1 es: ");
			multiplica(num);
			break;
		case 2:
			con.escribeY("la tabla del 2 es: ");
			multiplica(num);
			break;
		case 3:
			con.escribeY("la tabla del 3 es: ");
			multiplica(num);
			break;
		case 4:
			con.escribeY("la tabla del 4 es: ");
			multiplica(num);
			break;
		case 5:
			con.escribeY("la tabla del 5 es: ");
			multiplica(num);
			break;
		case 6:
			con.escribeY("la tabla del 6 es: ");
			multiplica(num);
			break;
		case 7:
			con.escribeY("la tabla del 7 es: ");
			multiplica(num);
			break;
		case 8:
			con.escribeY("la tabla del 8 es: ");
			multiplica(num);
			break;
		case 9:
			con.escribeY("la tabla del 9 es: ");
			multiplica(num);
			break;
		case 10:
			con.escribeY("la tabla del 10 es: ");
			multiplica(num);
			break;
		default:
			con.escribeX("Solo se hace las tablas del 1 - 10");
			break;
		}

	}

	public void multiplica(int num) {

		for (int i = 0; i < 11; i++) {
			con.escribeY(num + "x" + i + "=" + num * i);
		}

	}

}
