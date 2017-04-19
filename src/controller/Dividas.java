package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Dividas {
	QuerySQL con = new QuerySQL();
	private String msg = "Erro na alteração dos valores no Banco de Dados!";
	public void criarDivida(float price, String dateVencimento,
			int idFornecedor, long danfe){
	    try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("INSERT Dividas"
	        				+ " (price, dateVencimento, date, idFornecedor,"
	        				+ " danfe) VALUES (?,?,NOW(),?,?);");  
	        stmt.setFloat(1,price);
	        stmt.setString(2, dateVencimento);
	        stmt.setInt(3, idFornecedor);
	        stmt.setLong(4, danfe);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	public void editarDivida(float price, String dateVencimento,int idFornecedor, long danfe){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Complemento SET price = ?, dateVencimento = '?',"
	        				+ " idFornecedor = ?, danfe = ? WHERE danfe = ?;");  
	        stmt.setFloat(1,price);
	        stmt.setString(2, dateVencimento);
	        stmt.setInt(3, idFornecedor);
	        stmt.setLong(4, danfe);
	        stmt.setLong(5, danfe);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	public void excluirDivida(long danfe){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("DELETE FROM Divida WHERE danfe = ?;");  
	        stmt.setLong(1,danfe);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	
	public Object[] visualizaComplemento(){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT * FROM Divida;");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) , result.getString(2), result.getString(3),
	            		result.getString(4), result.getString(5), result.getString(6) } );
	        }
	        Object[] Arraylista = lista.toArray();
	    	stmt.close();
	    	return Arraylista;
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
	    
	}
}
