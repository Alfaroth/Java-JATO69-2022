package com.dave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dave.entities.Bimbo;
import com.dave.services.BimboService;

@RestController
@RequestMapping("api")
public class BimboREST {

	@Autowired
	private BimboService service;
	
	@GetMapping("bimbi")
	public List<Bimbo> getBimbi() {
		return service.trovaTutti();
	}

}
