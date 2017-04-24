package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Caixa {
	QuerySQL con = new QuerySQL();
	private String msg = "Erro na alteração dos valores no Banco de Dados!";
	private int idCaixa;
	private float saldoInicial;
	private float saldoFinal;
	private String dateInicial;
	private String dateFinal;
	
	public Caixa(float saldoInicial) {
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
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT idCaixa, dateInicial"
	        				+ " FROM Caixa ORDER BY idCaixa DESC LIMIT 1");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) , result.getString(2) } );
			}
	        Object[] Arraylista = lista.toArray();
			this.idCaixa = Integer.parseInt(Arraylista[0]);
			this.dateInicial = Arraylista[1];
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
	    con.close();
		this.saldoInicial = saldoInicial;	
	}
	
	public Caixa(int idCaixa, float saldoInicial, float saldoFinal,	String dateInicial,
			String dateFinal){
		this.idCaixa = idCaixa;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
		this.dateInicial = dateInicial;
		this.dateFinal = dateFinal;
	}
	
	public getCaixa() {
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
	
	public getFullCaixa() {
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT saldoInicial, saldoFinal, lucroFinal, dateInicial, dateFinal"
	        				+ " FROM Caixa ORDER BY idCaixa DESC");  
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
	
	public int getIdCaixa() {
		return idCaixa;
	}

	public float getSaldoInicial() {
		return saldoInicial;
	}
	
	public float getSaldoInicial(int idCaixa) {
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT saldoInicial"
	        				+ " FROM Caixa WHICH idCaixa = "
							+ idCaixa
							+ "ORDER BY idCaixa DESC");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) } );
			}
	        Object[] Arraylista = lista.toArray();
	    	stmt.close();
	    	return Float.parseFloat(Arraylista[0]);
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
	}

	public void setSaldoInicial(float saldoInicial) {
		this.saldoInicial = saldoInicial;
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Caixa SET saldoInicial = ? WHERE idCaixa = " + this.idCaixa + ";");  
	        stmt.setFloat(1,saldoInicial);
	        stmt.execute();
	        stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}

	public float getSaldoFinal() {
		return saldoFinal;
	}
	
	public float getSaldoFinal(int idCaixa) {
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT saldoFinal"
	        				+ " FROM Caixa WHICH idCaixa = "
							+ idCaixa
							+ "ORDER BY idCaixa DESC");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) } );
			}
	        Object[] Arraylista = lista.toArray();
	    	stmt.close();
	    	return Float.parseFloat(Arraylista[0]);
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
	}


	public String getDateInicial() {
		return dateInicial;
	}
	
	public String getDateInicial(int idCaixa) {
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT dateInicial"
	        				+ " FROM Caixa WHICH idCaixa = "
							+ idCaixa
							+ "ORDER BY idCaixa DESC");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) } );
			}
	        Object[] Arraylista = lista.toArray();
	    	stmt.close();
	    	return Arraylista[0];
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
	}

	public void setDateInicial(String dateInicial) {
		this.dateInicial = dateInicial;
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Caixa SET dateInicial = ? WHERE idCaixa = " + this.idCaixa + ";");  
	        stmt.setString(1,dateInicial);
	        stmt.execute();
	        stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}

	public String getDateFinal() {
		return dateFinal;
	}
	
	public String getDateFinal(int idCaixa) {
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT dateFinal"
	        				+ " FROM Caixa WHICH idCaixa = "
							+ idCaixa
							+ "ORDER BY idCaixa DESC");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) } );
			}
	        Object[] Arraylista = lista.toArray();
	    	stmt.close();
	    	return Arraylista[0];
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
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
	
}
