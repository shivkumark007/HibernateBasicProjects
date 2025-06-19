package com.inheritance.app;

import java.util.Date;

import com.inheritance.dao.PaymentDAO;
import com.inheritance.dao.PaymentDAOFactory;
import com.inheritance.entity.Cheque;
import com.inheritance.entity.CreditCard;

public class App {
	
	public static void main(String[] args) {
		
		PaymentDAO dao=PaymentDAOFactory.getInstance();
		
		CreditCard card=new CreditCard();
		card.setPayId(1111);
		card.setPayAmt(10000);
		card.setPayDate(new Date(2022, 8, 25));
		card.setCardNum(11111111);
		card.setCardType("MAESTRO");
	
	  dao.saveCard(card);
	  
	  System.out.println("----------CARD SAVED------------------");
	  
	  Cheque ch=new Cheque();
	  ch.setPayId(2222);
	  ch.setPayAmt(20000);
	  ch.setPayDate(new Date(2022,7,25));
	  ch.setChequeNo(22222222);
	  ch.setChequeType("Order");
	  dao.saveCheque(ch);
	  
	  System.out.println("-------------CHEQUE SAVED--------------------");
	}
}
