package model;

import java.time.LocalDateTime;

public class Appuntamento {

	private Paziente paziente;
	private Stanza stanza;
	private LocalDateTime ora;
	private String argomento;
	
	public Appuntamento(Paziente paziente, Stanza stanza, LocalDateTime ora, String argomento) {
		super();
		this.paziente = paziente;
		this.stanza = stanza;
		this.ora = ora;
		this.argomento = argomento;
	}
	
	public Paziente getPaziente() {
		return paziente;
	}
	
	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}
	
	public Stanza getStanza() {
		return stanza;
	}
	
	public void setStanza(Stanza stanza) {
		this.stanza = stanza;
	}
	
	public LocalDateTime getOra() {
		return ora;
	}
	
	public void setOra(LocalDateTime ora) {
		this.ora = ora;
	}
	
	public String getArgomento() {
		return argomento;
	}
	
	public void setArgomento(String argomento) {
		this.argomento = argomento;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("APPUNTAMENTO\n");
		builder.append("Paziente: ");
		builder.append(paziente + "\n");
		builder.append("Stanza: ");
		builder.append(stanza + "\n");
		builder.append("Ora: ");
		builder.append(ora + "\n");
		builder.append("Argomento: ");
		builder.append(argomento+"\n");
		return builder.toString();
	}
	
}