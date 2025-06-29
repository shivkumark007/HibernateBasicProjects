package com.inheritance.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Cheque")
@PrimaryKeyJoinColumn(name = "pid")
public class Cheque extends Payment{
	
	private int chequeNo;
	private String chequeType;
	
	public Cheque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cheque(int chequeNo, String chequeType) {
		super();
		this.chequeNo = chequeNo;
		this.chequeType = chequeType;
	}
	public int getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	@Override
	public String toString() {
		return "Cheque [chequeNo=" + chequeNo + ", chequeType=" + chequeType + "]";
	}
}
