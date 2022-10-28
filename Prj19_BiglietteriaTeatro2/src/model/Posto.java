package model;

public class Posto {

	private int numero;
	private String tipo;
	private boolean disponibile;
	
	public Posto(int numero, String tipo) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.disponibile = true;
	}
	
	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		if (disponibile) {	
			builder.append("[ ]");	
		} else {
			builder.append("[*]");	
		}
		
		return builder.toString();
		
	}
	
}
