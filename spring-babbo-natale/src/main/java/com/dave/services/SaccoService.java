package com.dave.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dave.dal.SaccoDAO;
import com.dave.entities.Sacco;

@Service
public class SaccoService {

	@Autowired
	private SaccoDAO dao;
	
	public List<Sacco> trovaTutti() {
		return dao.findAll();
	}
	
}
