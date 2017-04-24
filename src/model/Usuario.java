package model;

public class Usuario {
	private int idUsuario;
	private String username;
	private String password;
	private int idFuncionario;
	
	public Usuario(String username, String password){
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("INSERT INTO Usuario "
	        				+ "(username, password) "
	        				+ "VALUES (?, ?);");  
	        stmt.setString(1, username);
			stmt.setString(2, password);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	}
	public int getIdUsuario() {
		return idUsuario;
	}

	public String getUsername() {
		return username;
	}
	
	public float getUsername(int idCaixa) {
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
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
}
