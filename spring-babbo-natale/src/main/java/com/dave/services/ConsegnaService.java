package com.dave.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dave.dal.ConsegnaDAO;
import com.dave.entities.Consegna;

@Service
public class ConsegnaService {

	@Autowired
	private ConsegnaDAO dao;
	
	public List<Consegna> trovaTutti() {
		return dao.findAll();
	}
	
	public String[] trovaBimbiDoniSacchi() {
		return dao.getBimbiDoniSacchi();
	}
	
}
