package com.dave.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dave.entities.Dono;

@Repository
public interface DonoDAO extends JpaRepository<Dono, Integer> {
	
}
