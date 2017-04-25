package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class Menu_Mesas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Mesas frame = new Menu_Mesas();
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
	public Menu_Mesas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Mesa 1");
		btnNewButton.setBounds(21, 34, 89, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mesa 2");
		btnNewButton_1.setBounds(120, 34, 89, 60);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mesa 3");
		btnNewButton_2.setBounds(219, 34, 89, 60);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Mesa 4");
		btnNewButton_3.setBounds(21, 105, 89, 60);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Mesa 5");
		btnNewButton_4.setBounds(120, 105, 89, 60);
		contentPane.add(btnNewButton_4);
		
		JButton btnMesa = new JButton("Mesa 6");
		btnMesa.setBounds(219, 105, 89, 60);
		contentPane.add(btnMesa);
		
		JButton btnNovaMesa = new JButton("Nova Mesa");
		btnNovaMesa.setBounds(335, 34, 89, 60);
		contentPane.add(btnNovaMesa);
		
		JButton btnExcluirMesa = new JButton("Excluir");
		btnExcluirMesa.setBounds(335, 105, 89, 60);
		contentPane.add(btnExcluirMesa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(318, 11, 7, 240);
		contentPane.add(scrollPane);
	}
}
