package com.dave.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dave.entities.Consegna;

@Repository
public interface ConsegnaDAO extends JpaRepository<Consegna, Integer> {

	String TROVA_TUTTI = "select bimbi.nome, doni.nome, sacchi.numero from bimbi, doni, sacchi_doni, sacchi where bimbi.consegna_id = doni.consegna_id and sacchi_doni.sacco_id = sacchi.id and sacchi_doni.dono_id = doni.id;";
	
	@Query(value = TROVA_TUTTI, nativeQuery = true)
	String[] getBimbiDoniSacchi();
}
