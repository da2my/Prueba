package ejerciciosEstructurasDeControl;

import vista.Consola;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consola con = new Consola();
		
//		new Final().pulgadasAcentimetro();
		
		
		new Areas().formas();
		
		
		
/*		//recorre array con do - while
		
		String color = "rojo";
		
			String colores[]= { "Blanco", "Negro", "Rojo", "Azul", "Gris"};//tengo el array
			boolean encontrado=false;//doy por hecho que no esta encontrado
			String miColor = "Blanco";
			int contador=0;
			
			do {
				
				if(color.equalsIgnoreCase(colores[contador])){
					encontrado = true;
					miColor=colores[contador];
				}
				contador++;
			}while(!encontrado && contador < colores.length);
			System.out.println(colores[contador]);
			
*/			

/*		//saber si un numero es par o impar
		int num;
		num=con.introNumero();
		
		if (num/2*2 == num) {// ver la jerarquia de las operaciones matematicas
			System.out.println(num + " numero par");
		} else {
			System.out.println(num + " numero impar");
		}
*/			
		
		
	}

}
