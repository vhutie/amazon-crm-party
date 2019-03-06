package com.amazon.crm.party.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Individual
 */
@Entity
@Table(name="individual_info", schema="party_schema")
@SequenceGenerator(name = "indi_seq", sequenceName = "indi_seq", allocationSize = 1)
public class Individual   {
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
  private String href = null;
	  @Column(nullable = true)
  private String gender = null;
	  @Column(nullable = true)
  private String placeOfBirth = null;
	  @Column(nullable = true)
  private String countryOfBirth = null;
	  @Column(nullable = true)
  private String nationality = null;
	  @Column(nullable = true)
  private String maritalStatus = null;
	  @Column(nullable = true)
  private Date birthDate = null;
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
  @Column(nullable = true)
  private String location = null;
  @Column(nullable = true)
  private String status = null;

  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "INDIVIDUAL_DISABILITY", joinColumns = {
 			@JoinColumn(name = "INDIVIDUAL_ID") }, inverseJoinColumns = { @JoinColumn(name = "DISABILITY_ID") })
  private List<Disability> disability = null;

  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "INDIVIDUAL_CHARACTERISTIC", joinColumns = {
 			@JoinColumn(name = "INDIVIDUAL_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHARACTERISTIC_ID") })
  private List<Characteristic> characteristic = null;

  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "INDIVIDUAL_OTHERNAME", joinColumns = {
 			@JoinColumn(name = "INDIVIDUAL_ID") }, inverseJoinColumns = { @JoinColumn(name = "OTHERNAME_ID") })
  private List<OtherName> otherName = null;

  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "INDIVIDUAL_INDIVIDUALIDENT", joinColumns = {
 			@JoinColumn(name = "INDIVIDUAL_ID") }, inverseJoinColumns = { @JoinColumn(name = "INDIVIDUALIDENT_ID") })
  private List<IndividualIdentification> individualIdentification = null;

  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "INDIVIDUAL_EXTERNALREF", joinColumns = {
 			@JoinColumn(name = "INDIVIDUAL_ID") }, inverseJoinColumns = { @JoinColumn(name = "EXTERNALREF_ID") })
  private List<ExternalReference> externalReference = null;

  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "INDIVIDUAL_RELATEDPARTY", joinColumns = {
 			@JoinColumn(name = "INDIVIDUAL_ID") }, inverseJoinColumns = { @JoinColumn(name = "RELATEDPARTY_ID") })
  private List<RelatedParty> relatedParty = null;

  @OneToMany(fetch = FetchType.LAZY)
 	@JoinTable(schema = "party_schema", name = "INDIVIDUAL_CONT_MED", joinColumns = {
 			@JoinColumn(name = "INDIVIDUAL_ID") }, inverseJoinColumns = { @JoinColumn(name = "CONT_MED_ID") })
  private List<ContactMedium> contactMedium = null;

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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getPlaceOfBirth() {
	return placeOfBirth;
}

public void setPlaceOfBirth(String placeOfBirth) {
	this.placeOfBirth = placeOfBirth;
}

public String getCountryOfBirth() {
	return countryOfBirth;
}

public void setCountryOfBirth(String countryOfBirth) {
	this.countryOfBirth = countryOfBirth;
}

public String getNationality() {
	return nationality;
}

public void setNationality(String nationality) {
	this.nationality = nationality;
}

public String getMaritalStatus() {
	return maritalStatus;
}

public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}

public Date getBirthDate() {
	return birthDate;
}

public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
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

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public List<Disability> getDisability() {
	return disability;
}

public void setDisability(List<Disability> disability) {
	this.disability = disability;
}

public List<Characteristic> getCharacteristic() {
	return characteristic;
}

public void setCharacteristic(List<Characteristic> characteristic) {
	this.characteristic = characteristic;
}

public List<OtherName> getOtherName() {
	return otherName;
}

public void setOtherName(List<OtherName> otherName) {
	this.otherName = otherName;
}

public List<IndividualIdentification> getIndividualIdentification() {
	return individualIdentification;
}

public void setIndividualIdentification(List<IndividualIdentification> individualIdentification) {
	this.individualIdentification = individualIdentification;
}

public List<ExternalReference> getExternalReference() {
	return externalReference;
}

public void setExternalReference(List<ExternalReference> externalReference) {
	this.externalReference = externalReference;
}

public List<RelatedParty> getRelatedParty() {
	return relatedParty;
}

public void setRelatedParty(List<RelatedParty> relatedParty) {
	this.relatedParty = relatedParty;
}

public List<ContactMedium> getContactMedium() {
	return contactMedium;
}

public void setContactMedium(List<ContactMedium> contactMedium) {
	this.contactMedium = contactMedium;
}





}

