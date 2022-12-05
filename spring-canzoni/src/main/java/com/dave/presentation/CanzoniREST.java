package com.dave.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dave.entities.Canzone;
import com.dave.repos.CanzoneRepo;

@RestController
@RequestMapping("api")
public class CanzoniREST {
	
	@Autowired
	CanzoneRepo repo;

	@GetMapping("test")
	@CrossOrigin
	public List<Canzone> hello() {	
		return repo.findAll();	
	}
	
}