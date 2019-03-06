package com.amazon.crm.party.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * ExternalReference
 */
@Entity
@Table(name="external_ref_info", schema="party_schema")
@SequenceGenerator(name = "ext_ref_seq", sequenceName = "ext_ref_seq", allocationSize = 1)
public class ExternalReference   {
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
      private String href = null;

	  @Column(nullable = true)
      private String type = null;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

  
}

