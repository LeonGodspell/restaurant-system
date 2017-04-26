package model;

public class Complemento {
	private int idComplemento;
	private String name;
	private int stock;
	
	public Complemento(){

	}

	public Complemento(String name, int stock){
		this.name = name;
		this.stock = stock;
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("INSERT INTO Complemento "
	        				+ "(name, stock) "
	        				+ "VALUES (?, ?);");  
	        stmt.setString(1, name);
	        stmt.setInt(2, stock);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT idComplemento"
	        				+ " FROM Complemento ORDER BY idComplemento DESC LIMIT 1");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(0) } );
			}
	        Object[] Arraylista = lista.toArray();
			this.idComplemento = Integer.parseInt(Arraylista[0]);
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
	    con.close();
	}

	public int getIdComplemento() {
		return idComplemento;
	}

	public String getName() {
		return name;
	}

	public String getName(int idComplemento) {
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT name"
	        				+ " FROM Complemento WHERE idComplemento = "
							+ idComplemento
							+ "ORDER BY idCaixa DESC");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(0) } );
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

	public void setName(String name) {
		this.name = name;
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Complemento SET name = ? WHERE idComplemento = " + this.idComplemento + ";");  
	        stmt.setInt(1, name);
	        stmt.execute();
	        stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}

	public int getStock() {
		return stock;
	}

	public int getStock(int idComplemento) {
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT stock"
	        				+ " FROM Complemento WHERE idComplemento = "
							+ idComplemento
							+ "ORDER BY idCaixa DESC");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(0) } );
			}
	        Object[] Arraylista = lista.toArray();
	    	stmt.close();
	    	return Integer.parseInt(Arraylista[0]);
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
	}

	public void setStock(int stock) {
		this.stock = stock;
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Complemento SET stock = ? WHERE idComplemento = " + this.idComplemento + ";");  
	        stmt.setInt(1, stock);
	        stmt.execute();
	        stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
}
