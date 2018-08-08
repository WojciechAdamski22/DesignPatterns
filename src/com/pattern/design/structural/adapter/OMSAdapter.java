package com.pattern.design.structural.adapter;

public class OMSAdapter {

	private NewOMS newOMS;

	public OMSAdapter() {
		newOMS = new NewOMS();
	}

	public void addItem(Item item) {
		convertXmlToJson(item);
		newOMS.addToCart(item);
	}

	public void makePayment(Payment payment) {
		convertXmlToJson(payment);
		newOMS.pay(payment);
	}

	private void convertXmlToJson(Object o) {
		System.out.println("Converted from XML to JSON");
	}
}