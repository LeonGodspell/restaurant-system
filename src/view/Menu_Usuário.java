package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class Menu_Usuário extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Usuário frame = new Menu_Usuário();
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
	public Menu_Usuário() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:"/* + nome*/);
		lblNome.setBounds(21, 31, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:"/* + cpf*/);
		lblCpf.setBounds(21, 56, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG:"/* + rg*/);
		lblRg.setBounds(21, 81, 46, 14);
		contentPane.add(lblRg);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:"/* + dateNasc*/);
		lblDataDeNascimento.setBounds(21, 106, 109, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblPhone = new JLabel("Phone:"/* + phone*/);
		lblPhone.setBounds(21, 131, 46, 14);
		contentPane.add(lblPhone);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:"/* + endereco*/);
		lblEndereo.setBounds(21, 156, 65, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblCargo = new JLabel("Cargo:"/* + cargo*/);
		lblCargo.setBounds(21, 181, 46, 14);
		contentPane.add(lblCargo);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(323, 31, 89, 23);
		contentPane.add(btnEditar);
	}
}
