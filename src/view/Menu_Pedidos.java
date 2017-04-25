package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class Menu_Pedidos extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Pedidos frame = new Menu_Pedidos();
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
	public Menu_Pedidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeProdutos = new JLabel("Lista de Pedidos:");
		lblListaDeProdutos.setBounds(10, 40, 95, 14);
		contentPane.add(lblListaDeProdutos);
		
		table = new JTable();
		table.setBounds(10, 67, 281, 173);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(318, 63, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(318, 97, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(318, 131, 89, 23);
		contentPane.add(btnExcluir);
	}

}
