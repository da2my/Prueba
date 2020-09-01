package ejerciciosEstructurasDeControl;

public class SumaSueldo_45 {

	private int[] sueldo = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SumaSueldo_45().sumaSueldo();
	}

	public void sumaSueldo() {
//		for (int i : sueldo) {
//			sueldo[i] = (int) (Math.random() * 100 * (Math.random() > 0.1 ? 1 : -1));
//			System.out.println(sueldo[i]);
//		}
		for (int i = 0; i < sueldo.length; i++) {
			sueldo[i] = (int) (Math.random() * 100 * (Math.random() > 0.1 ? 1 : -1));

			System.out.println(sueldo[i]);
		}
	}

}