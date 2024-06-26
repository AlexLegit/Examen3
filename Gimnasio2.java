package sistema2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Gimnasio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gimnasio2 frame = new Gimnasio2();
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
	public Gimnasio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 565);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout());
		cardLayout = (CardLayout) contentPane.getLayout();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(251, 175, 106));
		panel.setBounds(0, 0, 454, 518);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("rata GYM");
		lblNewLabel.setBounds(200, -13, 175, 117);
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		panel.add(lblNewLabel);

		JLabel img = new JLabel("");
		img.setBounds(33, 78, 415, 440);
		img.setIcon(new ImageIcon(Gimnasio2.class.getResource("/imagenes/rata.png")));
		panel.add(img);

		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setBounds(166, 445, 118, 39);
		btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 9));
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cardLayout.show(contentPane, "Inicio");
			}
		});
		panel.add(btnNewButton);

		Inicio2 inicioSesion = new Inicio2(contentPane);
		Menu2 menuPanel = new Menu2(contentPane);
		Clientes2 clientesPanel = new Clientes2(contentPane);
		Cliente2 clientePane = new Cliente2(contentPane);
		CrearUsuario2 crearUsuarioPane = new CrearUsuario2(contentPane);
	
	

		contentPane.add(inicioSesion, "Inicio");
		contentPane.add(menuPanel, "Menu");
		contentPane.add(clientesPanel, "Clientes");
		contentPane.add(clientePane, "Cliente");
		contentPane.add(crearUsuarioPane, "CrearUsuario");
	}

	public void showInicioPanel() {
		cardLayout.show(contentPane, "Inicio");
	}

	public void showMenuPanel() {
		cardLayout.show(contentPane, "Menu");
	}

	public void showClientesPanel() {
		cardLayout.show(contentPane, "Clientes");
	}

	public void showUusarioPane() {
		cardLayout.show(contentPane, "Cliente");
	}
	
	public void showCrearUsuario() {
	    cardLayout.show(contentPane, "CrearUsuario");
	}
	

}
