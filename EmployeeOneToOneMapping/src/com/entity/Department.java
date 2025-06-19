package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dId;

	@Column(name = "DeptName")
	private String name;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Department(int dId, String name) {
		super();
		this.dId = dId;
		this.name = name;
	}


	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", name=" + name + "]";
	}
}
