package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Edit_Produto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit_Produto frame = new Edit_Produto();
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
	public Edit_Produto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(21, 31, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEstoque = new JLabel("Pre\u00E7o:");
		lblEstoque.setBounds(21, 56, 46, 14);
		contentPane.add(lblEstoque);
		
		JLabel lblEstoque_1 = new JLabel("Estoque:");
		lblEstoque_1.setBounds(21, 81, 46, 14);
		contentPane.add(lblEstoque_1);
		
		JLabel lblNewLabel = new JLabel("Lucro:");
		lblNewLabel.setBounds(21, 106, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(140, 28, 109, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 53, 109, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 78, 109, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 103, 109, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(317, 27, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(317, 57, 89, 23);
		contentPane.add(btnNewButton);
	}

}
