package model;

public class Funcionario {
	private int idFuncionario;
	private String name;
	private int cpf;
	private int rg;
	private String dateNasc;
	private int phone;
	private String adress;
	private int idCargo;
	
	public Funcionario(int idFuncionario, String name, int cpf, int rg,
			String dateNasc, int phone, String adress, int idCargo){
		this.idFuncionario = idFuncionario;
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.dateNasc = dateNasc;
		this.phone = phone;
		this.adress = adress;
		this.idCargo = idCargo;
	}
	
	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getDateNasc() {
		return dateNasc;
	}

	public void setDateNasc(String dateNasc) {
		this.dateNasc = dateNasc;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
}
