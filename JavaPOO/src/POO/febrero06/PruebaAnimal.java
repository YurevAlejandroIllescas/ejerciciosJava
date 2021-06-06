package POO.febrero06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaAnimal {

	Scanner oScan = new Scanner(System.in);
	Animal oAnimal = new Animal();
	
	public void usarAnimal() {
		
		int eOpc = 0;
		Scanner oScan = new Scanner(System.in);
		oAnimal = pedirAnimal();
		
		do {
			try {
	
				System.out.println("ANIMAL\n1. DORMIR\n2. COMER\n3. CAMINAR\n4.REGRESAR\nINGRESAR ACCIÓN: ");
				eOpc = oScan.nextInt();
				
				switch (eOpc) {
				case 1:
					oAnimal.dormir();
					break;
				case 2:
					oAnimal.comer();
					break;
				case 3:
					oAnimal.caminar();
					break;
				case 4:
					System.out.println("ADIOS<");
					break;
					
				default:
					System.out.println();
					break;
				}
			}catch(InputMismatchException e) {
				
				System.out.println("TIENE QUE SER UN NUMERO ENTERO");
			}
			
			oScan.nextLine();
		}while(eOpc != 4);
	}
	
	
	
	public Animal pedirAnimal() {
		
		String sEspecie;
		int ePatas;
		Scanner oScan = new Scanner(System.in);
		Animal oAnimal; 
		
		System.out.println("¿QUE ESPECIE ES EL ANIMAL?");
		sEspecie = oScan.nextLine();
		
		
			System.out.println("¿CUANTAS PATAS TIENE EL ANIMAL?");
			ePatas = oScan.nextInt();
		
		oAnimal = new Animal(sEspecie, ePatas);
		
		return oAnimal;
	}
}
