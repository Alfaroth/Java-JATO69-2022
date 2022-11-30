package com.dave.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dave.model.Automobile;
import com.dave.service.AutomobiliService;

@RestController
@RequestMapping("api")
public class AutomobiliREST {
	
	@Autowired
	private AutomobiliService service;
	
	@GetMapping("automobili")
	public List<Automobile> getAll() {
		return service.getAll();
	}
	
	@PostMapping("automobili")
	public void addAuto(@RequestBody Automobile a) {
		service.addAuto(a);
	}

}
