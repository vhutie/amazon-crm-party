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
 * OrganizationChildRelationship
 */
@Entity
@Table(name="organization_child_rel", schema="party_schema")
@SequenceGenerator(name = "org_chil_rel_seq", sequenceName = "org_chil_rel_seq", allocationSize = 1)
public class OrganizationChildRelationship   {
	
	@Column(nullable = true)
  private String relationshipType = null;

  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = true)
  private String href = null;
 
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "VALIDFOR_ID")
  private ValidFor validFor = null;

public String getRelationshipType() {
	return relationshipType;
}

public void setRelationshipType(String relationshipType) {
	this.relationshipType = relationshipType;
}

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

public ValidFor getValidFor() {
	return validFor;
}

public void setValidFor(ValidFor validFor) {
	this.validFor = validFor;
}

  

}

