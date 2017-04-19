package model;

public class Produto {
	private int idProduto;
	private String name;
	private float price;
	private int stock;
	private float lucro;
	private int idFornecedor;
	
	public Produto(int idProduto, String name, float price, int stock, float lucro,
			int idFornecedor){
		this.idProduto = idProduto;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.lucro = lucro;
		this.idFornecedor = idFornecedor;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getLucro() {
		return lucro;
	}

	public void setLucro(float lucro) {
		this.lucro = lucro;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
}
