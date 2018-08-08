package com.pattern.design.structural.adapter;

import java.math.BigDecimal;

public class AdapterClient {

	public static void main(String[] args) {
		//LegacyOMS oms = new LegacyOMS();
		OMSAdapter oms = new OMSAdapter();
		oms.addItem(new Item("Italian Pizza", new BigDecimal("6.99")));
		oms.addItem(new Item("Wine", new BigDecimal("9.99")));
		oms.addItem(new Item("Beer", new BigDecimal("5.99")));
		oms.addItem(new Item("Red Apple", new BigDecimal("1.09")));
		oms.addItem(new Item("Almonds", new BigDecimal("11.99")));

		System.out.println("------------------------------------");

		oms.makePayment(new Payment("CASH", new BigDecimal("20.00")));
		oms.makePayment(new Payment("CREDIT", new BigDecimal("10.00")));
		oms.makePayment(new Payment("DEBIT", new BigDecimal("10.00")));
	}

}
