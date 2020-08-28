package ejerciciosEstructurasDeControl;

public class CienAlCero_41 {

	int num=0;
	
	public static void main(String[] args) {
		new CienAlCero_41().cienAlCero();
	}
	
	public void cienAlCero() {
		for (int i = 100; i >= num; i-=7) {
			System.out.println(i);
		}
	}

}
