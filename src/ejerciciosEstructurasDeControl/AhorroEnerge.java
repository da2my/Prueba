package ejerciciosEstructurasDeControl;

import vista.Consola;

public class AhorroEnerge {
	
	//atributos
	double factura;
	double facturaTt;
	double consumo;
	double ahorroE1=0;
	double ahorroE2=0;
	double ahorroE3=0;
	double lecturaAct;
	double lecturaUlt;
	final int fijo=2;
	
	public AhorroEnerge() {
		
		
	}
	
	public double calFactura() {
		
		for (int i = 0; i <= consumo; i++) {
			if (i<=100) {
				ahorroE1=i*0.50;
			} 
			if (i>100 && i<=250) {
				ahorroE2=i*0.70 - 70;
			}
			if (i>250) {
				ahorroE3=i*1-250;
			}
			
		}
		
		factura= ahorroE1+ahorroE2+ahorroE3+fijo;
		return factura;
	}
	
	
	public double mostrarPrecioFatura() {
		Consola con = new Consola();
		
		con.escribeX("Introduzca lectura actual del contador: ");
		lecturaAct = Double.parseDouble(con.introCadena());
		con.escribeX("Introduzca la ultima lectura del contador: ");
		lecturaUlt = Double.parseDouble(con.introCadena());
		consumo = lecturaAct-lecturaUlt;
		facturaTt = calFactura();
		
		con.escribeX(String.join("","El precio de la factura de este mes es de: ", Double.toString(facturaTt), "€"));
		
		return facturaTt;
	}

}
