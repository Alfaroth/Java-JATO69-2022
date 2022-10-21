package model;

public class BollettaGas extends Bolletta {

	private double metriCubi;

	
	public BollettaGas(double importo, double metriCubi) {
		super(importo);
		this.metriCubi = metriCubi;
	}

	public double getMetriCubi() {
		return metriCubi;
	}

	public void setMetriCubi(double metriCubi) {
		this.metriCubi = metriCubi;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BollettaGas [Metri cubi: ");
		builder.append(metriCubi);
		builder.append(", Importo: ");
		builder.append(importo);
		// builder.append(super.toString());	// toString() della classe madre Bolletta
		builder.append("€]");
		return builder.toString();
	}
	
}