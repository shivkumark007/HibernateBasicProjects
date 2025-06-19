package com.inheritance.dao;

import com.inheritance.entity.Cheque;
import com.inheritance.entity.CreditCard;

public interface PaymentDAO {
	
	void saveCard(CreditCard card);
	
	void saveCheque(Cheque cheque);

}
