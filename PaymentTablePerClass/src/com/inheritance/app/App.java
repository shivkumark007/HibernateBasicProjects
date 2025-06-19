package com.inheritance.app;

import java.util.Date;

import com.inheritance.dao.PaymentDAO;
import com.inheritance.dao.PaymentDAOFactory;
import com.inheritance.entity.Cheque;
import com.inheritance.entity.CreditCard;

public class App {
	public static void main(String args[]) {

		PaymentDAO dao = PaymentDAOFactory.getInstance();

		CreditCard card = new CreditCard();

		card.setPayAmt(500000);
		card.setDate(new Date(2024 , 5 , 12));
		card.setCardNo(23445);
		card.setCardType("Visa");

		dao.saveCard(card);

		System.out.println("Card Details Inserted");

		Cheque cheque = new Cheque();

		//cheque.setPayId(102);
		cheque.setPayAmt(700000);
		cheque.setDate(new Date(2025 ,1 , 15));
		cheque.setChequeNo(349810082);
		cheque.setChequeType("Self");

		dao.saveCheque(cheque);

		System.out.println("Cheque Details Inserted: ");

	}

}
