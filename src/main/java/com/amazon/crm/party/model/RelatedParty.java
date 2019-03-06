package com.amazon.crm.party.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * RelatedParty
 */
@Entity
@Table(name="relatedparty_info", schema="party_schema")
@SequenceGenerator(name = "rel_part_seq", sequenceName = "rel_part_seq", allocationSize = 1)

public class RelatedParty   {
	
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
  private String href = null;
	  @Column(nullable = true)
  private String role = null;
	  @Column(nullable = true)
  private String name = null;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "VALIDFOR_ID")
  private ValidFor validFor = null;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getHref() {
	return href;
}

public void setHref(String href) {
	this.href = href;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public ValidFor getValidFor() {
	return validFor;
}

public void setValidFor(ValidFor validFor) {
	this.validFor = validFor;
}

  
}

