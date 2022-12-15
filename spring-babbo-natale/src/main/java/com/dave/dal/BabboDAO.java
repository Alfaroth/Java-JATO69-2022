package com.dave.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dave.entities.Babbo;

@Repository
public interface BabboDAO extends JpaRepository<Babbo, Integer> {

}
