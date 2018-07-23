package com.pattern.design.behavioral.command.commands;

import com.pattern.design.behavioral.command.objects.Dessert;

public class OrderDessert implements Command {

	private Dessert coupon;

	public OrderDessert(Dessert c) {
		coupon = c;
	}

	@Override
	public void execute() {
		coupon.order();
	}

}
