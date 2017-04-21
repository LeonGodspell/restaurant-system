package controller;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Funcionario {
	QuerySQL con = new QuerySQL();
	private String msg = "Erro na alteração dos valores no Banco de Dados!";
	public void cadastrarFuncionario(String name, int cpf,
			int rg, String dateNasc, int phone, int idCargo, String adress){
	    try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("INSERT INTO Dividas"
	        				+ " (price, dateVencimento, date, idFornecedor,"
	        				+ " danfe) VALUES (?,?,NOW(),?,?);");  
	        stmt.setString(1, name);
	        stmt.setInt(2, cpf);
	        stmt.setInt(3, rg);
	        stmt.setString(4, dateNasc);
	        stmt.setInt(5, phone);
	        stmt.setInt(6, idCargo);
	        stmt.setString(7, adress);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	public void editarFuncionario(String name, int cpf,
			int rg, String dateNasc, int phone, int idCargo, String adress, int idFuncionario){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Complemento SET name = ?, cpf = '?',"
	        				+ " rg = ?, dateNasc = ?, phone = ?, idCargo = ?, adress = ? WHERE idFuncionario = ?;");  
	        stmt.setString(1, name);
	        stmt.setInt(2, cpf);
	        stmt.setInt(3, rg);
	        stmt.setString(4, dateNasc);
	        stmt.setInt(5, phone);
	        stmt.setInt(6, idCargo);
	        stmt.setString(7, adress);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	public void excluirFuncionario(int idFuncionario){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("DELETE FROM Divida WHERE idFuncionario = ?;");  
	        stmt.setLong(1, idFuncionario);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	//Código abaixo só serve para pegar todos os valores
	public Object[] visualizaFuncionario(){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT * FROM Funcionario;");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) , result.getString(2), result.getString(3),
	            		result.getString(4), result.getString(5), result.getString(6), result.getString(7)
	            		, result.getString(8)} );
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
