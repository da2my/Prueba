package ejerciciosEstructurasDeControl;

import vista.Consola;

public class PrecioProducto {
	
	//Atributos
	private double precioP, precioF, precio;
	
	//Constructor
	public PrecioProducto() {
		
	}
	
	//Metodos
	public double calPrecio() {//este metodo retorna el valor de "precio"
		
		if (precioP >= 6 && precioP < 60) {
			precio = precioP - precioP*0.1;
		}else if (precioP<6){
			precio = precioP;
		}else {
			precio = precioP;
		}
		
		return precio;			
	}
	
	public double mostrarPrecio() {
		Consola con = new Consola();
		
		con.escribeLetrasX("Introduce Precio del Poducto: ");
		precioP = Double.parseDouble(con.introCadena());
		
		precioF = calPrecio();
		
		con.escribeNumX(precioF);
		
		return precioF;
	}
	
	

}
