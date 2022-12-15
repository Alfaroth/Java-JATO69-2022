package com.dave.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dave.entities.Bimbo;

@Repository
public interface BimboDAO extends JpaRepository<Bimbo, Integer>{

}
