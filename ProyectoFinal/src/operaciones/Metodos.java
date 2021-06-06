package operaciones;

/**
 * 
 * @author yurev
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {
	Perimetros oPerimetros = new Perimetros();

public void multiplicarCiclos() {
		
		int eCons = 0, eNum;
		Scanner oScan = new Scanner(System.in);
	
		try {
			System.out.println("Dame un numero para multiplicarlo");
			eNum = oScan.nextInt();		
			
			
			for(int i = 1; i < 11; i++) {
				
				eCons += eNum;
				
				System.out.println(eNum  + " * " + i + " = " + eCons);
				
			}	
		}catch(InputMismatchException e) {
				
				System.out.println("TIENE QUE SER UN NUMERO ENTERO");
			}
}
	
public void crearArbol() {

		
		for(int i = 0; i <= 20; i += 2) {
			
			for(int k = 0; k <= 20 - i; k += 2) {
				
				System.out.print(" ");
				
			}
			
			System.out.print("*");
			
			for(int j =1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
				
		}
		
		for(int i = 0; i <= 2; i++) {
			System.out.print("         |    |");
			System.out.println();
		}
}

public void holaMundo() {
	
	String sNombre;
	
	Scanner oScan = new Scanner(System.in);
	
	System.out.println("Escribe tú nombre: ");
	sNombre = oScan.nextLine();
	
	for (int i = 0; i < 5; i ++) { //Ciclo
	
		System.out.println("Hola " + sNombre + " saluda al mundo");	
		
	}
}

public void operacionesSimple() {
	
	float eNum1, eNum2;
	Scanner oScan = new Scanner(System.in);
	
	try {
		System.out.println("Escribe un número: ");
		eNum1 = oScan.nextInt();
		
		System.out.println("Escribe otro número: ");
		eNum2 = oScan.nextInt();
		
		System.out.println("La suma es: " + (eNum1 + eNum2));
		System.out.println("La resta es: " + (eNum1 - eNum2));
		System.out.println("La multiplicación es: " + (eNum1 * eNum2));
		
		if(eNum1 > 0 && eNum2 > 0) {
			
			System.out.println("La división es: " + (eNum1 / eNum2));
			
		} else {
			
			System.out.println("No se puede hacer la división");
		}
	}catch(InputMismatchException e) {
				
				System.out.println("TIENE QUE SER UN NUMERO ENTERO");
			}	
}


public void operacionesIf() {
	
	int eOp = 0;
	float fNum1, fNum2;
	Scanner oScan = new Scanner(System.in);
	
	System.out.println("\n\nPrograma que hace las 4 operaciones basicas");
	
	do {
		
		try {
		
			System.out.println("Selecciona una operación. \n1. Suma \n2. Resta \n3. Multiplicación \n4. División\n5. Regresar");
			eOp = oScan.nextInt();
			
			if(eOp < 5) {
				
				System.out.println("Ingrese un número: ");
				fNum1 = oScan.nextFloat();
				
				System.out.println("Ingrese un número: ");
				fNum2 = oScan.nextFloat();
				
				if(eOp == 1) {
					System.out.println(fNum1 + " + " + fNum2 +  " = " + (fNum1+fNum2));
				}
				
				if(eOp == 2) {
					System.out.println(fNum1 + " - " + fNum2 +  " = " + (fNum1 - fNum2));
					
				}
				
				if(eOp == 3) {
					System.out.println(fNum1 + " * " + fNum2 +  " = " + (fNum1 * fNum2));
				}
				
				if(eOp == 4) {
					
					if(fNum1 > 0 && fNum2 > 0) {
						System.out.println(fNum1 + " / " + fNum2 +  " = " + (fNum1 / fNum2));
					} else {
						
						System.out.println("Error.");
					}
				}
			}
		}catch(InputMismatchException e) {
			
			System.out.println("TIENE QUE SER UN NUMERO ENTERO");
		}
		
	}while(eOp < 4);
	
	System.out.println("\n\nREGRESR\n\n");
}

public void sumarMismoNumero() {
	
	int eNumero = 1;
	
	while(eNumero <= 1000000) {
		
		System.out.println(eNumero);
		eNumero += eNumero;
	}
}

public void calculadoraSwitch() {
	int eOpc = 0, eNum1, eNum2;
	Scanner oScan = new Scanner(System.in);
	
	do {
		
		try {	
		
			System.out.println("\n\nCalculadora basica. \n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Salir\nSeleccione una opción:");
			eOpc = oScan.nextInt();
			
			System.out.println("Ingrese un número: ");
			eNum1 = oScan.nextInt();
			System.out.println("Ingrese otro número: ");
			eNum2 = oScan.nextInt();
			
			switch(eOpc) {
			
			case 1:
				System.out.println("Suma");
				System.out.println(eNum1 + " + " + eNum2 + " = " + (eNum1 + eNum2));
				break;
			case 2:
				System.out.println("Resta");
				System.out.println(eNum1 + " - " + eNum2 + " = " + (eNum1 - eNum2));
				break;
			case 3:
				System.out.println("Multiplicación");
				System.out.println(eNum1 + " * " + eNum2 + " = " + (eNum1 * eNum2));
				break;
			case 4:
				System.out.println("División");
				if(eNum2 == 0) {
					
					System.out.println("No se puede realizar la operación");
				} else {
					
					System.out.println(eNum1 + " / " + eNum2 + " = " + (eNum1 / eNum2));
				}
				break;
			case 5:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Error en la selección");
			
			}
			
		}catch(InputMismatchException e) {
			
			System.out.println("TIENE QUE SER UN NUMERO ENTERO");
		}
		
	}while(eOpc != 6);
}

public void temperatura() {
	Scanner oScan = new Scanner(System.in);
	
	System.out.println("¿Cual es la temperatura?");
	float fTemp = oScan.nextFloat();
	
	try {
		if( fTemp >= 25) {
			
			System.out.println("Pudes ir a la playa");
			
		} else {
			
			if(fTemp <= 5) {
				
				System.out.println("Esta nevando, no podemos ir");
				
			} else {
				
				if(fTemp >= 15 && fTemp <= 20) {
					
					System.out.println("La cidad esta fresca para dar un paseo");
				
				} else {
					
					if(fTemp > 5 && fTemp < 10) {
						
						System.out.println("Hace frio y nos quedamos en casa");
					}
					
				}
			}
		}
	}catch(InputMismatchException e) {
		
		System.out.println("TIENE QUE SER UN NUMERO ENTERO");
	}		
}

public void numerosPrimos() {
	
	boolean bandera = false;
	int cont;
	
	for(int i = 1; i < 100; i++) {

		if((i%2) == 1){
			
		bandera = true;
		}
		
		if(bandera) {
			System.out.println(i);
			bandera = false;
		}
			
	}
	
}

public void permietros() {
	
	int eOpc = 0;
	Scanner oScan = new Scanner(System.in);
	
	do {
		
		try {	
		
			System.out.println("PROGRAMA QUE DA PERIMETROS. \n1. TRIANGULO\n2. RECTANGULO\n3. Circulo\n4. REGRESAR\nSELECCIONE UNA OPCIÓN: ");
			eOpc = oScan.nextInt();
			
			
			switch(eOpc) {
			
			case 1:
				System.out.println("\n\tPERIMETRO TRIANGULO\nINGRESE EL VALOR DE LOS CADA LADO");
				System.out.println("EL TRIANGULO TINE UN PERIMETRO DE: " + oPerimetros.pTriangulo(pedirNumero(), pedirNumero(), pedirNumero()));
				break;
			case 2:
				System.out.println("\n\tPERIMRTRO RECTANGULO\nINGRESE EL VALOR DEL SOLO EL LADO MAS CHICO Y EL MÁS GRANDE");
				System.out.println("EL RECTANGULO TIENE UN PERIMERO DE: " + oPerimetros.pRectangulo(pedirNumero(), pedirNumero()));
				break;
			case 3:
				System.out.println("\n\tPERIMETRO CIRCULO\nINGRESE EL VALOR DEL DIAMETRO");
				System.out.println("EL CIRCULO TIENE UN PERIMETRO DE: " + oPerimetros.pCirculo(pedirNumero()));
				break;
			
			case 4:
				System.out.println("REGRESAR");
				break;
			default:
				System.out.println("ERROR EN LA SELECCIÓN");
			
			}
			
		}catch(InputMismatchException e) {
			
			System.out.println("TIENE QUE SER UN NUMERO ENTERO");
		}
		
		oScan.nextLine();
		
	}while(eOpc != 4);
	
	
}

public void area() {
	
	int eOpc = 0;
	Scanner oScan = new Scanner(System.in);
	
	do {
		
		try {
			System.out.println("\n\tPROGRAMA QUE DA EL AREA\n1. TRIANGULO\2. RECTANGULO\n3. CIRCULO\n4. REGRESAR\nSELECCIONE UNA OPCIÓN: ");
			eOpc = oScan.nextInt();
			
			switch(eOpc) {
			
			case 1:
				System.out.println("\n\tAREA TRIANGULO\nINGRESE EL VALOR DE LA BASE Y DE LA ALTURA");
				System.out.println("EL TRIANGULO TINE UN AREA DE: " + oPerimetros.aTriangulo(pedirNumero(), pedirNumero()));
				break;
			case 2:
				System.out.println("\n\tAREA RECTANGULO\nINGRESE EL VALOR DE LA BASE Y DE LA ALTURA");
				System.out.println("EL RECTANGULO TINE UN AREA DE: " + oPerimetros.aRectangulo(pedirNumero(), pedirNumero()));
				break;
			case 3:
				System.out.println("\n\tAREA CIRCULO\nINGRESE EL VALOR DEL RADIO DEL CIRCULO");
				System.out.println("EL CIRCULO TINE UN AREA DE: " + oPerimetros.aCirculo(pedirNumero()));
				break;
			case 4:
				System.out.println("REGRESAR");
				break;
			default:
				System.out.println("ERROR EN LA SELECCIÓN");
			}
		
		}catch(InputMismatchException e) {
			
			System.out.println("TIENE QUE SER UN NUMERO ENTERO");
		}
		
		oScan.nextLine();
		
	}while(eOpc != 4);
}

public float pedirNumero() {
	
	float numero;
	Scanner oScan = new Scanner(System.in);
	
		System.out.println("INGRESE UN NUMERO: ");
		numero = oScan.nextFloat();
		
	return numero;
}
	
public void numeros() {
	int eNum1, eNum2;
	Scanner oScan = new Scanner(System.in);
	
	System.out.println("\n\nPROGRAMA QUE MUESTRA LOS NÚMEROS QUE EXISTEN ENTRE 2 NÚMEROS");
	System.out.println("INICIO: ");
	eNum1 = oScan.nextInt();
	
	System.out.println("FINAL: ");
	eNum2 = oScan.nextInt();
	
	if(eNum1 <= eNum2) {
	
		for(;eNum1 <= eNum2; eNum1++) {
			
			System.out.println(eNum1);
		
		}
	}else {
		for(;eNum1 >= eNum2; eNum1--) {
			
			System.out.println(eNum1);
		
		}
	}
	
	
}
}


