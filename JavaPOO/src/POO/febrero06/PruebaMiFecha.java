package POO.febrero06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PruebaMiFecha {

	Scanner oScan = new Scanner(System.in);
	MiFecha oFecha = new MiFecha();
	Calendar oCalendarioCalendar;
	
	
	public void pedirFecha() {
		oFecha = crearFecha();	
		
		if(oFecha.getDia() > 0 && oFecha.getDia() <= 31) {
			if(oFecha.getMes() > 0 && oFecha.getMes() <= 12) {
				if(oFecha.getAnio() > 0 && oFecha.getAnio() <= 2021 ) {
					System.out.println("LA FECHA ES: " + oFecha.toString());
				} else {
					System.out.println("ERROR EN LA FECHA");
				}
			} else {
				System.out.println("ERROR EN LA FECHA");
			}
		} else {
			System.out.println("ERROR EN LA FECHA");
		}
	}
	
	public MiFecha crearFecha() {
		
		Scanner oScan = new Scanner(System.in);
		MiFecha oFecha = new MiFecha();
		
		System.out.println("INGRESA EL DIA: ");
		oFecha.setDia(oScan.nextInt());
		
		System.out.println("INGRESA EL MES: ");
		oFecha.setMes(oScan.nextInt());
		
		System.out.println("INGRESA EL AÑO: ");
		oFecha.setAnio(oScan.nextInt());
		
		return oFecha;
	}
	

}
