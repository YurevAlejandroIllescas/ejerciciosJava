package POO.Trabajador;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Crear extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfDepartamento;
	private JTextField tfSueldoM;
	private JTextField tfDiasT;
	private JTextField tfHorasE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crear frame = new Crear();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Crear() {
		
		ArrayListTrabajadores aTrabajadores = new ArrayListTrabajadores();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CREAR");
		lblNewLabel.setBounds(180, 0, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(27, 32, 59, 14);
		panel.add(lblNewLabel_1);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(85, 29, 86, 20);
		panel.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Departamento:");
		lblNewLabel_2.setBounds(208, 32, 86, 14);
		panel.add(lblNewLabel_2);
		
		tfDepartamento = new JTextField();
		tfDepartamento.setBounds(289, 29, 86, 20);
		panel.add(tfDepartamento);
		tfDepartamento.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sueldo mensual:");
		lblNewLabel_3.setBounds(62, 95, 97, 14);
		panel.add(lblNewLabel_3);
		
		tfSueldoM = new JTextField();
		tfSueldoM.setBounds(169, 92, 86, 20);
		panel.add(tfSueldoM);
		tfSueldoM.setColumns(10);
		
		tfDiasT = new JTextField();
		tfDiasT.setColumns(10);
		tfDiasT.setBounds(169, 117, 86, 20);
		panel.add(tfDiasT);
		
		JLabel lblNewLabel_4 = new JLabel("N\u00FAmero de dias trabajado:");
		lblNewLabel_4.setBounds(16, 120, 155, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Horas extras:");
		lblNewLabel_4_1.setBounds(75, 145, 84, 14);
		panel.add(lblNewLabel_4_1);
		
		tfHorasE = new JTextField();
		tfHorasE.setBounds(169, 142, 86, 20);
		panel.add(tfHorasE);
		tfHorasE.setColumns(10);
		
		JButton jbRegresar = new JButton("REGRESAR");
		jbRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbRegresar.setBounds(225, 203, 89, 23);
		panel.add(jbRegresar);
		
		JButton jbAceptar = new JButton("ACEPTAR");
		jbAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre;
				String departamento;
				float sueldo;
				float sueldoM;
				float diasT;
				float horasE;
				float salarioT;
				
				nombre = tfNombre.getText();
				departamento = tfDepartamento.getText();
				sueldoM = Float.parseFloat(tfSueldoM.getText());
				diasT = Float.parseFloat(tfDiasT.getText());
				horasE = Float.parseFloat(tfHorasE.getText());
				
				sueldo = sueldoM / 30;
				salarioT = ((sueldo * diasT) + ((sueldo / 8) * horasE));
				
				aTrabajadores.crearTrabajador(nombre, departamento, sueldo, sueldoM, diasT, horasE, salarioT);
				
				tfNombre.setText(null);
				tfDepartamento.setText(null);
				tfSueldoM.setText(null);
				tfDiasT.setText(null);
				tfHorasE.setText(null);
				
				MenuTrabajador menu = new MenuTrabajador();
				menu.setVisible(true);
				
				dispose();
			}
					
		});
		jbAceptar.setBounds(106, 203, 89, 23);
		panel.add(jbAceptar);
		
		
	}
}
