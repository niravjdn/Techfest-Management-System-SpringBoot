package com.convergence.TechfestManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

@Entity
@Table(name = "keygeneratedbycampaigner")
public class KeyGeneratedByCampaigner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Email
	private String email;
	private String name;
	

	private String mobileNo;
	
	@ManyToOne
	private College college;
	
	private boolean isRegistered;
	//campaigner Name - username
	private String addedBy;
	
	@Min(8)
	private String key;

	public KeyGeneratedByCampaigner(long id, String email, String mobileNo, College college, boolean isRegistered,
			String addedBy, String key) {
		super();
		this.id = id;
		this.email = email;
		this.mobileNo = mobileNo;
		this.college = college;
		this.isRegistered = isRegistered;
		this.addedBy = addedBy;
		this.key = key;
	}

	public KeyGeneratedByCampaigner(){
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
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

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
