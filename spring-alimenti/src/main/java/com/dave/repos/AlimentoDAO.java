package com.dave.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dave.entities.Alimento;

public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {

}
