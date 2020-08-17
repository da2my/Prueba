package ejerciciosEstructurasDeControl;

import vista.Consola;
import java.text.DecimalFormat;

public class Trigonometria {
	
	private double a;
	private double b;
	private double c;
	
	public Trigonometria() {
		

	}
	
	public void calHipotenusa() {
		
		Consola con = new Consola();
		
		double resultado;
		
		con.escribeX("Introduce lado opuesto: ");
		a = Double.parseDouble(con.introCadena());
		con.escribeX("Introduce lado adyacente: ");
		b = Double.parseDouble(con.introCadena());
		
		resultado = Math.pow(a, 2) + Math.pow(b, 2);
		c=Math.sqrt(resultado);
		
		DecimalFormat dFormat = new DecimalFormat("###.##");

		con.escribeX("La hipotenusa del triangulo rectangulo es: " +dFormat.format (c));
	}

	

}
