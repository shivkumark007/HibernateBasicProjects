package com.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name = "Hospital")

public class Hospital implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "Id")
	private int id;
	
	@Column (name = "Name")
	private String name;
	
	@Column (name = "Email")
	private String email;
	
	@Column (name = "Date")
	private Date date;
	
	@Column (name = "Dr_Name")
	private String drname;
	
	@Column (name = "Symptoms")
	private String symptoms;
	
	public Hospital() {
		
	}
	public Hospital(int id, String name, String email, Date date, String drname, String symptoms) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.date = date;
		this.drname = drname;
		this.symptoms = symptoms;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDrname() {
		return drname;
	}
	public void setDrname(String drname) {
		this.drname = drname;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", email=" + email + ", date=" + date + ", drname=" + drname
				+ ", symptoms=" + symptoms + "]";
	}
}
