package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Estabelecimento {
	QuerySQL con = new QuerySQL();
	private String msg = "Erro na alteração dos valores no Banco de Dados!";
	public void criarEstabelecimento(String name, int phone, int cnpj, String adress){
	    try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("INSERT INTO Estabelecimento"
	        				+ " (name, phone, cnpj, adress)"
	        				+ " VALUES (?,?,?,?);");  
	        stmt.setString(1,name);
	        stmt.setInt(2, phone);
	        stmt.setInt(3, cnpj);
	        stmt.setString(4, adress);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	//Modifica todos os valores da linha
	public void editarEstabelecimento(String name, int phone, int cnpj, String adress){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("UPDATE Estabelecimento SET name = '?', phone = ?,"
	        				+ " cnpj = ?, adress = '?' WHERE name = ?;");  
	        stmt.setString(1,name);
	        stmt.setInt(2, phone);
	        stmt.setInt(3, cnpj);
	        stmt.setString(4, adress);
	        stmt.setString(5, name);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	
	//Método para editar valores específicos
	public void editarEstabelecimento(String name, int phone, int cnpj, String adress,
			int[] select, int idEstabelecimento){
		String sql = "UPDATE Estabelecimento SET ";
		try {
			//For para verificar quais variáveis serão modificadas
			for(int i = 0; i < select.length; i++){
				if (select != null){
					if(select[i] == 0){
						sql += "name = '?' ";
					}
					if(select[i] == 1){
						sql += "phone = ? ";
					}
					if(select[i] == 2){
						sql += "cnpj = ? ";
					}
					if(select[i] == 3){
						sql += "adress = '?' ";
					}
				}
			}
			sql += "WHERE idEstabelecimento = ?";
			PreparedStatement stmt = con.connection.prepareStatement(sql);
			//For para inserir as variáveis(parâmetros) dentro do statement
			for(int i = 1; i <= select.length; i++){
				if (select != null){
					if(select[i] == 1){
						stmt.setString(i,name);
					}
					if(select[i] == 2){
						stmt.setInt(i,phone);
					}
					if(select[i] == 3){
						stmt.setInt(i,cnpj);
					}
					if(select[i] == 4){
						stmt.setString(i,adress);
					}
				}
			}
			stmt.setInt(select.length + 1, idEstabelecimento); 
			//select.lenght + 1 -> Última posição inserida dentro do statement mais 1 
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	
	public void excluirEstabelecimento(String name){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("DELETE FROM Estabelecimento WHERE name = ?;");  
	        stmt.setString(1,name);
	        stmt.execute();
	    	stmt.close();
	    }catch(Exception e){
	    	JOptionPane.showMessageDialog(null, msg,
	    			"Petiscaria", JOptionPane.ERROR_MESSAGE);
	    }
	    con.close();
	}
	
	public Object[] visualizaEstabelecimento(){
		try {  
	        PreparedStatement stmt = 
	        		con.connection.prepareStatement("SELECT * FROM Estabelecimento;");  
	        ResultSet result = stmt.executeQuery();
	        List <String[]> lista = new ArrayList<String[]>();
	        while( result.next() ){
	            lista.add( new String[]{ result.getString(1) , result.getString(2), result.getString(3),
	            		result.getString(4) } );
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
