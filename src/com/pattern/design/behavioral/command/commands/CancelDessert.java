package com.pattern.design.behavioral.command.commands;

import com.pattern.design.behavioral.command.objects.Dessert;

public class CancelDessert implements Command {

	private Dessert coupon;

	public CancelDessert(Dessert c) {
		coupon = c;
	}

	@Override
	public void execute() {
		coupon.cancel();
	}

}
