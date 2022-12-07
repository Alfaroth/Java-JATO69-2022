package com.dave.dal;

import org.springframework.data.repository.CrudRepository;

import com.dave.entities.Viaggio;

public interface ViaggioDAO extends CrudRepository<Viaggio, Integer> {

}
