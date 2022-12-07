package com.dave.dal;

import org.springframework.data.repository.CrudRepository;

import com.dave.entities.Documento;

public interface DocumentoDAO extends CrudRepository<Documento, Integer> {

}
