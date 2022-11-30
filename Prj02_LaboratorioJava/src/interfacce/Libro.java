package interfacce;

public class Libro implements Comparable<Libro> {

	int id;
	String titolo;
	double prezzo;
	int idEditore;
	
	public Libro(int id, String titolo) {
		super();
		this.id = id;
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [id=");
		builder.append(id);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", idEditore=");
		builder.append(idEditore);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Libro l) {
		return this.id - l.id;
	}

}
