package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Menu_Example extends JFrame {

	private JPanel contentPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Example frame = new Menu_Example();
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
	public Menu_Example() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(301, 39, 106, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(301, 73, 106, 23);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(301, 107, 106, 23);
		contentPane.add(btnExcluir);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBounds(42, 24, 213, 206);
		contentPane.add(table_1);
	}
}
