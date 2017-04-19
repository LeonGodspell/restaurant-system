package model;

public class StatusPedido {
	private int idStatusPedido;
	private String statusName;
	
	public StatusPedido(int idStatusPedido, String statusName){
		this.idStatusPedido = idStatusPedido;
		this.statusName = statusName;
	}

	public int getIdStatusPedido() {
		return idStatusPedido;
	}

	public void setIdStatusPedido(int idStatusPedido) {
		this.idStatusPedido = idStatusPedido;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
}
