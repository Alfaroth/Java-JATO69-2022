package com.dave.entities;

import java.time.LocalTime;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "consegne")
public class Consegna {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy="consegna", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Set<Bimbo> bimbi;
	
	@OneToMany(mappedBy="consegna", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Set<Dono> doni;
	
	@Column(columnDefinition = "TIME")
	@DateTimeFormat(iso=ISO.TIME)
	private LocalTime oraConsegna;

	public Consegna() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Bimbo> getBimbi() {
		return bimbi;
	}

	public void setBimbi(Set<Bimbo> bimbi) {
		this.bimbi = bimbi;
	}

	public Set<Dono> getDoni() {
		return doni;
	}

	public void setDoni(Set<Dono> doni) {
		this.doni = doni;
	}

	public LocalTime getOraConsegna() {
		return oraConsegna;
	}

	public void setOraConsegna(LocalTime oraConsegna) {
		this.oraConsegna = oraConsegna;
	}
	
}