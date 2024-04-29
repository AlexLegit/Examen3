package sistema2;

import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Menu;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu2 extends JPanel {
	private JPanel contentPane;
	private CardLayout cardLayout;
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Menu2(JPanel cambio) {
		setLayout(null);

		contentPane = cambio;
		cardLayout = (CardLayout) cambio.getLayout();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 456, 583);
		add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 456, 121);
		panel.add(panel_1);

		JLabel img = new JLabel("");
		panel_1.add(img);
		img.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/rata2.png")));

		JLabel lblNewLabel = new JLabel("Rata GYM");
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Unispace", Font.PLAIN, 30));

		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Clientes");
			}
		});
		btnNewButton.setBackground(new Color(44, 168, 172));
		btnNewButton.setBounds(165, 206, 126, 34);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Tarifas");
		btnNewButton_1.setBackground(new Color(44, 168, 172));
		btnNewButton_1.setBounds(164, 295, 128, 34);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Checador");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(166, 385, 123, 34);
		panel.add(btnNewButton_2);

	}
}
