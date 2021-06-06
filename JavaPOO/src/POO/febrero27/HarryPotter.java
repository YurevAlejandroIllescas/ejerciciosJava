package POO.febrero27;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HarryPotter extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HarryPotter frame = new HarryPotter();
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
	public HarryPotter() {
		
		JPanel panel = new JPanel();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(HarryPotter.class.getResource("/POO/febrero27/imagenes/harry-potter.png")));
		setTitle("Harry Potter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 379);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Alumno");
		btnNewButton.setMnemonic('A');
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(40, 81, 166, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Profesor");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					VentanaProfesor dialog = new VentanaProfesor();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_1.setMnemonic('P');
		btnNewButton_1.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(40, 237, 166, 41);
		contentPane.add(btnNewButton_1);
		
		//FondoF fondo = new FondoF();
		//this.setContentPane(fondo);
	}
	
	public class FondoF extends JPanel{
		private Image imagen;
		
		@Override
		public void paint(Graphics g) {
			imagen = (new ImageIcon(getClass().getResource("/POO/febrero27/imagenes/fondoHarry.jpg"))).getImage();
			g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			setOpaque(false);
			super.paint(g);
		}
	}
}
