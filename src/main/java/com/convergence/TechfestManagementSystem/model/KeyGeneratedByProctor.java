package com.convergence.TechfestManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "keygeneratedbyproctor")
public class KeyGeneratedByProctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String enrollmentNo;
	private boolean isRegistered;
	//proctor Name - username
	private String addedBy;
	
	public KeyGeneratedByProctor(String enrollmentNo, boolean isRegistered, String addedBy) {
		super();
		this.id = id;
		this.enrollmentNo = enrollmentNo;
		this.isRegistered = isRegistered;
		this.addedBy = addedBy;
	}

	public KeyGeneratedByProctor(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
}
