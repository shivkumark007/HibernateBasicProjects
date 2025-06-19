package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "Course_Id")
	private int id;
	
	@Column(name = "Subject")
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "instructorid")
	private Instructor instructor;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String title, Instructor instructor) {
		super();
		this.id = id;
		this.title = title;
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", instructor=" + instructor + "]";
	}
}
