package sistema;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class PanelChecador {

    private JFrame frame;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PanelChecador window = new PanelChecador();
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
    public PanelChecador() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 465);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 128, 0));
        panel.setBounds(0, 0, 434, 426);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(128, 128, 192));
        panel_1.setBounds(123, 179, 187, 159);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Ingrese su PIN");
        lblNewLabel.setBackground(new Color(255, 255, 128));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
        lblNewLabel.setBounds(0, 11, 187, 30);
        lblNewLabel.setOpaque(true);
        panel_1.add(lblNewLabel);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(38, 66, 111, 20);
        panel_1.add(passwordField);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 128));
        panel_2.setBounds(0, 45, 434, 123);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(PanelChecador.class.getResource("/imagenes/logo1.png")));
        lblNewLabel_2.setBounds(89, 11, 250, 112);
        panel_2.add(lblNewLabel_2);
        
        JButton btnNewButton = new JButton("Acceder");
        btnNewButton.setBounds(172, 359, 89, 23);
        panel.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredPIN = new String(passwordField.getPassword());
                
                if (enteredPIN.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "PIN correcto. Acceso Concedido.");
                } else {
                    JOptionPane.showMessageDialog(frame, "PIN No Valido. Acceso denegado.");
                }
                passwordField.setText("");
            }
        });
    }
}
