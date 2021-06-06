package POO.febrero20;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import POO.febrero06.Animal;

public class ArrayListPrincipal {

	public static void main(String[] args) {
		
		ArrayList<Animal> aLista = new ArrayList<>();
		
		aLista.add(new Animal("Perro", 'M', "Grande", 0));
		
		do {
			
			aLista.add(new Animal("Perro", 'M', "Grande", 0));
			JOptionPane.showMessageDialog(null, aLista.toString());
			
		} while(JOptionPane.showConfirmDialog(null, "Desea continuar") == JOptionPane.OK_OPTION);
		
	}
}
