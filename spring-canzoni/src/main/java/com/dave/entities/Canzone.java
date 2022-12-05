package com.dave.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "canzoni")
public class Canzone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // lascio che sia il db a occuparsi dell'id
	private int id;
	private String titolo;
	private String autore;
	private String genere;
	private int anno;
	
	public Canzone(int id, String titolo, String autore, String genere, int anno) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
		this.anno = anno;
	} 

	// se metto un costruttore custom, DEVO mettere anche un costruttore vuoto per Spring
	public Canzone() { // costruttore senza parametri utilizzato da Spring 
		System.out.println("Oggetto Canzone costruito da Spring.");
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public int getAnno() {
		return anno;
	}
	
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Canzone [id=");
		builder.append(id);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", autore=");
		builder.append(autore);
		builder.append(", genere=");
		builder.append(genere);
		builder.append(", anno=");
		builder.append(anno);
		builder.append("]");
		return builder.toString();
	}
	
}