package com.inheritance.app;

import java.util.Iterator;
import java.util.List;

import com.inheritance.dao.PaymentDAO;
import com.inheritance.dao.PaymentDAOImpl;
import com.inheritance.entity.Payment;

public class ReadCriteria {

	PaymentDAO dao = new PaymentDAOImpl();

	List<Payment> list = dao.getAllCreditt();

	Iterator<Payment> itr = list.iterator();

	while(itr.hasNext())
	{
		Payment pay = (Payment) itr.next();
	}
}
