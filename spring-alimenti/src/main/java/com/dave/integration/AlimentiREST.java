package com.dave.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dave.entities.Alimento;
import com.dave.services.AlimentoService;

import jakarta.websocket.server.PathParam;

@RestController
public class AlimentiREST {

	@Autowired
	private AlimentoService service;
	
	@GetMapping("api/alimenti")
	public List<Alimento> trovaTutti() {
		return service.getAlimenti();
	}
	
	@GetMapping("api/alimenti/{id}") 
	public Alimento trovaUno(@PathParam("id") int id) {
		System.out.println(id);
		return service.getAlimentoById(id);
	}

	@PostMapping("api/alimenti")
	public Alimento addUno(@RequestBody Alimento a) {
		return service.addAlimento(a);
	}
	
	@PostMapping("api/alimenti")
	public Alimento updateUno(@RequestBody Alimento a) {
		return service.updateAlimento(a);
	}
	
}
