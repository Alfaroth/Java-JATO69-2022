package com.dave.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dave.entities.Sacco;

@Repository
public interface SaccoDAO extends JpaRepository<Sacco, Integer> {

}