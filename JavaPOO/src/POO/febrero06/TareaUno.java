package POO.febrero06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TareaUno {
	
	public static void main(String[] args) {
		prueba();
	}
	
	public static void prueba() {
		int eOpc = 0;
		
		PruebaCalculadora calculadora = new PruebaCalculadora();
		PruebaAnimal animal = new PruebaAnimal();
		PruebaMiFecha fecha = new PruebaMiFecha();
		
			
		Scanner oScan = new Scanner(System.in);
		
		System.out.println("PROGRAMA QUE MUESTRA LA CREACIÓN DE 3 OBJETOS DISTINTOS");
		
		do {
			
			try {
				System.out.println("1. CALCULADORA\n2. ANIMALES\n3. FECHA\n4. SALIR\nSELECCIONE UNA ACCIÓN");
				eOpc = oScan.nextInt();
				
				switch(eOpc) {
					case 1:
						calculadora.calculadora();
						break;
					case 2:
						animal.usarAnimal();
						break;
					case 3:
						fecha.pedirFecha();
					case 4:
						System.out.println("ADIOS");
						break;
					default:
						System.out.println("ERROR EN LA SELECCIÓN");
				}
		
			}catch(InputMismatchException e) {
				
				System.out.println("TIENE QUE SER UN NUMERO ENTERO");
			}
			
		}while(eOpc != 4);
		
	}

}
