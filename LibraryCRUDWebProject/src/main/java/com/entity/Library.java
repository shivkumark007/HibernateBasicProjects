package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Lib")

public class Library implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column (name = "B_Id")
	private int id;
	
	@Column (name = "B_Name")
	private String name;
	
	@Column (name = "B_Price")
	private double price;
	
	public Library() {
		
	}
	public Library(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
