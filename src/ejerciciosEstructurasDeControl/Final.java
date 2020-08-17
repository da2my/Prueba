package ejerciciosEstructurasDeControl;

import vista.Consola;


public class Final {
	
	public Final() {
		
		
	}
	
	public void pulgadasAcentimetro(){
		
		Consola con = new Consola();
		
		final double cmPorPulg = 2.54;
		double conversion;
		int pulgada;
		
		pulgada = Integer.parseInt(con.introCadena());
		
		conversion=pulgada*cmPorPulg;
		con.escribeNumX(conversion);
		con.escribeX("cm");
	}

}


