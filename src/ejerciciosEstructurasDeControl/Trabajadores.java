package ejerciciosEstructurasDeControl;

import java.text.DecimalFormat;
import java.util.Scanner;
import vista.Consola;

public class Trabajadores {
	Consola con = new Consola();
	DecimalFormat dFormat = new DecimalFormat("###.##");
	// Atributos
	private final int SUELDO_MES = 1100;

	private int supTri = 240;
	private double supPriSecc = 0.5;
	private int descPriSecc = 30;
	private double supResSecc = 1.20;
	private int descResSecc = 10;
	private int diasTra;
	private int diaInj;
	private double cobraDia;
	private int opc;
	public Trabajadores() {

	}

	public void menu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Elija la categoria del trabajador: ");
		System.out.println(comprobarCategoria(scan.next()));
		
	}
	
	public double sueldoCC() {
		double diaTrabajado = 36.6;
		double descuentoSecPri;
		double sueldoSecPri;
		double descuentoSecRes;
		double sueldoSecRes;
		double sueldo = 0;

		
		if (opc==1) {
			sueldoSecPri=diaTrabajado*diasTra+supPriSecc*diasTra;
			descuentoSecPri= descPriSecc * diaInj;	
			sueldo=sueldoSecPri-descuentoSecPri;
		}
			else if(opc==2 || opc==3) {
			sueldoSecRes=diaTrabajado*diasTra+supResSecc*diasTra;
			descuentoSecRes= descResSecc * diaInj;	
			sueldo=sueldoSecRes-descuentoSecRes;
		}
				
		return sueldo;
	}
	
	public String comprobarCategoria(String letra) {
		Scanner comScan = new Scanner(System.in);
	
		String categoria = "";
		switch (letra) {
		case "A":
			con.escribeLetrasX("Tiene un sueldo más suplemento de: ");
			double sueldoA=SUELDO_MES+supTri;
			con.escribeNumX(sueldoA);
			break;
		case "B":
			con.escribeLetrasX("Tiene un sueldo más suplemento de: ");
			double sueldoB=SUELDO_MES+supTri;
			con.escribeNumX(sueldoB);
			break;
		case "C":
			do {
				System.out.println("1.- Sección 1");
				System.out.println("2.- Sección 2");
				System.out.println("3.- Sección 3");
				System.out.println("Elija numero Sección:");
				
				opc = comScan.nextInt();
				
				
				if (opc == 1) {
					System.out.println("Cuantos días ha trabajado: ");
					diasTra=Integer.parseInt(comScan.next());
					System.out.println("Cuantos días ha faltado sin justificar: ");
					diaInj=Integer.parseInt(comScan.next());
					
					System.out.println("Sueldo total a percibir: "+ sueldoCC()+ "€");
					break;
				}else if (opc == 2) {
					System.out.println("Cuantos días ha trabajado: ");
					diasTra=Integer.parseInt(comScan.next());
					System.out.println("Cuantos días ha faltado sin justificar: ");
					diaInj=Integer.parseInt(comScan.next());
					
					System.out.println("Sueldo total a percibir: "+ dFormat.format(sueldoCC())+ "€");
					break;
				}else if (opc == 3) {
					System.out.println("Cuantos días ha trabajado: ");
					diasTra=Integer.parseInt(comScan.next());
					System.out.println("Cuantos días ha faltado sin justificar: ");
					diaInj=Integer.parseInt(comScan.next());
					
					System.out.println("Sueldo total a percibir: "+ dFormat.format(sueldoCC())+ "€");
					break;
				}
				
			} while (opc<=3);

			break;

		default:
			break;
		}

		return categoria;
	}

}
