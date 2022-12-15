package com.dave.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "babbi")
public class Babbo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	private String zona;
	
	private String trasporto;
	
	@OneToMany(mappedBy="babbo", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Set<Sacco> sacchi;

	public Babbo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getTrasporto() {
		return trasporto;
	}

	public void setTrasporto(String trasporto) {
		this.trasporto = trasporto;
	}

	@JsonIgnore
	public Set<Sacco> getSacchi() {
		return sacchi;
	}

	public void setSacchi(Set<Sacco> sacchi) {
		this.sacchi = sacchi;
	}
	
}