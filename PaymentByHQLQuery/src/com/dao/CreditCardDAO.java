package com.dao;

import java.util.List;

import com.entity.CreditCard;


public interface CreditCardDAO {
	
	void saveCreditCard(CreditCard card);
		
	void updateCreditCard(CreditCard card);
	
	void deleteCreditCard(int id);
	
	CreditCard getCreditCardById(int id);
	
	List<CreditCard> getAllCards();	
}
