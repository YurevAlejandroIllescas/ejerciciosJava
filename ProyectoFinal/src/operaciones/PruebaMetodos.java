package operaciones;

/**
 * 
 * @author yurev
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;



public class PruebaMetodos {
	
	public static void main(String[] args) {
		
		principal();
		
		}

	
	public static void principal(){
		int eOpc = 0;
		PruebaCalculadora oCalculadora = new PruebaCalculadora();
		Metodos oMetodos = new Metodos();
		Scanner oScan = new Scanner(System.in);
		
		do {
		
			try {
				
				
				System.out.println("\n\n\tPROYECTO FINAL");
				System.out.println("Programa que realiza todos los programas realizados durante el curso\n");
				System.out.println("1. TABLA DE MULTIPLICAR CON SUMAS\n2. ARBOL DE NAVIDAD\n3. HOLA MUNDO\n" +
									"4. OPERACIONES SIMPLES\n5. OPERACIONES CON IF\n6. 2^n\n" + 
									"7. OPERACIONES CON SWITCH\n8. TEMPERATURA\n9. CALCULADORA\n" +
									"10. NUMEROS PRIMOS\n11. PERIMETROS\n12. AREAS\n" + 
									"13. NUMEROS QUE HAY ENTRE DOS NUMEROS\n14. SALIR");
				System.out.println("INGRSE UN NÚMERO: ");
				eOpc = oScan.nextInt();
				
				switch(eOpc) {
				
				case 1:
					oMetodos.multiplicarCiclos();
					break;
				case 2:
					oMetodos.crearArbol();
					break;
				case 3:
					oMetodos.holaMundo();
					break;
				case 4:
					oMetodos.operacionesSimple();
					break;
				case 5: 
					oMetodos.operacionesIf();
					break;
				case 6:
					oMetodos.sumarMismoNumero();
					break;
				case 7:
					oMetodos.calculadoraSwitch();
					break;
				case 8:
					oMetodos.temperatura();
					break;
				case 9:
					oCalculadora.calculadora();	
					break;
				case 10:
					oMetodos.numerosPrimos();
					break;
				case 11:
					oMetodos.permietros();
					break;
				case 12:
					oMetodos.area();
					break;
				case 13:
					oMetodos.numeros();
					break;
				case 14:
					System.out.println("ADIOS :)");
					break;
				default:					
					System.out.println("ERROR EN LA SELECCIÓN");				
				}
				
				System.out.println("\n\nPRESIONE ENTER PARA CONTINUAR");
				oScan.nextLine();
				
			}catch(InputMismatchException e) {
				
				System.out.println("\n\nTIENE QUE SER UN NUMERO ENTERO Y POSITIVO\n\n");
			}					
				
			oScan.nextLine();
						
		}while(eOpc != 14);
	}
}

