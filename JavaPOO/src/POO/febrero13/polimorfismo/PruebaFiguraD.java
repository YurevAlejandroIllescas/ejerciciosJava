package POO.febrero13.polimorfismo;

//import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.DocFlavor.READER;
import javax.swing.text.TableView.TableRow;

public class PruebaFiguraD {

	public static void main(String[] args) {
		
	principal();

	}
	
	
	
	public static void principal() {
		int eOpc = 0;
		Cuadro cuadrado = new Cuadro();
		Triangulo triangulo = new Triangulo();
		Rectangulo rectangulo = new Rectangulo();
		Scanner oScan = new Scanner(System.in);
		
		System.out.println("PROGRAMA QUE MUESTRA EL AREA Y EL PERIMETRO DE FIGURAS GEOMETRICAS");
		
		do {
			try {
				
				
				System.out.println("1.CUADRADO\n2.TRIANGULO\n3.RECTANGULO\n4.SALIR");
				eOpc = oScan.nextInt();
				
				switch (eOpc) {
				case 1:
					System.out.println("CUADRADO");
					cuadrado = pedirCuadrado();
					System.out.println("EL AREA DEL CUADRADO ES: " + cuadrado.area());
					System.out.println("EL PERIMETRO DEL CUADRADO ES: " + cuadrado.perimetro());
					break;
				case 2:
					System.out.println("TRIANGULO");
					triangulo = pedirTriangulo();
					System.out.println("EL AREA DEL TRIANGULO ES: " + triangulo.area());
					System.out.println("EL PERIMETRO DEL TRIANGULO ES: " + triangulo.perimetro());
					break;
				case 3:
					System.out.println("RECTANGULO");
					rectangulo = pedirRectangulo();
					System.out.println("EL AREA DEL RECTAGULO ES: " + rectangulo.area());
					System.out.println("EL PERIMETRO DEL RECTANGULO ES: " + rectangulo.perimetro());
					break;
				case 4:
					System.out.println("ADIOS");
					break;
				default:
					System.out.println("ERROR EN LA SELECCIÓN");
					break;
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}while(eOpc != 4);
	}
	
	public static Cuadro pedirCuadrado() {
		Cuadro cuadro = new Cuadro();
		Scanner oScan = new Scanner(System.in);
		
		System.out.println("INGRESE EL TIPO DE CUADRADO: ");
		cuadro.setTipoCuadro(oScan.nextLine());
		System.out.println("INGRESE CUANTO MIDE LA BASE: ");
		cuadro.setBase(oScan.nextFloat());
		System.out.println("INGRESE CUANTO MIDE LA ALTURA: ");
		cuadro.setAltura(oScan.nextFloat());
		return cuadro;
	}
	
	public static Triangulo pedirTriangulo() {
		Triangulo triangulo = new Triangulo();
		Scanner oScan = new Scanner(System.in);
		
		System.out.println("INGRESE CUANTO MIDE EL LADO UNO DEL TRIANGULO: ");
		triangulo.setLadoU(oScan.nextFloat());
		System.out.println("INGRESE CUANTO MIDE EL LADO DOS DEL TRIANGULO: ");
		triangulo.setLadoD(oScan.nextFloat());
		System.out.println("INGRESE CUANTO MIDE EL LADO TRES DEL TRIANGULO");
		triangulo.setLadoT(oScan.nextFloat());
		
		System.out.println("INGRESE CUANTO MIDE LA ALTURA: ");
		triangulo.setAltura(oScan.nextFloat());
		System.out.println("INGRESE CUANTO MIDE LA BASE: ");
		triangulo.setBase(oScan.nextFloat());
		return triangulo;
	}
	
	public static Rectangulo pedirRectangulo() {
		Rectangulo rectangulo = new Rectangulo();
		Scanner oScan = new Scanner(System.in);
		
		System.out.println("INGRESE EL TIPO DE RECTANGULO: ");
		rectangulo.setTipoRectangulo(oScan.nextLine());
		System.out.println("INGRESE CUANTO MIDE LA ALTURA: ");
		rectangulo.setAltura(oScan.nextFloat());
		System.out.println("INGRESE CUANTO MIDE LA BASE: ");
		rectangulo.setBase(oScan.nextFloat());
		
		return rectangulo;
	}
}
