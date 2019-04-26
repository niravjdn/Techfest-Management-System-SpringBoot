package com.convergence.TechfestManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "sem")
public class Sem {

	@Id
	private int id;
	
	public Sem(int id) {
		super();
		this.id = id;
	}
	
	public Sem(){
	}
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
