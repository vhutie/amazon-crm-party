package com.amazon.crm.party.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Characteristic
 */
@Entity
@Table(name="characteristics_info", schema="party_schema")
@SequenceGenerator(name = "char_seq", sequenceName = "char_seq", allocationSize = 1)
public class Characteristic   {
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
	  private String name = null;

	  @Column(nullable = true)
  private String value = null;


  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

 
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}

