package com.dave.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dave.entities.Canzone;
import com.dave.repos.CanzoneRepo;

@Controller
@RequestMapping("")
public class CanzoniMVC {

	@Autowired
	CanzoneRepo repo;
	
	@GetMapping("test")
	public String hello(Model m) {
		List<Canzone> canzoni = repo.findAll();
		m.addAttribute("canzoni", canzoni); // aggiungo la canzone al modello (come servlet setAttribute)
		return "song";
	}
	
	@GetMapping("autore/{autore}")
	public String hello1(@PathVariable("autore") String autore, Model m) {
		List<Canzone> canzoni = repo.findByAutoreLike(autore);
		m.addAttribute("canzoni", canzoni); 
		return "song";
	}
	
	@GetMapping("titolo/{titolo}")
	public String hello2(@PathVariable("titolo") String titolo, Model m) {
		List<Canzone> canzoni = repo.findByTitoloContaining(titolo);
		m.addAttribute("canzoni", canzoni); 
		return "song";
	}
	
}
