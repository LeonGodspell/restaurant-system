package model;

public class Pedidos {
	private int idPedido;
	private int idProduto;
	private int qtdProduto;
	private float valProduto;
	private int idComplemento;
	private String date;
	private int idMesa;
	private int idUsuario;
	private int idStatusPedido;
	
	public Pedidos(int idPedido, int idProduto, int qtdProduto, float valProduto, int idComplemento,
			String date, int idMesa, int idUsuario, int idStatusPedido){
		this.idPedido = idPedido;
		this.idProduto = idProduto;
		this.qtdProduto = qtdProduto;
		this.valProduto = valProduto;
		this.idComplemento = idComplemento;
		this.date = date;
		this.idMesa = idMesa;
		this.idUsuario = idUsuario;
		this.idStatusPedido = idStatusPedido;
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public float getValProduto() {
		return valProduto;
	}
	public void setValProduto(float valProduto) {
		this.valProduto = valProduto;
	}
	public int getIdComplemento() {
		return idComplemento;
	}
	public void setIdComplemento(int idComplemento) {
		this.idComplemento = idComplemento;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdStatusPedido() {
		return idStatusPedido;
	}
	public void setIdStatusPedido(int idStatusPedido) {
		this.idStatusPedido = idStatusPedido;
	}
}
