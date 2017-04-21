package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Caixa {
	QuerySQL con = new QuerySQL();
	private String msg = "Erro na alteração dos valores no Banco de Dados!";
	public void abrirCaixa(float saldoInicial){
	    try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("INSERT INTO Caixa "
	        				+ "(saldoInicial, dateInicial) "
	        				+ "VALUES (?,NOW());");  
	        stmt.setFloat(1,saldoInicial);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	public void fecharCaixa(String idCaixa, float saldoFinal){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Caixa SET saldoFinal = ?, dateFinal = NOW(), lucroFinal = (? - saldoInicial) WHERE idCaixa = '?';");  
	        stmt.setFloat(1,saldoFinal);
	        stmt.setFloat(2,saldoFinal);
	        stmt.setString(3, idCaixa);
	        stmt.execute();
	        stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	//Código abaixo só serve para pegar todos os valores
	public Object[] visualizaCaixa(){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT saldoInicial, saldoFinal, lucroFinal, dateInicial, dateFinal"
	        				+ " FROM Caixa ORDER BY idCaixa DESC LIMIT 1");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) , result.getString(2) ,
	            		result.getString(3) ,	result.getString(4), result.getString(5) } );
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
	public Object[] visualizaCaixa(String select){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT " 
	        				+ select
	        				+ " FROM Caixa ORDER BY idCaixa DESC LIMIT 1");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) } );
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
