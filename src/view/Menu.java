package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 329);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNovo = new JMenu("Novo");
		menuBar.add(mnNovo);
		
		JMenuItem mntmPedido = new JMenuItem("Pedido");
		mnNovo.add(mntmPedido);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mnNovo.add(mntmProduto);
		
		JMenuItem mntmPagamento = new JMenuItem("Pagamento");
		mnNovo.add(mntmPagamento);
		
		JMenu mnConfiguraes = new JMenu("Configurações");
		menuBar.add(mnConfiguraes);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Menu.class.getResource("/Images/icon1.png")));
		label.setBounds(44, 23, 61, 84);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Menu.class.getResource("/Images/icon2.png")));
		label_1.setBounds(149, 23, 78, 84);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Menu.class.getResource("/Images/icon3.png")));
		label_2.setBounds(270, 23, 93, 84);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Menu.class.getResource("/Images/icon4.png")));
		label_3.setBounds(389, 23, 85, 84);
		contentPane.add(label_3);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(44, 119, 66, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblFuncionrios = new JLabel("Funcion\u00E1rios");
		lblFuncionrios.setBounds(137, 119, 98, 14);
		contentPane.add(lblFuncionrios);
		
		JLabel lblProdutos = new JLabel("Produtos");
		lblProdutos.setBounds(280, 119, 83, 14);
		contentPane.add(lblProdutos);
		
		JLabel lblCaixa = new JLabel("Caixa");
		lblCaixa.setBounds(399, 119, 46, 14);
		contentPane.add(lblCaixa);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Menu.class.getResource("/Images/icon5.png")));
		label_4.setBounds(33, 138, 85, 84);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Menu.class.getResource("/Images/icon6.png")));
		label_5.setBounds(160, 145, 67, 84);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Menu.class.getResource("/Images/icon7.png")));
		label_6.setBounds(270, 145, 93, 84);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(Menu.class.getResource("/Images/icon8.png")));
		label_7.setBounds(409, 138, 61, 84);
		contentPane.add(label_7);
		
		JLabel lblMesas = new JLabel("Mesas");
		lblMesas.setBounds(59, 231, 46, 14);
		contentPane.add(lblMesas);
		
		JLabel lblRelatrios = new JLabel("Relat\u00F3rios");
		lblRelatrios.setBounds(149, 231, 78, 14);
		contentPane.add(lblRelatrios);
		
		JLabel lblFornecedores = new JLabel("Fornecedores");
		lblFornecedores.setBounds(270, 231, 98, 14);
		contentPane.add(lblFornecedores);
		
		JLabel lblPagamentos = new JLabel("Pagamentos");
		lblPagamentos.setBounds(395, 234, 93, 14);
		contentPane.add(lblPagamentos);
	}
}
