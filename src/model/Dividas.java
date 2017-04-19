package model;

public class Dividas {
	private int idDividas;
	private float price;
	private String dateVencimento;
	private String date;
	private int idFornecedor;
	private int danfe;
	
	public Dividas(int idDividas, float price, String dateVencimento, String date, int idFornecedor,
			int danfe){
		this.idDividas = idDividas;
		this.price = price;
		this.dateVencimento = dateVencimento;
		this.date = date;
		this.idFornecedor = idFornecedor;
		this.danfe = danfe;
	}

	public int getIdDividas() {
		return idDividas;
	}

	public void setIdDividas(int idDividas) {
		this.idDividas = idDividas;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDateVencimento() {
		return dateVencimento;
	}

	public void setDateVencimento(String dateVencimento) {
		this.dateVencimento = dateVencimento;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public int getDanfe() {
		return danfe;
	}

	public void setDanfe(int danfe) {
		this.danfe = danfe;
	}
}
