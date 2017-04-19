package model;

public class Estabelecimento {
	private String name;
	private int phone;
	private int cnpj;
	private String adress;
	
	public Estabelecimento(String name, int phone, int cnpj, String adress){
		this.name = name;
		this.phone = phone;
		this.cnpj = cnpj;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
}
