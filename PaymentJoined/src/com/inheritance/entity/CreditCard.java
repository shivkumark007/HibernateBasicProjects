package com.inheritance.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CreditCard")
@PrimaryKeyJoinColumn(name = "pid")
public class CreditCard extends Payment{
	
	private int cardNum;
	private String cardType;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(int cardNum, String cardType) {
		super();
		this.cardNum = cardNum;
		this.cardType = cardType;
	}
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNum=" + cardNum + ", cardType=" + cardType + "]";
	}
	
	

}
