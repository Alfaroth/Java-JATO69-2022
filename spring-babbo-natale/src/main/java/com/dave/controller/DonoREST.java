package com.dave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dave.entities.Dono;
import com.dave.services.DonoService;

@RestController
@RequestMapping("api")
public class DonoREST {

	@Autowired
	private DonoService service;
	
	@GetMapping("doni")
	public List<Dono> getDoni() {
		return service.trovaTutti();
	}

}
