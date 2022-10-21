package model;

public class Bolletta {

	protected double importo;

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