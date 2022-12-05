package com.dave.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dave.entities.Alimento;
import com.dave.repos.AlimentoDAO;

@Service
public class AlimentoServiceImpl implements AlimentoService {

	@Autowired
	private AlimentoDAO repo;
	
	@Override
	public Alimento addAlimento(Alimento a) {
		return repo.save(a);
	}

	@Override
	public Alimento updateAlimento(Alimento a) {
		return repo.save(a);
	}

	@Override
	public boolean deleteAlimentoById(int id) {
		return false;
	}

	@Override
	public List<Alimento> getAlimenti() {
		return repo.findAll();
	}

	@Override
    public Alimento getAlimentoById(int id) {
        return repo.findById(id).get();
    }

	@Override
	public List<Alimento> getAlimentiByCat(String categoria) {
		return null;
	}

}
