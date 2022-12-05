package advanced;

public class Vestito {

	String tipo;
	double prezzo;
	Colore colore;
	Taglia taglia;
	
	public Vestito(String tipo, double prezzo, Taglia taglia) {
		this.tipo = tipo;
		this.prezzo = prezzo;
		this.taglia = taglia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vestito [tipo=");
		builder.append(tipo);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", colore=");
		builder.append(colore);
		builder.append(", taglia=");
		builder.append(taglia);
		builder.append("]");
		return builder.toString();
	}

}
