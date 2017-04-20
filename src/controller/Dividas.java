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
	        		con.connection.prepareStatement("INSERT INTO Dividas"
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
	//Modifica todos os valores da linha
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
	//Método para editar valores específicos
		public void editarDivida(float price, String dateVencimento,int idFornecedor, long danfe,
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
	//Código abaixo só serve para pegar todos os valores
	/*public Object[] visualizaDivida(){
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
	    
	}*/
}
