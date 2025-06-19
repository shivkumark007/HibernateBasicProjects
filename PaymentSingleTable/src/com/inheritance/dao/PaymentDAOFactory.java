package com.inheritance.dao;

public class PaymentDAOFactory {

	public static PaymentDAO getInstance() {

		return new PaymentDAOImpl();
	}
}
