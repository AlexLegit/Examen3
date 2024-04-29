package sistema2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Tarifas2 {

	private static final boolean True = false;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarifas2 window = new Tarifas2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tarifas2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(213, 138, 55));
		panel.setBounds(10, 11, 414, 425);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 86, 31));
		panel_1.setBounds(10, 11, 394, 62);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tarifas De Clientes");
		lblNewLabel.setBounds(103, 5, 188, 26);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBackground(new Color(128, 255, 255));
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(66, 375, 108, 24);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Crear");
		btnNewButton_1.setBounds(240, 375, 108, 24);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenido al Menu de Tarifas de Clientes");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 72, 394, 36);
		lblNewLabel_1.setBackground(new Color(182, 226, 249));
		lblNewLabel_1.setOpaque(true);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(79, 208, 56, 41);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 0, 56, 41);
		panel_2.add(lblNewLabel_2);
	}
}
