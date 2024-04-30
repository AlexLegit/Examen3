package sistema;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class PanelCliente {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelCliente window = new PanelCliente();
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
	public PanelCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 91, 176));
		panel.setBounds(0, 0, 434, 473);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(313, 53, 111, 107);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Aqui va una foto");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(313, 4, 111, 38);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNCliente = new JLabel("N CLiente");
		lblNCliente.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNCliente.setBackground(new Color(238, 193, 111));
		lblNCliente.setForeground(new Color(0, 0, 0));
		lblNCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblNCliente.setBounds(7, 5, 96, 15);
		lblNCliente.setOpaque(true);
		panel_2.add(lblNCliente);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 292, 414, 140);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.setBounds(41, 443, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(171, 443, 89, 23);
		panel.add(btnEliminar);
		
		JButton btnNewButton_1_1 = new JButton("Regresar");
		btnNewButton_1_1.setBounds(301, 443, 89, 23);
		panel.add(btnNewButton_1_1);
		
		JLabel lblListadoDeClientes = new JLabel("Listado De Clientes");
		lblListadoDeClientes.setOpaque(true);
		lblListadoDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListadoDeClientes.setForeground(Color.BLACK);
		lblListadoDeClientes.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblListadoDeClientes.setBackground(new Color(238, 193, 111));
		lblListadoDeClientes.setBounds(10, 277, 414, 15);
		panel.add(lblListadoDeClientes);
		
		JLabel lblNCliente_1_3 = new JLabel("Membresia");
		lblNCliente_1_3.setOpaque(true);
		lblNCliente_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNCliente_1_3.setForeground(Color.BLACK);
		lblNCliente_1_3.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNCliente_1_3.setBackground(new Color(238, 193, 111));
		lblNCliente_1_3.setBounds(169, 212, 96, 20);
		panel.add(lblNCliente_1_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 127, 163, 20);
		panel.add(textField_1);
		
		JLabel lblNCliente_1_3_1 = new JLabel("Telefono");
		lblNCliente_1_3_1.setOpaque(true);
		lblNCliente_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNCliente_1_3_1.setForeground(Color.BLACK);
		lblNCliente_1_3_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNCliente_1_3_1.setBackground(new Color(238, 193, 111));
		lblNCliente_1_3_1.setBounds(10, 106, 96, 20);
		panel.add(lblNCliente_1_3_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 74, 163, 20);
		panel.add(textField_2);
		
		JLabel lblNCliente_1_3_2 = new JLabel("Nombre");
		lblNCliente_1_3_2.setOpaque(true);
		lblNCliente_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNCliente_1_3_2.setForeground(Color.BLACK);
		lblNCliente_1_3_2.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNCliente_1_3_2.setBackground(new Color(238, 193, 111));
		lblNCliente_1_3_2.setBounds(10, 53, 96, 20);
		panel.add(lblNCliente_1_3_2);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("NORMAL");
		chckbxNewCheckBox_2.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_2.setBackground(new Color(224, 218, 101));
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxNewCheckBox_2.setBounds(25, 246, 111, 20);
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("PLUS +");
		chckbxNewCheckBox_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxNewCheckBox_2_1.setBackground(new Color(224, 218, 101));
		chckbxNewCheckBox_2_1.setBounds(161, 245, 111, 20);
		panel.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("GOL.DEN");
		chckbxNewCheckBox_2_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxNewCheckBox_2_2.setBackground(new Color(224, 218, 101));
		chckbxNewCheckBox_2_2.setBounds(297, 245, 111, 20);
		panel.add(chckbxNewCheckBox_2_2);
		
		JLabel lblNCliente_1_3_1_1 = new JLabel("Tabla de Asistencia");
		lblNCliente_1_3_1_1.setOpaque(true);
		lblNCliente_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNCliente_1_3_1_1.setForeground(Color.BLACK);
		lblNCliente_1_3_1_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNCliente_1_3_1_1.setBackground(new Color(238, 193, 111));
		lblNCliente_1_3_1_1.setBounds(10, 158, 250, 20);
		panel.add(lblNCliente_1_3_1_1);
		
		JButton btnEliminar_1 = new JButton("Ingresar");
		btnEliminar_1.setBounds(10, 178, 250, 23);
		panel.add(btnEliminar_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1.setBounds(10, 4, 199, 38);
		panel.add(panel_2_1);
		
		JLabel lblGymrat = new JLabel("GYMrat");
		lblGymrat.setOpaque(true);
		lblGymrat.setHorizontalAlignment(SwingConstants.CENTER);
		lblGymrat.setForeground(Color.BLACK);
		lblGymrat.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblGymrat.setBackground(new Color(238, 193, 111));
		lblGymrat.setBounds(7, 5, 182, 22);
		panel_2_1.add(lblGymrat);
	}
}
