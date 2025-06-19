package com.inheritance.dao;

import com.inheritance.entity.Cheque;
import com.inheritance.entity.CreditCard;

public interface PaymentDAO {
	
	void saveCreditCard(CreditCard card);
	
	void saveCheque(Cheque cheque);
}
