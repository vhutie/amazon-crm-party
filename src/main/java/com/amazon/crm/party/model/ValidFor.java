package com.amazon.crm.party.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * ValidFor
 */
@Entity
@Table(name="valid_for_info", schema="party_schema")
@SequenceGenerator(name = "val_for_seq", sequenceName = "val_for_seq", allocationSize = 1)
public class ValidFor   {
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
  private Date startDateTime = null;
	  @Column(nullable = true)
  private Date endDateTime = null;

public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

public Date getStartDateTime() {
	return startDateTime;
}

public void setStartDateTime(Date startDateTime) {
	this.startDateTime = startDateTime;
}

public Date getEndDateTime() {
	return endDateTime;
}

public void setEndDateTime(Date endDateTime) {
	this.endDateTime = endDateTime;
}
  
  
  

  
}

