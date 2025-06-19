package com.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value = "CreditCard")
public class CreditCard extends Payment{
	
	private int cardNo;
	private String cardType;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CreditCard(int payId, double payAmt, Date date) {
		super(payId, payAmt, date);
		// TODO Auto-generated constructor stub
	}
	
	public CreditCard(int cardNo, String cardType) {
		super();
		this.cardNo = cardNo;
		this.cardType = cardType;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNo=" + cardNo + ", cardType=" + cardType + "]";
	}
}
