package com.dave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dave.entities.Babbo;
import com.dave.services.BabboService;

@RestController
@RequestMapping("api")
public class BabboREST {

	@Autowired
	private BabboService service;
	
	@GetMapping("babbi")
	public List<Babbo> getBabbi() {
		return service.trovaTutti();
	}

}
