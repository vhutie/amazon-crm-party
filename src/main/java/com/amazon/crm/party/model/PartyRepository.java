package com.amazon.crm.party.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.base.Optional;

public interface PartyRepository extends JpaRepository<PartyInformation, Long>{
	
	public List<PartyInformation> findAllByOrderByCreationDateDesc();
	public Optional<PartyInformation> findById(Long id);
	

}
