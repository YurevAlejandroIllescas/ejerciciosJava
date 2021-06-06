package POO.Trabajador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuTrabajador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTrabajador frame = new MenuTrabajador();
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
	public MenuTrabajador() {
		
		ArrayListTrabajadores aTrabajadores = new ArrayListTrabajadores();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 256);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("MENU DE TRABAJADOR");
		lblNewLabel.setBounds(175, 11, 114, 14);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(285, 86, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton jbCrear = new JButton("CREAR");
		jbCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crear crear = new Crear();
				crear.setVisible(true);
				
			}
		});
		jbCrear.setBounds(41, 86, 89, 23);
		panel.add(jbCrear);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(151, 86, 89, 23);
		panel.add(btnNewButton);
		
		
	}
}
