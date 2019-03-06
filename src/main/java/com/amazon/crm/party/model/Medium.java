package com.amazon.crm.party.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Medium
 */
@Entity
@Table(name="medium_info", schema="party_schema")
@SequenceGenerator(name = "med_seq", sequenceName = "med_seq", allocationSize = 1)
public class Medium   {
	
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
  private String streetNumber = null;

	  @Column(nullable = true)
  private String suburb = null;

	  @Column(nullable = true)
  private String unitNumber = null;

	  @Column(nullable = true)
  private String complexName = null;

	  @Column(nullable = true)
  private String building = null;

	  @Column(nullable = true)
  private String buildingName = null;

	  @Column(nullable = true)
  private String floor = null;

	  @Column(nullable = true)
  private String poBox = null;

	  @Column(nullable = true)
  private String privateBag = null;

	  @Column(nullable = true)
  private String postNet = null;

	  @Column(nullable = true)
  private String longitude = null;

	  @Column(nullable = true)
  private String latitude = null;

	  @Column(nullable = true)
  private String externalID = null;

	  @Column(nullable = true)
  private String city = null;

	  @Column(nullable = true)
  private String country = null;

	  @Column(nullable = true)
  private String postcode = null;

	  @Column(nullable = true)
  private String stateOrProvince = null;

	  @Column(nullable = true)
  private String streetOne = null;

	  @Column(nullable = true)
  private String streetTwo = null;

	  @Column(nullable = true)
  private String emailAddress = null;

	  @Column(nullable = true)
  private String type = null;

	  @Column(nullable = true)
  private String number = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getComplexName() {
		return complexName;
	}

	public void setComplexName(String complexName) {
		this.complexName = complexName;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getPrivateBag() {
		return privateBag;
	}

	public void setPrivateBag(String privateBag) {
		this.privateBag = privateBag;
	}

	public String getPostNet() {
		return postNet;
	}

	public void setPostNet(String postNet) {
		this.postNet = postNet;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getStateOrProvince() {
		return stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}

	public String getStreetOne() {
		return streetOne;
	}

	public void setStreetOne(String streetOne) {
		this.streetOne = streetOne;
	}

	public String getStreetTwo() {
		return streetTwo;
	}

	public void setStreetTwo(String streetTwo) {
		this.streetTwo = streetTwo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


}

