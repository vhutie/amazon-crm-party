package com.amazon.crm.party.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * IndividualIdentification
 */
@Entity
@Table(name="individual_ident_info", schema="party_schema")
@SequenceGenerator(name = "indiv_ident_seq", sequenceName = "indiv_ident_seq", allocationSize = 1)
public class IndividualIdentification   {
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
  private String type = null;
	  @Column(nullable = true)
  private String identificationId = null;
	  @Column(nullable = true)
  private String issuingAuthority = null;
	  @Column(nullable = true)
  private Date issuingDate = null;
	  @Column(nullable = true)
  private Date expiryDate = null;

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

public String getIdentificationId() {
	return identificationId;
}

public void setIdentificationId(String identificationId) {
	this.identificationId = identificationId;
}

public String getIssuingAuthority() {
	return issuingAuthority;
}

public void setIssuingAuthority(String issuingAuthority) {
	this.issuingAuthority = issuingAuthority;
}

public Date getIssuingDate() {
	return issuingDate;
}

public void setIssuingDate(Date issuingDate) {
	this.issuingDate = issuingDate;
}

public Date getExpiryDate() {
	return expiryDate;
}

public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}

 
}

