package com.dave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dave.entities.Consegna;
import com.dave.services.ConsegnaService;

@RestController
@RequestMapping("api")
public class ConsegnaREST {

	@Autowired
	private ConsegnaService service;
	
	@GetMapping("consegne")
	public List<Consegna> getConsegne() {
		return service.trovaTutti();
	}
	
	@GetMapping("bimbidonisacchi")
	public String[] getQuelleCoseLa() {
		return service.trovaBimbiDoniSacchi();
	}

}
