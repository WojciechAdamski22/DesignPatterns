package com.pattern.design.behavioral.command.commands;

import com.pattern.design.behavioral.command.objects.MainDish;

public class CancelMainDish implements Command {

	private MainDish item;

	public CancelMainDish(MainDish i) {
		item = i;
	}

	@Override
	public void execute() {
		item.cancel();
	}

}