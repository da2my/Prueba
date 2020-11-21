package recursividad;

public class ConvDecHex {

	public static void main(String[] args) {
		ConvDecHex.decHex(7000);
//		System.out.println(ConvDecHex.decHexRecursiva(12));
//		System.out.println(ConvDecHex.decimalAHexadecimal(7000));
	}

	public static int decHexRecursiva(int dividendo) {
		String resultado = null;
		final int DIVISOR = 16;
		int cosciente = 0;
		int resto = 0;
		if (dividendo != 0) {
			cosciente = dividendo / DIVISOR;
			resto = dividendo % DIVISOR;
			dividendo = cosciente;
			resto = cosciente % decHexRecursiva(cosciente - 1);
		} else {
//			cosciente = 0;

		}
		return resto;
	}

	public static void decHex(int dividendo) {//iterativo
		String s = null;
		final int DIVISOR = 16;
		int cosciente = 0;
		int resto = 0;
		while (dividendo != 0) {
			cosciente = dividendo / DIVISOR;
			resto = dividendo % DIVISOR;
			dividendo = cosciente;
			switch (resto) {
			case 10:
				System.out.print("A");
				break;
			case 11:
				System.out.print("B");
				break;
			case 12:
				System.out.print("C");
				break;
			case 13:
				System.out.print("D");
				break;
			case 14:
				System.out.print("E");
				break;
			case 15:
				System.out.print("F");
				break;
			default:
				System.out.print(Integer.toString(resto));
				break;
			}
		}
	}

	public static String decimalAHexadecimal(int decimal) {//de internet, iterativo
		String hexadecimal = "";
		String caracteresHexadecimales = "0123456789abcdef";
		while (decimal > 0) {
			int residuo = decimal % 16;
			hexadecimal = caracteresHexadecimales.charAt(residuo) + hexadecimal; // Agregar a la izquierda
			decimal /= 16;
		}
		return hexadecimal;
	}

}
