package ejerciciosEstructurasDeControl;

public class MuestraMenorNegativo_56 {
	
	private int num;
	private int cont;
	private int num1;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MuestraMenorNegativo_56().leeNumNegativos();
	}

	public void leeNumNegativos() {
	
		while (cont<10) {
			cont++;
			num = (int) (Math.random() * 100 * (Math.random() > 0.1 ? -1 : -1));
			System.out.println(num);
			if ((num<num1)) {
				num1=num;
			}
		}
		System.out.println("Numero menor que todos: " + num1);
	}
	
	
}
