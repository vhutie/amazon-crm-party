package com.amazon.crm.party.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Disability
 */
@Entity
@Table(name="disability_info", schema="party_schema")
@SequenceGenerator(name = "dis_seq", sequenceName = "dis_seq", allocationSize = 1)
public class Disability   {
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
      private String disability = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

  
  
}

