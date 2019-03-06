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
 * ContactMedium
 */
@Entity
@Table(name="contact_medium_seq_info", schema="party_schema")
@SequenceGenerator(name = "contact_medium_seq", sequenceName = "contact_medium_seq", allocationSize = 1)
public class ContactMedium   {
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
  private String type = null;

	  @OneToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "VALIDFOR_ID")
  private ValidFor validFor = null;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "MEDIUM_ID")
  private Medium medium = null;

  @Column(nullable = true)
  private String preferred = null;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public ValidFor getValidFor() {
	return validFor;
}

public void setValidFor(ValidFor validFor) {
	this.validFor = validFor;
}

public Medium getMedium() {
	return medium;
}

public void setMedium(Medium medium) {
	this.medium = medium;
}

public String getPreferred() {
	return preferred;
}

public void setPreferred(String preferred) {
	this.preferred = preferred;
}

 

}

