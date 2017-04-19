package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main_Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Menu frame = new Main_Menu();
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
	public Main_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main_Menu.class.getResource("/Images/icon1.png")));
		label.setBounds(29, 11, 61, 84);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Main_Menu.class.getResource("/Images/icon2.png")));
		label_1.setBounds(120, 11, 78, 84);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Main_Menu.class.getResource("/Images/icon3.png")));
		label_2.setBounds(221, 11, 93, 84);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Main_Menu.class.getResource("/Images/icon4.png")));
		label_3.setBounds(324, 11, 85, 84);
		contentPane.add(label_3);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(39, 106, 46, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblFuncionrios = new JLabel("Funcion\u00E1rios");
		lblFuncionrios.setBounds(120, 106, 78, 14);
		contentPane.add(lblFuncionrios);
		
		JLabel lblProdutos = new JLabel("Produtos");
		lblProdutos.setBounds(241, 106, 61, 14);
		contentPane.add(lblProdutos);
		
		JLabel lblCaixa = new JLabel("Caixa");
		lblCaixa.setBounds(350, 106, 46, 14);
		contentPane.add(lblCaixa);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Main_Menu.class.getResource("/Images/icon5.png")));
		label_4.setBounds(20, 131, 85, 84);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Main_Menu.class.getResource("/Images/icon6.png")));
		label_5.setBounds(131, 131, 67, 84);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Main_Menu.class.getResource("/Images/icon7.png")));
		label_6.setBounds(221, 131, 93, 84);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(Main_Menu.class.getResource("/Images/icon8.png")));
		label_7.setBounds(335, 131, 61, 84);
		contentPane.add(label_7);
		
		JLabel lblMesas = new JLabel("Mesas");
		lblMesas.setBounds(44, 226, 46, 14);
		contentPane.add(lblMesas);
		
		JLabel lblRelatrios = new JLabel("Relat\u00F3rios");
		lblRelatrios.setBounds(137, 226, 61, 14);
		contentPane.add(lblRelatrios);
		
		JLabel lblFornecedores = new JLabel("Fornecedores");
		lblFornecedores.setBounds(231, 226, 83, 14);
		contentPane.add(lblFornecedores);
		
		JLabel lblPagamentos = new JLabel("Pagamentos");
		lblPagamentos.setBounds(335, 226, 74, 14);
		contentPane.add(lblPagamentos);
	}

}
