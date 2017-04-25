package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Menu_Caixa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Caixa frame = new Menu_Caixa();
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
	public Menu_Caixa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrirCaixa = new JButton("Abrir Caixa");
		btnAbrirCaixa.setBounds(21, 31, 113, 58);
		contentPane.add(btnAbrirCaixa);
		
		JButton btnNewButton = new JButton("Fechar Caixa");
		btnNewButton.setBounds(21, 100, 113, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblSaldoInicial = new JLabel("Saldo Inicial:");
		lblSaldoInicial.setBounds(201, 31, 68, 14);
		contentPane.add(lblSaldoInicial);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setBounds(201, 53, 46, 14);
		contentPane.add(lblSaldo);
		
		JLabel lblDataInicial = new JLabel("Data Inicial:");
		lblDataInicial.setBounds(201, 75, 68, 14);
		contentPane.add(lblDataInicial);
	}

}
