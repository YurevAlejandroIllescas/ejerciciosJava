package POO.febrero20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Archivos {

	public void seleccion() throws IOException {
		
		JFileChooser seleccion = new JFileChooser("user.dir");
		seleccion.setMultiSelectionEnabled(false);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("archivo de tecto", "txt");
		seleccion.setFileFilter(filtro);
		
		ArrayList<String> lineas = new ArrayList<>();
		
		int selec = seleccion.showOpenDialog(null);
		
		if(selec == JFileChooser.APPROVE_OPTION) {
			File f = seleccion.getSelectedFile();
			FileReader fr = new FileReader(f);
			BufferedReader bf = new BufferedReader(fr);
			String cadena = "";
			while((cadena = bf.readLine()) != null) {
				lineas.add(cadena);
				
			}
			fr.close();
			bf.close();
		}
		System.out.println(lineas);
	}
}
