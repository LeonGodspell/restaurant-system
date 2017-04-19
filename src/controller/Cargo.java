package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;

public class Cargo{
	QuerySQL con = new QuerySQL();
	private String msg = "Erro na alteração dos valores no Banco de Dados!";
	public void criarCargo(String cargo){
	    try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("INSERT Cargo (cargoName) VALUES (?);");  
	        stmt.setString(1,cargo);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	public void editarCargo(String cargo, String novoCargo){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Cargo SET cargoName = '?'"
	        				+ " WHERE cargoName = '?';");  
	        stmt.setString(1,novoCargo);
	        stmt.setString(2, cargo);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	public void excluirCargo(String cargo){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("DELETE FROM Cargo WHERE cargoName = '?';");  
	        stmt.setString(1,cargo);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	
	public Object[] visualizaCargo(){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT * FROM Cargo;");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) , result.getString(2) } );
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