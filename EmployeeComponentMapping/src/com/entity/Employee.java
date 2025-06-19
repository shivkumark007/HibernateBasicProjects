package com.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "EmpComponent")
public class Employee {
	
	@Id
	private int id;
	private String name;
	private double salary;
	@Embedded
	private Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
}
