package POO.febrero06;

import java.util.GregorianCalendar;
import java.util.Locale;

public class Fecha {

	public static void main(String[] args) {
		pedirFecha();
	}

	public static void pedirFecha() {

		GregorianCalendar oCalendario1, oCalendario2;
		oCalendario1 = new GregorianCalendar(2000, 10, 14);
		oCalendario2 = new GregorianCalendar();

		System.out.println("YEAR: " + oCalendario1.get(oCalendario1.YEAR));
		System.out.println("MONTH: " + oCalendario1.get(oCalendario1.MONTH));
		System.out.println("DAY: " + oCalendario1.get(oCalendario1.DAY_OF_MONTH));

		if (oCalendario1.compareTo(oCalendario2) == 0) {

			System.out.println("NACISTE HOY");
			
		} else if (oCalendario1.compareTo(oCalendario2) < 0) {

			System.out.println("NACISTE ANTES");
			
		} else if (oCalendario1.compareTo(oCalendario2) > 0) {

			System.out.println("NO NACISTE");
			
		} else {
			
			System.err.println("ERROR EN CAPA 8");
			
		}
	}
}
