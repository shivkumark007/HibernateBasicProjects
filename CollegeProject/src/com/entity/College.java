package com.entity;

import java.io.Serializable;

public class College implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int rating;
	
	public College(int id, String name, int rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	
	public College() {
		
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
}
