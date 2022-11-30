package com.dave.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dave.model.Automobile;

@Repository
public interface AutomobiliDAO extends JpaRepository<Automobile, Integer>{

}
