package com.dave.entities;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sacchi")
public class Sacco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String numero;
	
	private Stato stato;
	public enum Stato {
		ASSEGNATO, PREPARAZIONE, VUOTO;
	}
	
	private LocalTime assegnato;
	private LocalTime consegnato;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "sacchi_doni", 
		joinColumns = {
				@JoinColumn(name="sacco_id", referencedColumnName = "id",
						nullable = false, updatable = false)},
		inverseJoinColumns = {
				@JoinColumn(name="dono_id", referencedColumnName = "id",
						nullable = false, updatable = false)
		})
	private Set<Dono> doni = new HashSet<>();

	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	@JoinColumn(name="babbo_id")
	private Babbo babbo;
	
	public Sacco() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public LocalTime getAssegnato() {
		return assegnato;
	}

	public void setAssegnato(LocalTime assegnato) {
		this.assegnato = assegnato;
	}

	public LocalTime getConsegnato() {
		return consegnato;
	}

	public void setConsegnato(LocalTime consegnato) {
		this.consegnato = consegnato;
	}

	@JsonIgnore
	public Set<Dono> getDoni() {
		return doni;
	}

	public void setDoni(Set<Dono> doni) {
		this.doni = doni;
	}

	@JsonIgnore
	public Babbo getBabbo() {
		return babbo;
	}

	public void setBabbo(Babbo babbo) {
		this.babbo = babbo;
	}
	
}