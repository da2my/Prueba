package recursividad;

public class InvierteCadena {

	public static void main(String[] args) {

		System.out.println(InvierteCadena.invCadena("hola lola"));
	}

	public static String invCadena(String cadena) {
		String sCadena = cadena;
		char charat = (char) cadena.length();
		for (int i = 0; i < cadena.length(); i++) {
			System.out.print(i);
		}
		return sCadena;
	}

}
