package POO.febrero06;

/**
 * 
 * @author yurev
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
	@author yurev
	@version 1.0
*/

public class PruebaCalculadora {
	
	public static float pedirNumero() {
		Scanner oScan = new Scanner(System.in);
		float fNum;
		
		System.out.println("Ingresa un numero: ");
		fNum = oScan.nextFloat();
		
		return fNum;
	}
	
	
	public void calculadora() {

		int eOpc = 0;
		float eNum = 0;
		
		Scanner oScan = new Scanner(System.in);
		Calculadora oCalculadora = new Calculadora();
		
		do {
			
			try {
			
				System.out.println("Calculadora basica. \n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Salir\nSeleccione una opción:");
				eOpc = oScan.nextInt();
				
				switch(eOpc) {
				case 1:
					System.out.println("SUMAR");
					oCalculadora.setNum1(pedirNumero());
					oCalculadora.setNum2(pedirNumero());
					
					System.out.println(oCalculadora.getNum1() + " + " + oCalculadora.getNum2() + " = " +  oCalculadora.Sumar());
					break;
				case 2:
					System.out.println("RESTAR");
					oCalculadora.setNum1(pedirNumero());
					oCalculadora.setNum2(pedirNumero());
					
					System.out.println(oCalculadora.getNum1() + " / " + oCalculadora.getNum2() + " = "  + oCalculadora.Restar());
					break;
				case 3:
					System.out.println("MULTIPLICAR");
					oCalculadora.setNum1(pedirNumero());
					oCalculadora.setNum2(pedirNumero());
					
					System.out.println(oCalculadora.getNum1() + " * " + oCalculadora.getNum2() + " = " + oCalculadora.Multiplicar());
					break;
				case 4:
					System.out.println("DIVIDIR");
					oCalculadora.setNum1(pedirNumero());
					oCalculadora.setNum2(pedirNumero());
					
					eNum = oCalculadora.Dividir();
					
					if(eNum != -1) {
						System.out.println(oCalculadora.getNum1() + " / " + oCalculadora.getNum2() + " = " + oCalculadora.Dividir());
					} else {
						
						System.out.println("NO SE PUEDE REALIZAR");
					}
					
					break;
				case 5:
					System.out.println("\n\nREGRESAR\n\n");
					break;
				default: 
					System.out.println("ERROR");
				}
				
			}catch(InputMismatchException e) {
				
				System.out.println("TIENE QUE SER UN NUMERO ENTERO");
			}
			
			oScan.nextLine();
			
		}while(eOpc != 5);
	}
}