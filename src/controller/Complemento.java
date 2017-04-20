package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Complemento {
	QuerySQL con = new QuerySQL();
	private String msg = "Erro na alteração dos valores no Banco de Dados!";
	public void criarComplemento(String complemento, int stock){
	    try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("INSERT INTO Complemento"
	        				+ " (name, stock)"
	        				+ " VALUES (?,?);");  
	        stmt.setString(1,complemento);
	        stmt.setInt(2, stock);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	public void editarComplemento(String complemento, int stock,  String novoComplemento){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Complemento SET name = '?', stock = ?"
	        				+ " WHERE name = '?';");  
	        stmt.setString(1,novoComplemento);
	        stmt.setInt(2, stock);
	        stmt.setString(3, complemento);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	public void excluirComplemento(String complemento){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("DELETE FROM Complemento WHERE name = '?';");  
	        stmt.setString(1,complemento);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	//Código abaixo só serve para pegar todos os valores
	/*public Object[] visualizaComplemento(){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT * FROM Complemento;");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) , result.getString(2), result.getString(3) } );
	        }
	        Object[] Arraylista = lista.toArray();
	    	stmt.close();
	    	return Arraylista;
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
	    
	}*/
}
