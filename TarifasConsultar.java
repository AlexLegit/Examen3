package sistema2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TarifasConsultar {

	private JFrame frmTarifas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TarifasConsultar window = new TarifasConsultar();
					window.frmTarifas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TarifasConsultar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTarifas = new JFrame();
		frmTarifas.setForeground(new Color(51, 0, 204));
		frmTarifas.setTitle("TARIFAS");
		frmTarifas.setBounds(100, 100, 593, 435);
		frmTarifas.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 577, 129);
		panel.getRootPane().setLayout(null);
		frmTarifas.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tarifas");
		lblNewLabel_1.setBounds(53, 11, 231, 62);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(51, 102, 102));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 38));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TarifasConsultar.class.getResource("/imagenes/rata2.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 34));
		lblNewLabel.setBounds(385, 0, 231, 86);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("GYM--Rat");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(51, 102, 102));
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 28));
		lblNewLabel_1_2.setBounds(356, 64, 285, 86);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Increibles Tarifas a Precios  Completamente Accesibles.");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblNewLabel_3.setBounds(10, 64, 407, 40);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 153, 0));
		panel_1.setBounds(0, 129, 577, 84);
		frmTarifas.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("GENERAL");
		lblNewLabel_1_1.setBackground(new Color(102, 153, 153));
		lblNewLabel_1_1.setBackground(new Color(5, 139, 211 ));
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(0, 0, 130, 40);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lunes - Viernes               de 6 am-- 5 pm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(130, 0, 292, 24);
		lblNewLabel_2.setBackground(new Color(169, 202, 220 ));
		lblNewLabel_2.setOpaque(true);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Sabados - 8 am -- 4 pm");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(130, 23, 292, 17);
		lblNewLabel_2_1.setBackground(new Color(169, 202, 220 ));
		lblNewLabel_2_1.setOpaque(true);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("1 Mes por $200.");
		lblNewLabel_2_1_1_1_1.setOpaque(true);
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1.setBackground(new Color(182, 226, 249));
		lblNewLabel_2_1_1_1_1.setBounds(0, 35, 422, 52);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JButton btnNewButton = new JButton("Seleccionar");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnNewButton.setBounds(432, 34, 135, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(204, 153, 0));
		panel_1_1.setBounds(0, 213, 577, 90);
		frmTarifas.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Plus+");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_1.setBackground(new Color(5, 139, 211 ));
		lblNewLabel_1_1_1.setOpaque(true);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(0, 0, 130, 40);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Sabados - 7 am -- 7 pm");
		lblNewLabel_2_1_1.setOpaque(true);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBackground(new Color(169, 202, 220));
		lblNewLabel_2_1_1.setBounds(130, 16, 292, 24);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Lunes - Viernes               de 6 am-- 7 pm");
		lblNewLabel_2_2.setOpaque(true);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_2.setBackground(new Color(169, 202, 220));
		lblNewLabel_2_2.setBounds(130, 0, 292, 17);
		panel_1_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("1 Mes por $300.");
		lblNewLabel_2_1_1_1.setOpaque(true);
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBackground(new Color(182, 226, 249));
		lblNewLabel_2_1_1_1.setBounds(0, 38, 422, 52);
		panel_1_1.add(lblNewLabel_2_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Seleccionar");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnNewButton_1.setBounds(432, 28, 135, 23);
		panel_1_1.add(btnNewButton_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(255, 204, 51));
		panel_1_1_1.setBounds(0, 300, 577, 96);
		frmTarifas.getContentPane().add(panel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("GOLDEN ");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_1_1.setBackground(new Color(5, 139, 211 ));
		lblNewLabel_1_1_1_1.setOpaque(true);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(0, 0, 130, 40);
		panel_1_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("1 Mes por $450. + 1 Semana Gratuita ");
		lblNewLabel_2_1_1_1_2.setOpaque(true);
		lblNewLabel_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_2.setBackground(new Color(182, 226, 249));
		lblNewLabel_2_1_1_1_2.setBounds(0, 38, 422, 58);
		panel_1_1_1.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Sabados - 7 am -- 9 pm");
		lblNewLabel_2_1_1_2.setOpaque(true);
		lblNewLabel_2_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1_1_2.setBackground(new Color(169, 202, 220));
		lblNewLabel_2_1_1_2.setBounds(130, 16, 292, 24);
		panel_1_1_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Lunes - Viernes               de 6 am-- 9 pm");
		lblNewLabel_2_2_1.setOpaque(true);
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_2_1.setBackground(new Color(169, 202, 220));
		lblNewLabel_2_2_1.setBounds(130, 0, 292, 17);
		panel_1_1_1.add(lblNewLabel_2_2_1);
		
		JButton btnNewButton_1_1 = new JButton("Seleccionar");
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnNewButton_1_1.setBounds(432, 32, 135, 23);
		panel_1_1_1.add(btnNewButton_1_1);
		frmTarifas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
