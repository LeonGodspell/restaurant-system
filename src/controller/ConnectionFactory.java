package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionFactory {
	private final static String servername = "localhost:3306/";    //caminho do servidor do BD
	private final static String database = "petiscaria";        //nome do seu banco de dados
	private final static String username = "root";        //nome de um usuário de seu BD      
	private final static String password = "qwe123";      //sua senha de acesso
	static Connection con = null;
	public static Connection AbrirConexao(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://"+servername+database;
			con = DriverManager.getConnection(url,username,password);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados!","Petiscaria", JOptionPane.ERROR_MESSAGE);
			e.getMessage();
		}
		return con;
		
	}

	public Connection getConnection() {
		return con;
	}
}
