package com.dave.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dave.model.Automobile;
import com.dave.repos.AutomobiliDAO;

@Service
public class AutomobiliServiceImpl implements AutomobiliService {

	@Autowired
	private AutomobiliDAO repo;
	
	@Override
    public List<Automobile> getAll() {
        return repo.findAll();
    }

	@Override
	public Automobile getAutoById(int id) {
		return null;
	}

	@Override
    public void addAuto(Automobile a) {
        repo.save(a);
    }

	@Override
	public void delAuto(int id) {
	}

	@Override
	public void updAuto(Automobile a) {
		repo.save(a);
	}

}
