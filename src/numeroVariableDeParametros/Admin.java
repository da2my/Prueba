package numeroVariableDeParametros;

public class Admin {

	public static void main(String[] args) {

		Admin.vaTest("Una lista de numeros: ", 5, 6, 90);

	}

	public static void vaTest(int... v) {
		System.out.println("vaTest (int ...): " + "Number of args: " + v.length);
		System.out.println("Contents: ");
		for (int i = 0; i < v.length; i++) {
			System.out.println(" arg " + i + ": " + v[i]);
		}
		System.out.println();
	}

	public static void vaTest(boolean... v) {
		System.out.println("vaTest (boolean ...): " + "Number of args: " + v.length);
		System.out.println("Contents: ");
		for (int i = 0; i < v.length; i++) {
			System.out.println(" arg " + i + ": " + v[i]);
		}
		System.out.println();
	}

	public static void vaTest(String msg, int... v) {
		System.out.println(msg + v.length);
		System.out.println("Contents: ");
		for (int i = 0; i < v.length; i++) {
			System.out.println(" arg " + i + ": " + v[i]);
		}
		System.out.println();
	}

}
