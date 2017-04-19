package model;

public class Usuario {
	private int idUsuario;
	private String username;
	private String password;
	private int idFuncionario;
	
	public Usuario(int idUsuario, String username, String password, int idFuncionario){
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		this.idFuncionario = idFuncionario;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsername() {
		return username;
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
