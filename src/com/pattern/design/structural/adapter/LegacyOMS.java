package com.pattern.design.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class LegacyOMS {

	/* The Legacy OMS accepts input in XML format */
	List cart = new ArrayList();
	List payments = new ArrayList();

	public void addItem(Item itemXml) {
		cart.add(itemXml);
		System.out.println(itemXml.getName() + " " + itemXml.getPrice());

	}

	public void makePayment(Payment paymentXml) {
		payments.add(paymentXml);
		paymentXml.pay();
	}
}
