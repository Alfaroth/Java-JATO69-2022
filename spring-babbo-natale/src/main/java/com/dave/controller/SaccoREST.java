package com.dave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dave.entities.Sacco;
import com.dave.services.SaccoService;

@RestController
@RequestMapping("api")
public class SaccoREST {

	@Autowired
	private SaccoService service;
	
	@GetMapping("sacchi")
	public List<Sacco> getSacchi() {
		return service.trovaTutti();
	}

}
