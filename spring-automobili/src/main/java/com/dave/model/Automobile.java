package com.dave.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Automobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // ci pensa il db a gestire con auto_increment la chiave primaria
	private int id;
	private String marca;
	private String modello;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Automobile [id=");
		builder.append(id);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modello=");
		builder.append(modello);
		builder.append("]");
		return builder.toString();
	}
	
}
