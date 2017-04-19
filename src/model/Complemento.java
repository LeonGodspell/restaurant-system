package model;

public class Complemento {
	private int idComplemento;
	private String name;
	private int stock;
	
	public Complemento(int idComplemento, String name, int stock){
		this.idComplemento = idComplemento;
		this.name = name;
		this.stock = stock;
	}

	public int getIdComplemento() {
		return idComplemento;
	}

	public void setIdComplemento(int idComplemento) {
		this.idComplemento = idComplemento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
