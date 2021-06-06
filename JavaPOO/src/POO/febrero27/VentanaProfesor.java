package POO.febrero27;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import POO.febrero20.Archivos;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaProfesor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfNombre;
	private JTextField tfMateria;
	private JTextField tfExperiencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaProfesor dialog = new VentanaProfesor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaProfesor() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("PROFESOR");
			lblNewLabel.setBounds(163, 11, 74, 14);
			contentPanel.add(lblNewLabel);
		}
		
		JComboBox cbCasa = new JComboBox();
		cbCasa.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Griffindor", "Hufflepuff", "Slytherin", "Ravenclaw"}));
		cbCasa.setBounds(132, 69, 146, 22);
		contentPanel.add(cbCasa);
		
		JLabel lblNewLabel_1 = new JLabel("CASA");
		lblNewLabel_1.setBounds(70, 73, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(60, 40, 46, 14);
		contentPanel.add(lblNewLabel_2);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(132, 34, 146, 20);
		contentPanel.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MATERIA");
		lblNewLabel_3.setBounds(60, 105, 46, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("EXPERIENCIA");
		lblNewLabel_4.setBounds(42, 133, 74, 14);
		contentPanel.add(lblNewLabel_4);
		
		tfMateria = new JTextField();
		tfMateria.setBounds(132, 102, 146, 20);
		contentPanel.add(tfMateria);
		tfMateria.setColumns(10);
		
		tfExperiencia = new JTextField();
		tfExperiencia.setColumns(10);
		tfExperiencia.setBounds(132, 130, 146, 20);
		contentPanel.add(tfExperiencia);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						File f = buscar();
						Profesor prof = new Profesor();
						prof.setCasa(cbCasa.getSelectedItem().toString());
						prof.setNombre(tfNombre.getText());
						prof.setMateria(tfMateria.getText());
						prof.setExperiencia(Integer.parseInt(tfExperiencia.getText()));
						String texto = prof.toString();
						
						FileWriter fw;
						try {
							fw = new FileWriter(f);
							BufferedWriter bw = new BufferedWriter(fw);
							
							bw.write(texto);
							
							bw.close();
							fw.close();
							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							System.out.println("ARCHIVO NO ENCONTRADO" + e1.getMessage());
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
	}
	
	public File buscar() {
		JFileChooser seleccion = new JFileChooser("C:\\Users\\yurev\\OneDrive\\Escritorio\\Curso DEV\\Programas\\JAVA\\JavaPOO\\src");
		File f = null;
		seleccion.setMultiSelectionEnabled(false);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("archivo de tecto", "txt");
		seleccion.setFileFilter(filtro);
		
		ArrayList<String> lineas = new ArrayList<>();
		
		int selec = seleccion.showOpenDialog(null);
		
		if(selec == JFileChooser.APPROVE_OPTION) {
			 f = seleccion.getSelectedFile();
		}
		return f;
	}
}
