package appuntamenti;

import java.time.LocalDate;
import java.time.LocalTime;

import elementi.Persona;
import elementi.Stanza;

public class Appuntamento {

	private LocalDate data;
	private LocalTime ora;
	private String argomento;
	
	private Persona persona;
	private Stanza stanza;
	
	public void setAppuntamento(Persona persona, Stanza stanza) {
		
		this.persona = persona;
		this.stanza = stanza;
		
		
		
	}
	
}