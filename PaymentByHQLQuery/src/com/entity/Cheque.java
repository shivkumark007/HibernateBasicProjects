package com.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value = "Cheque")
public class Cheque extends Payment{
	
	private int chequeNo;
	private String chequeType;
	
	public Cheque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cheque(int payId, double payAmt, Date date) {
		super(payId, payAmt, date);
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
