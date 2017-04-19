package model;

public class Caixa {
	private int idCaixa;
	private float saldoInicial;
	private float saldoFinal;
	private String dateInicial;
	private String dateFinal;
	
	public Caixa(int idCaixa, float saldoInicial, float saldoFinal,	String dateInicial,
			String dateFinal){
		this.idCaixa = idCaixa;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
		this.dateInicial = dateInicial;
		this.dateFinal = dateFinal;
	}

	public int getIdCaixa() {
		return idCaixa;
	}

	public void setIdCaixa(int idCaixa) {
		this.idCaixa = idCaixa;
	}

	public float getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(float saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public float getSaldoFinal() {
		return saldoFinal;
	}

	public void setSaldoFinal(float saldoFinal) {
		this.saldoFinal = saldoFinal;
	}

	public String getDateInicial() {
		return dateInicial;
	}

	public void setDateInicial(String dateInicial) {
		this.dateInicial = dateInicial;
	}

	public String getDateFinal() {
		return dateFinal;
	}

	public void setDateFinal(String dateFinal) {
		this.dateFinal = dateFinal;
	}
	
}
