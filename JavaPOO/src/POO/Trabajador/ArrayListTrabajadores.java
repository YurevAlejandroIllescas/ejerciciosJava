package POO.Trabajador;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTrabajadores {

	private ArrayList<Trabajador> aTrabjadores = new ArrayList<>();
	
	public void crearTrabajador(String nombre, String departamento, float sueldo, float sueldoM, float diasT, float horasE,
			float salarioT) {
		
		Trabajador trabajador = new Trabajador(nombre, departamento, sueldo, sueldoM, diasT, horasE, salarioT);
		
		aTrabjadores.add(trabajador);
	}
	
	
}
