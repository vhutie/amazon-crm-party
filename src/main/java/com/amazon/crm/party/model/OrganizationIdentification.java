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
 * OrganizationIdentification
 */
@Entity
@Table(name="organization_ident_info", schema="party_schema")
@SequenceGenerator(name = "org_ident_seq", sequenceName = "org_ident_seq", allocationSize = 1)
public class OrganizationIdentification   {
	
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
  private String type ;
	  @Column(nullable = true)
  private String identificationId ;
	  @Column(nullable = true)
  private String issuingAuthority ;
	  @Column(nullable = true)
  private String issuingDate ;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "VALIDFOR_ID")
  private ValidFor validFor ;

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

public String getIssuingDate() {
	return issuingDate;
}

public void setIssuingDate(String issuingDate) {
	this.issuingDate = issuingDate;
}

public ValidFor getValidFor() {
	return validFor;
}

public void setValidFor(ValidFor validFor) {
	this.validFor = validFor;
}

  
}

