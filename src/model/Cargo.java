package model;

public class Cargo {
	private int idCargo;
	private String cargo;

	public Cargo(){

	}
	
	public Cargo(String cargo){
		this.idCargo = idCargo;
		this.cargo = cargo;
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("INSERT INTO Cargo "
	        				+ "(cargo) "
	        				+ "VALUES (?);");  
	        stmt.setString(1, cargo);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT idCargo"
	        				+ " FROM Caixa ORDER BY idCargo DESC LIMIT 1");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) , result.getString(2) } );
			}
	        Object[] Arraylista = lista.toArray();
			this.idCargo = Integer.parseInt(Arraylista[0]);
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
	    con.close();
	}

	public int getIdCargo() {
		return idCargo;
	}

	public String getCargo() {
		return cargo;
	}

	public String getCargo(int idCargo) {
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT cargo"
	        				+ " FROM Cargo WHERE idCargo = "
							+ idCargo
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

	public void setCargo(String cargo) {
		this.cargo = cargo;
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Cargo SET cargo = ? WHERE idCargo = " + this.idCargo + ";");  
	        stmt.setString(1, cargo);
	        stmt.execute();
	        stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	
}
