package logica;

import java.util.ArrayList;

import articoli.Articolo;

public class Scontrino {

	private ArrayList<Articolo> spesa;
	
	public Scontrino() {
		this.spesa = new ArrayList<>();
	}
	
	public Scontrino(ArrayList<Articolo> spesa) {	// overload del costruttore
		this.spesa = spesa;
	}
	
	/**
	 * Aggiunge un articolo allo scontrino.
	 * @param a1 articolo da aggiungere.
	 */
	public void addArticolo(Articolo a1) {
		this.spesa.add(a1);
	}
	
	/**
	 * Restituisce la spesa totale.
	 * @return somma dei costi di ogni articolo nello scontrino.
	 */
	public double getTotale() {
		double totale = 0;
		for (Articolo articolo : spesa) {
			totale += articolo.getCosto();
		}
		return totale;
	}
	
	/**
	 * Calcola il totale di punti fedeltà ottenuti dalla spesa.
	 * @return somma dei punti fedeltà ottenuti da ogni articolo nello scontrino.
	 */
	public int getTotalePunti() {
		int totale = 0;
		for (Articolo articolo : spesa) {
			totale += articolo.getPuntiFedelta();
		}
		return totale;
	}
	
	public ArrayList<Articolo> getSpesa() {
		return spesa;
	}

	public void setSpesa(ArrayList<Articolo> spesa) {
		this.spesa = spesa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SCONTRINO\n");
		for (Articolo articolo : spesa) {
			builder.append(articolo.getNome());
			builder.append("\t");
			builder.append(articolo.getCosto() + "€");
			builder.append("\n");
		}
		builder.append("TOTALE: " + this.getTotale() + "€");
		builder.append("\n");
		builder.append("Punti fedeltà ottenuti: " + this.getTotalePunti());
		builder.append("\n");
		return builder.toString();
	}

}