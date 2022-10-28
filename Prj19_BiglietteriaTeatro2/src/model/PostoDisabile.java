package model;

public class PostoDisabile extends Posto {

	private String disabilita;
	
	public PostoDisabile(int numero, String tipo, String disabilita) {
		super(numero, tipo);
		this.disabilita = disabilita;
	}

	public String getDisabilita() {
		return disabilita;
	}
 
	public void setDisabilita(String disabilita) {
		this.disabilita = disabilita;
	}
 
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		if (isDisponibile()) {	
			builder.append("[D]");	
		} else {
			builder.append("[D*]");	
		}
		
		return builder.toString();
		
	}
	
}
