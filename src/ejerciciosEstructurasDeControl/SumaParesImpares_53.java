package ejerciciosEstructurasDeControl;

public class SumaParesImpares_53 {
	
	private int pares;
	private int impares;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SumaParesImpares_53().sumaParesImparesDeCien();
	}
	
	public void sumaParesImparesDeCien () {
		for (int i = 1; i <= 100; i++) {
			
			if (i%2==0) {
				pares+=i;
//				System.out.println(i);
			}else if(!(i%2==0)){
				impares+=i;
//				System.out.println(i);
			}
		}
		System.out.println("La suma total de pares hasta 100 es: "+pares);
		System.out.println("La suma total de impares hasta 100 es: "+impares);
	}

}
