package ejerciciosEstructurasDeControl;

public class Aprobados_46 {

	private int [] notas = new int [6];
	private int aprob;
	private int condi;
	private int suspe;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Aprobados_46().aprobados();
	}

	public void aprobados() {
		for (int i : notas) {
			notas[i]=(int)(Math.random()*(10-0+1)+0);
			if (notas[i]>5) {
				aprob++;
			}else if(notas[i]==4){
				condi++;
			}else {
				suspe++;
			}
		}
		System.out.println("Aprobados "+ aprob + " alumnos.");
		System.out.println("Condicionados "+ condi + " alumnos.");
		System.out.println("suspensos "+ suspe +" alumnos.");
		
		
	}
	
}
