package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login_Screen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Screen frame = new Login_Screen();
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
	public Login_Screen() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usuario:");
		lblUsurio.setBounds(235, 84, 79, 14);
		contentPane.add(lblUsurio);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login_Screen.class.getResource("/Images/Petiscaria.png")));
		label.setBounds(10, 11, 208, 240);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(307, 82, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(235, 130, 68, 14);
		contentPane.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(307, 128, 120, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(268, 198, 159, 23);
		contentPane.add(btnLogin);
		
		JButton btnEsqueciASenha = new JButton("Esqueci a senha");
		btnEsqueciASenha.setBounds(268, 228, 159, 23);
		contentPane.add(btnEsqueciASenha);
	}
}
