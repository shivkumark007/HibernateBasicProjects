package com.inheritance.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "Payment")
public class Payment {
	@Id
	@Column(name = "pid")
	private int payid;
	private double payAmt;
	private Date date;
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Payment(int payid, double payAmt, Date date) {
		super();
		this.payid = payid;
		this.payAmt = payAmt;
		this.date = date;
	}
	
	public int getPayid() {
		return payid;
	}
	public void setPayid(int payid) {
		this.payid = payid;
	}
	public double getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(double payAmt) {
		this.payAmt = payAmt;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Payment [payid=" + payid + ", payAmt=" + payAmt + ", date=" + date + "]";
	}
}
