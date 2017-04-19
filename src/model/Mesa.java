package model;

public class Mesa {
	private int idMesa;
	private int statusMesa;
	
	public Mesa(int idMesa, int statusMesa){
		this.idMesa = idMesa;
		this.statusMesa = statusMesa;
	}

	public int getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}

	public int getStatusMesa() {
		return statusMesa;
	}

	public void setStatusMesa(int statusMesa) {
		this.statusMesa = statusMesa;
	}
}
