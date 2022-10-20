package ereditarieta;

public class BollettaGas extends Bolletta {

	double metriCubi;

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