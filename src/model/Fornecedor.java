package model;

public class Fornecedor {
	private int idFornecedor;
	private String name;
	private String adress;
	private int phone;
	private int cnpj;
	private float limit;
	
	public Fornecedor(int idFornecedor, String name, String adress, int phone,
			int cnpj, float limit){
		this.idFornecedor = idFornecedor;
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		this.cnpj = cnpj;
		this.limit = limit;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public float getLimit() {
		return limit;
	}

	public void setLimit(float limit) {
		this.limit = limit;
	}
}
