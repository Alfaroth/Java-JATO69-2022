package com.dave.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dave.dal.BimboDAO;
import com.dave.entities.Bimbo;

@Service
public class BimboService {

	@Autowired
	private BimboDAO dao;
	
	public List<Bimbo> trovaTutti() {
		return dao.findAll();
	}
	
}
