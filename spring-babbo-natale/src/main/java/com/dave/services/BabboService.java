package com.dave.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dave.dal.BabboDAO;
import com.dave.entities.Babbo;

@Service
public class BabboService {

	@Autowired
	private BabboDAO dao;
	
	public List<Babbo> trovaTutti() {
		return dao.findAll();
	}
	
}
