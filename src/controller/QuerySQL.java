package controller;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class QuerySQL{
	public Connection connection;
	public QuerySQL(){
		this.connection = new ConnectionFactory().getConnection();
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
