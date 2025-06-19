package com.inheritance.dao;


import java.util.List;

import com.inheritance.entity.Cheque;
import com.inheritance.entity.CreditCard;
import com.inheritance.entity.Payment;

public interface PaymentDAO {

	void saveCard(CreditCard card);

	void saveCheque(Cheque cheque);
	
	List<Payment> getAllCredit();
	
	List<Payment> getAllCheque();
	
	List<String> getOnlyCardType();
	
	List<Object[]> getMultipleCol();
	List<Payment> getAllCreditt();
	
	
	
	


	
	
	
}
