package ejerciciosEstructurasDeControl;

public class ParImpar_22 {
	
	private int num;
	
	public ParImpar_22 () {
		
	}
	
	
	
	public int getNum() {
		return num;
	}



	public int checkParImpar() {
		
		do {
			num = PositivoNegativo_21.pedirNum();
			
			System.out.println(num % 2 == 0 ? "El número es par"
					: "El número es impar");
		
		}while(!(num==0));
		
		return num;
	}

}
