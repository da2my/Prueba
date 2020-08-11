package ejerciciosEstructurasDeControl;

import vista.Consola;

public class Areas {
	
	
	public Areas () {
		
		
	}
	
	public void formas() {
		
		Consola con = new Consola();
		
		con.escribeLetrasY("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Triángulo \n4: Circulo");
		
		int figuras = Integer.parseInt(con.introCadena());
		
		int base;
		int altura;
		
		switch (figuras) {
		case 1:
			
			con.escribeLetrasX("Introduce lado: ");
			int lado=con.introNumero();
			
			
			
			con.escribeLetrasX("El área del cuadrado es: " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			con.escribeLetrasX("Introduce base: ");
			base=con.introNumero();
			con.escribeLetrasX("Introduce altura: ");
			altura=con.introNumero();
			
			con.escribeLetrasX("El área del rectangulo es: " + base * altura);
			
			break;
			
		case 3:
			
			con.escribeLetrasX("Introduce base: ");
			base=con.introNumero();
			con.escribeLetrasX("Introduce altura: ");
			altura=con.introNumero();
			
			con.escribeLetrasX("El área del triángulo es: " + (base * altura)/2);
			
			break;	
			
		case 4:
			
			con.escribeLetrasX("Introduce radio: ");
			int radio=con.introNumero();
			
			con.escribeLetrasX("El área del circulo es: ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
			con.escribeLetrasY("Opcion no valida");
			break;
		}
		
		
	}
	

}
