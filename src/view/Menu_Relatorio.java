package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class Menu_Relatorio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Relatorio frame = new Menu_Relatorio();
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
	public Menu_Relatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGerarRelatrio = new JLabel("Gerar Relat\u00F3rio");
		lblGerarRelatrio.setBounds(169, 39, 79, 14);
		contentPane.add(lblGerarRelatrio);
		
		JSpinner spinner = new JSpinner(/* Objeto gerado pelo controller com as datas salvas*/);
		spinner.setBounds(169, 64, 79, 20);
		contentPane.add(spinner);
		
		JButton btnGerar = new JButton("Gerar");
		btnGerar.setBounds(169, 95, 79, 23);
		contentPane.add(btnGerar);
	}
}
