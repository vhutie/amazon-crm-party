package com.amazon.crm.party.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * ExistsDuring
 */
@Entity
@Table(name="exists_during_info", schema="party_schema")
@SequenceGenerator(name = "exi_dur_seq", sequenceName = "exi_dur_seq", allocationSize = 1)
public class ExistsDuring   {
	  @Id
	  @GeneratedValue
	  private Long id;

	  @Column(nullable = true)
      private Date startDateTime ;

	  @Column(nullable = true)
      private Date endDateTime;

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

