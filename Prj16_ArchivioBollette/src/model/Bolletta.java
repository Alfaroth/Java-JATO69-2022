package model;

public class Bolletta {

	protected double importo;	// può essere vista dalle altre classi dello stesso package o dalle sottoclassi di Bolletta

	public Bolletta(double importo) {
		this.importo = importo;
	}
	
	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bolletta [Importo: ");
		builder.append(importo);
		builder.append("€]");
		return builder.toString();
	}
	
}