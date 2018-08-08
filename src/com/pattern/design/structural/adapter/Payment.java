package com.pattern.design.structural.adapter;

import java.math.BigDecimal;

public class Payment {
	private String type;
	private BigDecimal amount;

	public Payment(String type, BigDecimal amount) {
		this.type = type;
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void pay() {
		System.out.println(type + " " + amount + "$");
	}
}
