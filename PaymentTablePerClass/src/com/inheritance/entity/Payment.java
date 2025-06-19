package com.inheritance.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int payId;
	private double payAmt;
	private Date date;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int payId, double payAmt, Date date) {
		super();
		this.payId = payId;
		this.payAmt = payAmt;
		this.date = date;
	}

	public int getPayId() {
		return payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
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
		return "Payment [payId=" + payId + ", payAmt=" + payAmt + ", date=" + date + "]";
	}
}
