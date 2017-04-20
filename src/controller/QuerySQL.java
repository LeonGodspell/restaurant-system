package controller;

import java.sql.Connection;
import java.sql.SQLException;

public class QuerySQL{
	public Connection connection;
	public QuerySQL(){
		new ConnectionFactory();
		this.connection = ConnectionFactory.AbrirConexao();
	}
	public void close() {
		// TODO Auto-generated method stub
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
