package com.inheritance.entity;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Payment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PMODE", discriminatorType = DiscriminatorType.STRING)

public class Payment {
	@Id
	private int payId;
	private double payAmt;
	private Date payDate;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int payId, double payAmt, Date payDate) {
		super();
		this.payId = payId;
		this.payAmt = payAmt;
		this.payDate = payDate;
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

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	@Override
	public String toString() {
		return "Payment [payId=" + payId + ", payAmt=" + payAmt + ", payDate=" + payDate + "]";
	}
}
