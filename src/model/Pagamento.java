package model;

public class Pagamento {
	private int idPagamento;
	private int idMesa;
	private int idUsuario;
	private float valPedido;
	private int idFormaPag[] = new int [3];
	private float valFormPag[] = new float[3];
	private String datePag;
	
	public Pagamento(int idPagamento, int idMesa, int idUsuario, float valPedido, int idFormPag1,
			int idFormPag2, int idFormPag3, float valFormPag1, float valFormPag2, float valFormPag3,
			String datePag){
		this.idPagamento = idPagamento;
		this.idMesa = idMesa;
		this.idUsuario = idUsuario;
		this.valPedido = valPedido;
		this.idFormaPag[0] = idFormPag1;
		this.idFormaPag[1] = idFormPag2;
		this.idFormaPag[2] = idFormPag3;
		this.valFormPag[0] = valFormPag1;
		this.valFormPag[1] = valFormPag2;
		this.valFormPag[2] = valFormPag3;
		this.datePag = datePag;
	}

	public int getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
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

	public float getValPedido() {
		return valPedido;
	}

	public void setValPedido(float valPedido) {
		this.valPedido = valPedido;
	}

	public int[] getIdFormaPag() {
		return idFormaPag;
	}

	public void setIdFormaPag(int idFormaPag,int i) {
		this.idFormaPag[i] = idFormaPag;
	}

	public float[] getValFormPag() {
		return valFormPag;
	}

	public void setValFormPag(float valFormPag, int i) {
		this.valFormPag[i] = valFormPag;
	}

	public String getDatePag() {
		return datePag;
	}

	public void setDatePag(String datePag) {
		this.datePag = datePag;
	}
	
}
