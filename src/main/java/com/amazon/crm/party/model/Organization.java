package com.amazon.crm.party.model;

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
 * Organization
 */
@Entity
@Table(name="organization_info", schema="party_schema")
@SequenceGenerator(name = "org_seq", sequenceName = "org_seq", allocationSize = 1)
public class Organization   {
  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = true)
  private String href;

  @Column(nullable = true)
  private String isLegalEntity;

  @Column(nullable = true)
  private String type;
 
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EXISTSDURING_ID")
  private ExistsDuring existsDuring;

  @Column(nullable = true)
  private String tradingName;

  @Column(nullable = true)
  private String organizationName;

  @Column(nullable = true)
  private String nameType;

  @Column(nullable = true)
  private String status;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "OTHERNAME_ID")
  private OtherName otherName;
 
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CHARACTERISTIC_ID")
  private Characteristic characteristic;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ORGANIZATIONIDENT_ID") 
  private OrganizationIdentification organizationIdentification;

  @OneToMany(fetch = FetchType.LAZY)
	@JoinTable(schema = "party_schema", name = "ORGANIZATION_EXTERNALREF", joinColumns = {
			@JoinColumn(name = "ORGANIZATION_ID") }, inverseJoinColumns = { @JoinColumn(name = "EXTERNALREF_ID") })
  private List<ExternalReference> externalReference;
 
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "RELATEDPARTY_ID")
  private RelatedParty relatedParty;
  
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ORG_PAREN_RELAT_ID")
  private OrganizationParentRelationship organizationParentRelationship;
  
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ORG_CHILD_RELAT_ID")
  private OrganizationChildRelationship organizationChildRelationship;

  @OneToMany(fetch = FetchType.LAZY)
	@JoinTable(schema = "party_schema", name = "ORGANIZATION_CONTACTMEDIUM", joinColumns = {
			@JoinColumn(name = "ORGANIZATION_ID") }, inverseJoinColumns = { @JoinColumn(name = "CONTACTMEDIUM_ID") })
  private List<ContactMedium> contactMedium;

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

public String getIsLegalEntity() {
	return isLegalEntity;
}

public void setIsLegalEntity(String isLegalEntity) {
	this.isLegalEntity = isLegalEntity;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public ExistsDuring getExistsDuring() {
	return existsDuring;
}

public void setExistsDuring(ExistsDuring existsDuring) {
	this.existsDuring = existsDuring;
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

public String getNameType() {
	return nameType;
}

public void setNameType(String nameType) {
	this.nameType = nameType;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public OtherName getOtherName() {
	return otherName;
}

public void setOtherName(OtherName otherName) {
	this.otherName = otherName;
}

public Characteristic getCharacteristic() {
	return characteristic;
}

public void setCharacteristic(Characteristic characteristic) {
	this.characteristic = characteristic;
}

public OrganizationIdentification getOrganizationIdentification() {
	return organizationIdentification;
}

public void setOrganizationIdentification(OrganizationIdentification organizationIdentification) {
	this.organizationIdentification = organizationIdentification;
}

public List<ExternalReference> getExternalReference() {
	return externalReference;
}

public void setExternalReference(List<ExternalReference> externalReference) {
	this.externalReference = externalReference;
}

public RelatedParty getRelatedParty() {
	return relatedParty;
}

public void setRelatedParty(RelatedParty relatedParty) {
	this.relatedParty = relatedParty;
}

public OrganizationParentRelationship getOrganizationParentRelationship() {
	return organizationParentRelationship;
}

public void setOrganizationParentRelationship(OrganizationParentRelationship organizationParentRelationship) {
	this.organizationParentRelationship = organizationParentRelationship;
}

public OrganizationChildRelationship getOrganizationChildRelationship() {
	return organizationChildRelationship;
}

public void setOrganizationChildRelationship(OrganizationChildRelationship organizationChildRelationship) {
	this.organizationChildRelationship = organizationChildRelationship;
}

public List<ContactMedium> getContactMedium() {
	return contactMedium;
}

public void setContactMedium(List<ContactMedium> contactMedium) {
	this.contactMedium = contactMedium;
}




}

