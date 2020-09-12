package ejerciciosEstructurasDeControl;

public class MuestraPrimosAlCien_55 {
	
	private int num = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MuestraPrimosAlCien_55().primosAlCien();
	}
	
	public void primosAlCien() {
		for (int i = 2; i < num; i++) {
			
			if (i != 2 && i != 3 && i != 5 && i != 7) {

				if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

				} else {
					System.out.print(i+" ");
				}
			} else {
				System.out.print(i+" ");
			}
		}
	}

}
