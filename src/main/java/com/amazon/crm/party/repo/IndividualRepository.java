package com.amazon.crm.party.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.crm.party.model.Individual;
import com.google.common.base.Optional;

public interface IndividualRepository  extends JpaRepository<Individual, Long>{
	
	public List<Individual> findAllByOrderByFullNameAsc();
	public Optional<Individual> findById(Long id);

}
