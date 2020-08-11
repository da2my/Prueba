package ejerciciosEstructurasDeControl;

import java.text.DecimalFormat;

import vista.Consola;

public class NotasCurso {
	
	Consola con = new Consola();
	DecimalFormat dFormat = new DecimalFormat("###.##");

	private double priT;
	private double segT;
	private double terT;
	private double mediaTrimestres;
	private double examF;
	private double trabajoF;
	private double nota;

	public NotasCurso() {

	}

	public double mediaNotas() {

		mediaTrimestres = (priT + segT + terT) / 3;

		// media=priT*0.55 + segT*0.30 + terT*0.15;

		// con.escribeLetrasX(dFormat.format(mediaTrimestres));

		return mediaTrimestres;
	}

	public double mostrarNotaFinal() {

		con.escribeLetrasX("Introduce nota Primer trimestre: ");
		priT = Double.parseDouble(con.introCadena());
		con.escribeLetrasX("Introduce nota Segundo trimestre: ");
		segT = Double.parseDouble(con.introCadena());
		con.escribeLetrasX("Introduce nota Tercer trimestre: ");
		terT = Double.parseDouble(con.introCadena());

		con.escribeLetrasX("Introduce nota Examen Final: ");
		examF = Double.parseDouble(con.introCadena());
		con.escribeLetrasX("Introduce nota Trabajo Final: ");
		trabajoF = Double.parseDouble(con.introCadena());

		nota = mediaNotas() * 0.55 + examF * 0.30 + trabajoF * 0.15;

		con.escribeLetrasX(dFormat.format(nota));

		return nota;
	}

}
