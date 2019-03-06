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
 * OtherName
 */
@Entity
@Table(name="other_name_info", schema="party_schema")
@SequenceGenerator(name = "oth_nam_seq", sequenceName = "oth_nam_seq", allocationSize = 1)
public class OtherName   {
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
  private String title = null;
	  @Column(nullable = true)
  private String givenName = null;
	  @Column(nullable = true)
  private String familyName = null;
	  @Column(nullable = true)
  private String middleName = null;
	  @Column(nullable = true)
  private String fullName = null;
	  @Column(nullable = true)
  private String formattedName = null;
	  @OneToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "VALIDFOR_ID")
  private ValidFor validFor = null;
  @Column(nullable = true)
  private String nameType = null;
  @Column(nullable = true)
  private String tradingName = null;
  @Column(nullable = true)
  private String organizationName = null;

  
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getGivenName() {
	return givenName;
}

public void setGivenName(String givenName) {
	this.givenName = givenName;
}

public String getFamilyName() {
	return familyName;
}

public void setFamilyName(String familyName) {
	this.familyName = familyName;
}

public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getFormattedName() {
	return formattedName;
}

public void setFormattedName(String formattedName) {
	this.formattedName = formattedName;
}

public ValidFor getValidFor() {
	return validFor;
}

public void setValidFor(ValidFor validFor) {
	this.validFor = validFor;
}

public String getNameType() {
	return nameType;
}

public void setNameType(String nameType) {
	this.nameType = nameType;
}

public String getTradingName() {
	return tradingName;
}

public void setTradingName(String tradingName) {
	this.tradingName = tradingName;
}

public String getOrganizationName() {
	return organizationName;
}

public void setOrganizationName(String organizationName) {
	this.organizationName = organizationName;
}

  
 
}

