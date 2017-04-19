package model;

public class FormPagamento {
	private int idFormPag;
	private String formPag;
	private String tipoFormPag;
	
	public FormPagamento(int idFormPag, String formPag, String tipoFormPag){
		this.idFormPag = idFormPag;
		this.formPag = formPag;
		this.tipoFormPag = tipoFormPag;
	}

	public int getIdFormPag() {
		return idFormPag;
	}

	public void setIdFormPag(int idFormPag) {
		this.idFormPag = idFormPag;
	}

	public String getFormPag() {
		return formPag;
	}

	public void setFormPag(String formPag) {
		this.formPag = formPag;
	}

	public String getTipoFormPag() {
		return tipoFormPag;
	}

	public void setTipoFormPag(String tipoFormPag) {
		this.tipoFormPag = tipoFormPag;
	}
	
}
