package com.dave.service;

import java.util.List;

import com.dave.model.Automobile;

public interface AutomobiliService {

	List<Automobile> getAll();
	Automobile getAutoById(int id);
	void addAuto(Automobile a);
	void delAuto(int id);
	void updAuto(Automobile a);
	
}
