package com.pattern.design.behavioral.command.commands;

import com.pattern.design.behavioral.command.objects.MainDish;

public class OrderMainDish implements Command {

	private MainDish item;

	public OrderMainDish(MainDish i) {
		item = i;
	}

	@Override
	public void execute() {
		item.order();
	}

}