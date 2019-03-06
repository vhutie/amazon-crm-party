package com.amazon.crm.party.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.crm.party.model.Organization;
import com.google.common.base.Optional;

public interface OrganizationRepository  extends JpaRepository<Organization, Long>{
	
	public List<Organization> findAllByOrderByOrganizationNameAsc();
	public Optional<Organization> findById(Long id);
	public void deleted(Long id);

}
