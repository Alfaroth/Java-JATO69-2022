package com.dave.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dave.dal.DonoDAO;
import com.dave.entities.Dono;

@Service
public class DonoService {

	@Autowired
	private DonoDAO dao;
	
	public List<Dono> trovaTutti() {
		return dao.findAll();
	}
	
}
