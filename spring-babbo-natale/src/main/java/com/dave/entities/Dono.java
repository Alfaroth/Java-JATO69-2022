package com.dave.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "doni")
public class Dono {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	private int disponibilita;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "consegna_id")
	private Consegna consegna;
	
	@ManyToMany(mappedBy = "doni", fetch = FetchType.LAZY)
	private Set<Sacco> sacchi= new HashSet<>();
	
	public Dono() {
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

	public int getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(int disponibilita) {
		this.disponibilita = disponibilita;
	}

	@JsonIgnore
	public Consegna getConsegna() {
		return consegna;
	}

	public void setConsegna(Consegna consegna) {
		this.consegna = consegna;
	}

	@JsonIgnore
	public Set<Sacco> getSacchi() {
		return sacchi;
	}

	public void setSacchi(Set<Sacco> sacchi) {
		this.sacchi = sacchi;
	}
	
}
