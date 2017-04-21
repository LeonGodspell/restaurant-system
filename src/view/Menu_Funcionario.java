package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;

public class Menu_Funcionario extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Funcionario frame = new Menu_Funcionario();
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
	public Menu_Funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(307, 46, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(307, 80, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(307, 116, 89, 23);
		contentPane.add(btnExcluir);
		
		String Campos[] = new String[8];
		Campos[1] = "idFuncionario";
		Campos[2] = "name";
		Campos[3] = "cpf";
		Campos[4] = "rg";
		Campos[5] = "dateNasc";
		Campos[6] = "phone";
		Campos[7] = "idCargo";
		Campos[8] = "adress";
		table = new JTable(visualizaFuncionario(), Campos[]);
		table.setBounds(25, 29, 248, 200);
		contentPane.add(table);
	}

}
