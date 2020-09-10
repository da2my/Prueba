package ejerciciosEstructurasDeControl;

import vista.Consola;

public class MultiplicaSinOperador_51 {

	private int num1;
	private int num2;
	private int aux;

	Consola con = new Consola();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("- Multiplica Sin Operador -");
		new MultiplicaSinOperador_51().multiplicaSinOp();
	}

	public void multiplicaSinOp() {
		num1 = Integer.parseInt(con.introCadena("Introduce 1º factor: "));
		num2 = Integer.parseInt(con.introCadena("Introduce 2º factor: "));
		for (int i = 0; i < num1; i++) {
			aux += num2;
		}
		System.out.println(aux);
	}
}
