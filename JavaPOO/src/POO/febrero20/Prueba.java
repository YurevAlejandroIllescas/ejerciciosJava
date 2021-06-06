package POO.febrero20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba extends JFrame {

	private JPanel contentPane;
	private JTextField fNum1;
	private JTextField fNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
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
	public Prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Num 1");
		lblNewLabel.setBounds(10, 22, 93, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num 2");
		lblNewLabel_1.setBounds(10, 67, 93, 14);
		panel.add(lblNewLabel_1);
		
		fNum1 = new JTextField();
		fNum1.setBounds(86, 19, 86, 20);
		panel.add(fNum1);
		fNum1.setColumns(10);
		
		fNum2 = new JTextField();
		fNum2.setBounds(86, 64, 86, 20);
		panel.add(fNum2);
		fNum2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(10, 166, 73, 14);
		panel.add(lblNewLabel_2);
		
		JLabel resultado = new JLabel("");
		resultado.setBounds(73, 166, 86, 14);
		panel.add(resultado);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(169, 156, 110, 14);
		panel.add(lblNewLabel_3);
		
		JLabel resultadoR = new JLabel("");
		resultadoR.setBounds(191, 166, 46, 14);
		panel.add(resultadoR);
		
		
		JButton SUMAR = new JButton("SUMAR");
		SUMAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float temp1 = Float.parseFloat(fNum1.getText());
				float temp2 = Float.parseFloat(fNum2.getText());
				float tempS = temp1 + temp2;
					
				String sTemp = String.valueOf(tempS);
				resultado.setText(sTemp);
							
			}
		});
		SUMAR.setBounds(27, 122, 89, 23);
		panel.add(SUMAR);
		
		JButton btnNewButton = new JButton("RESTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float temp1 = Float.parseFloat(fNum1.getText());
				float temp2 = Float.parseFloat(fNum2.getText());
				float tempS = temp1 - temp2;
				
				String sTemp = String.valueOf(tempS);
				resultadoR.setText(sTemp);
			}
		});
		btnNewButton.setBounds(126, 122, 89, 23);
		panel.add(btnNewButton);
		
		JLabel resultadoM = new JLabel("");
		resultadoM.setBounds(255, 166, 46, 14);
		panel.add(resultadoM);
		
		JLabel resultadoD = new JLabel("");
		resultadoD.setBounds(360, 166, 46, 14);
		panel.add(resultadoD);
		
		JButton btnNewButton_1 = new JButton("MULTIPLICAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float temp1 = Float.parseFloat(fNum1.getText());
				float temp2 = Float.parseFloat(fNum2.getText());
				float tempS = temp1 * temp2;
				
				String sTemp = String.valueOf(tempS);
				resultadoM.setText(sTemp);
			}
		});
		btnNewButton_1.setBounds(225, 122, 100, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DIVIDIR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float temp1 = Float.parseFloat(fNum1.getText());
				float temp2 = Float.parseFloat(fNum2.getText());
				
				if(temp2 > 0 || temp1 > 0 ) {
					float tempS = temp1 / temp2;
					String sTemp = String.valueOf(tempS);
					resultadoD.setText(sTemp);
					
				} else {
					float tempS = 0;
					String sTemp = String.valueOf(tempS);
					resultadoD.setText(sTemp);
				}
				
			}
		});
		btnNewButton_2.setBounds(335, 122, 89, 23);
		panel.add(btnNewButton_2);
		
		
		
		
	}
}
